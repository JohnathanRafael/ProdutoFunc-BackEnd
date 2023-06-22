package br.weg.vaProgWeb.mapper;

import br.ueg.prog.webi.api.mapper.BaseMapper;
import br.weg.vaProgWeb.dto.PessoaFisicaDTO;
import br.weg.vaProgWeb.model.PessoaFisicaModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaFisicaMapper extends BaseMapper<PessoaFisicaModel, PessoaFisicaDTO>{

}
