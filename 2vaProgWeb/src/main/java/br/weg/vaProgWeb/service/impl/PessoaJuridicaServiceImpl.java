package br.weg.vaProgWeb.service.impl;

import br.ueg.prog.webi.api.service.BaseCrudService;
import br.weg.vaProgWeb.model.PessoaJuridicaModel;
import br.weg.vaProgWeb.repository.PessoaJuridicaRepository;
import br.weg.vaProgWeb.service.PessoaJuridicaService;
import org.springframework.stereotype.Service;

@Service
public class PessoaJuridicaServiceImpl extends BaseCrudService<PessoaJuridicaModel, Long, PessoaJuridicaRepository> implements PessoaJuridicaService {
    @Override
    protected void prepararParaIncluir(PessoaJuridicaModel entidade) {


    }

    @Override
    protected void validarDados(PessoaJuridicaModel entidade) {

    }

    @Override
    protected void validarCamposObrigatorios(PessoaJuridicaModel entidade) {

    }
}
