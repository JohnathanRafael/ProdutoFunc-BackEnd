package br.weg.vaProgWeb.service.impl;

import br.ueg.prog.webi.api.exception.BusinessException;
import br.ueg.prog.webi.api.service.BaseCrudService;
import br.weg.vaProgWeb.exception.SistemaMessageCode;
import br.weg.vaProgWeb.model.ProdutoModel;
import br.weg.vaProgWeb.model.TelefoneModel;
import br.weg.vaProgWeb.repository.ProdutoRepository;
import br.weg.vaProgWeb.service.ProdutoService;
import org.apache.logging.log4j.util.Strings;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static br.weg.vaProgWeb.exception.SistemaMessageCode.ERRO_TELEFONE_INVALIDO;

@Service
public class ProdutoServiceImpl extends BaseCrudService<ProdutoModel, Long, ProdutoRepository> implements ProdutoService {

    // URL de envio para API
    public static final String URL_POST = "http://localhost:5000/send";
    public static final String URL_GET = "http://localhost:5000/status";

    @Override
    protected void prepararParaIncluir(ProdutoModel entidade) {
        entidade.setStatusProduto("ATIVO");
        entidade.setProdutolancamento(LocalDate.now());
    }

    @Override
    protected void validarDados(ProdutoModel entidade) {

    }

    @Override
    protected void validarCamposObrigatorios(ProdutoModel entidade) {
        if(Objects.isNull(entidade)){
            throw new BusinessException(SistemaMessageCode.ERRO_CAMPOS_OBRIGATORIOS);
        }

        List<String> erros = new ArrayList<>();

        if(Strings.isEmpty(entidade.getProdutoNome())){
            erros.add("Nome do produto é obrigatório");
        }

        if(entidade.getProdutoValorVenda() == null) {
            erros.add("Valor de venda é obrigatório");
        }

        if(entidade.getProdutoValorCusto() == null) {
            erros.add("Valor de custo é obrigatório");
        }

        if(!erros.isEmpty()){
            throw  new BusinessException(SistemaMessageCode.ERRO_CAMPOS_OBRIGATORIOS);
        }
    }

    public TelefoneModel enviarMensagem(Long produtoCodigo, TelefoneModel telefone) {
        validarTelefone(telefone);
        String numeroNovo = converterNumeroParaEnvio(telefone);
        System.out.println(numeroNovo);
        telefone.setLinkTelefone(montarLink(produtoCodigo, numeroNovo));
        return telefone;
    }

    private String converterNumeroParaEnvio(TelefoneModel telefone) {
        char[] converteNumero = telefone.getNumeroTelefone().toCharArray();
        char[] numeroConvertido = new char[converteNumero.length - 1];
        int index = 2;
        for(int X=0;X < converteNumero.length; X++)
        {
            if(X != 2 && X < 2) {
                numeroConvertido[X] = converteNumero[X];
            }
            else if(X != 2 && X > 2){
                numeroConvertido[index] = converteNumero[X];
                index++;
            }
        }
        System.out.println(numeroConvertido.toString());
        return new String(numeroConvertido);
    }

    private void validarTelefone(TelefoneModel telefone) {
        if(telefone.getNumeroTelefone().length() > 11){
            throw new BusinessException(ERRO_TELEFONE_INVALIDO);
        }
        if(telefone.getNumeroTelefone().length() < 11){
            throw new BusinessException(ERRO_TELEFONE_INVALIDO);
        }
    }

    private String montarLink(Long produtoCodigo, String telefone) {
        String produtoNomeMensagem = "";

        ProdutoModel produto = super.obterPeloId(produtoCodigo);
        System.out.println("Telefone " + telefone + "codigo" + produto.getProdutoCodigo());
        String[] partes = produto.getProdutoNome().split(" ");

        for (String parte : partes) {
            produtoNomeMensagem += parte+"%20";
        }


        String mensagem = "https://api.whatsapp.com/send?phone=55"+telefone+"&text="+produto.getProdutoCodigo()+"%20-%20"+produtoNomeMensagem+"%0D%0A"+"Preço%20-%20"+produto.getProdutoValorVenda();

        return mensagem;
    }

}
