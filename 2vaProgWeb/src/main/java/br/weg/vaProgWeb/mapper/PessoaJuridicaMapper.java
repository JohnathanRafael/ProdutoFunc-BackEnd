package br.weg.vaProgWeb.mapper;

import br.ueg.prog.webi.api.mapper.BaseMapper;
import br.weg.vaProgWeb.dto.PessoaJuridicaDTO;
import br.weg.vaProgWeb.model.PessoaJuridicaModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaJuridicaMapper extends BaseMapper<PessoaJuridicaModel, PessoaJuridicaDTO>{

}
