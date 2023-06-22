package br.weg.vaProgWeb.dto;

import lombok.Data;

public @Data class PessoaJuridicaDTO {
    private Long pessoaJuridicaCnpj;
    private Long pessoaJuridicaIe;
    private Long pessoaCodigo;
    private String pessoaNome;
    private String pessoaTelefone;
    private String pessoaEmail;
    private String pessoaLogradouro;
    private String pessoaNumero;
    private String pessoaBairro;
    private String pessoaComplemento;
    private String pessoaUf;
    private String pessoaMunicipio;
}
