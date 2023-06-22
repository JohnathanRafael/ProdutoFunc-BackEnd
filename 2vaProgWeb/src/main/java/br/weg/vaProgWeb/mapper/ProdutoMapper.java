package br.weg.vaProgWeb.mapper;

import br.ueg.prog.webi.api.mapper.BaseMapper;
import br.weg.vaProgWeb.dto.ProdutoDTO;
import br.weg.vaProgWeb.model.ProdutoModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProdutoMapper extends BaseMapper<ProdutoModel, ProdutoDTO> {

}
