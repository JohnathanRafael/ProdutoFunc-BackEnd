package br.weg.vaProgWeb.controller;

import br.ueg.prog.webi.api.controller.CrudController;
import br.weg.vaProgWeb.dto.PessoaFisicaDTO;
import br.weg.vaProgWeb.mapper.PessoaFisicaMapper;
import br.weg.vaProgWeb.model.PessoaFisicaModel;
import br.weg.vaProgWeb.service.PessoaFisicaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${app.api.base}/pessoaFisica")
public class PessoaFisicaController extends CrudController<PessoaFisicaModel, PessoaFisicaDTO, Long, PessoaFisicaMapper, PessoaFisicaService> {
}
