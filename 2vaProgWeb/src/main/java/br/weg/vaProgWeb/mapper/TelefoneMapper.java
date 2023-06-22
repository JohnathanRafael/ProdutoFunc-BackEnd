package br.weg.vaProgWeb.mapper;

import br.weg.vaProgWeb.dto.TelefoneDTO;
import br.weg.vaProgWeb.model.TelefoneModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TelefoneMapper {
    public TelefoneModel toTelefoneModel(TelefoneDTO telefone);
    public TelefoneDTO toTelefoneDTO(TelefoneModel telefone);
}


