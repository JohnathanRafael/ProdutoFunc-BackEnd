package br.weg.vaProgWeb.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import br.ueg.prog.webi.api.model.IEntidade;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@Entity
@Table(name = "loja_produto")
public class ProdutoModel implements IEntidade<Long>{
    public static final String UK_LOJA_NOME_PRODUTO = "uk_loja_nome_produto";
    @SequenceGenerator(
            name="produto_sequence",
            sequenceName = "produto_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "produto_sequence"
    )
    @Id
    @Column(name = "codigo")
    private Long produtoCodigo;
    @Column(name = "nome_produto", length = 200, nullable = false)
    private String produtoNome;
    @Column(name = "marca", length = 50)
    private String produtoMarca;
    @Column(name = "categoria", length = 50)
    private String produtoCategoria;
    @Column(name = "valor_de_venda", nullable = false)
    private BigDecimal produtoValorVenda;
    @Column(name = "valor_de_custo", nullable = false)
    private BigDecimal produtoValorCusto;
    @Column(name = "estoque")
    private Long produtoEstoque;
    @Column(name = "data_lancamento")
    private LocalDate produtolancamento;
    //pode ser melhorado
    @Column(name = "status_produto")
    private String statusProduto;

    @Override
    public String getTabelaNome() {
        return "loja_produto";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoModel that = (ProdutoModel) o;
        return Objects.equals(produtoCodigo, that.produtoCodigo) && Objects.equals(produtoNome, that.produtoNome) && Objects.equals(produtoMarca, that.produtoMarca) && Objects.equals(produtoCategoria, that.produtoCategoria) && Objects.equals(produtoValorVenda, that.produtoValorVenda) && Objects.equals(produtoValorCusto, that.produtoValorCusto) && Objects.equals(produtoEstoque, that.produtoEstoque) && Objects.equals(produtolancamento, that.produtolancamento) && Objects.equals(statusProduto, that.statusProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produtoCodigo, produtoNome, produtoMarca, produtoCategoria, produtoValorVenda, produtoValorCusto, produtoEstoque, produtolancamento, statusProduto);
    }

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public void setId(Long id) {
    }
}


/*
{
  "produtoNome": "Headset",
  "produtoMarca": "Corsair",
  "produtoCategoria": "Fone de ouvido",
  "produtoValorVenda": 259.30,
  "produtoValorCusto": 99.30,
  "produtoEstoque": 50
}
 */