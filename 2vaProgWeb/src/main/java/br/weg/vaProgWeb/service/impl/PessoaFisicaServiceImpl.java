package br.weg.vaProgWeb.service.impl;

import br.ueg.prog.webi.api.service.BaseCrudService;
import br.weg.vaProgWeb.model.PessoaFisicaModel;
import br.weg.vaProgWeb.repository.PessoaFisicaReposiory;
import br.weg.vaProgWeb.service.PessoaFisicaService;
import org.springframework.stereotype.Service;

@Service
public class PessoaFisicaServiceImpl extends BaseCrudService<PessoaFisicaModel, Long, PessoaFisicaReposiory> implements PessoaFisicaService {
    @Override
    protected void prepararParaIncluir(PessoaFisicaModel entidade) {

    }

    @Override
    protected void validarDados(PessoaFisicaModel entidade) {

    }

    @Override
    protected void validarCamposObrigatorios(PessoaFisicaModel entidade) {

    }


}
