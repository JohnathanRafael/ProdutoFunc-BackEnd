package br.weg.vaProgWeb.controller;

import br.ueg.prog.webi.api.controller.CrudController;
import br.weg.vaProgWeb.dto.PessoaJuridicaDTO;
import br.weg.vaProgWeb.mapper.PessoaJuridicaMapper;
import br.weg.vaProgWeb.model.PessoaJuridicaModel;
import br.weg.vaProgWeb.service.PessoaJuridicaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${app.api.base}/pessoaJuridica")
public class PessoaJuridicaController extends CrudController<PessoaJuridicaModel, PessoaJuridicaDTO, Long, PessoaJuridicaMapper, PessoaJuridicaService> {
}
