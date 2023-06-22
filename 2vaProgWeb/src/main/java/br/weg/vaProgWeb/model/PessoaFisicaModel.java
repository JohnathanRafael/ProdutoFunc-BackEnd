package br.weg.vaProgWeb.model;

import br.ueg.prog.webi.api.model.IEntidade;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name = "loja_pessoa")
public class PessoaFisicaModel extends PessoaModel implements IEntidade<Long> {

    @Column(name = "cpf")
    private Long pessoaFisicaCpf;
    @Column(name = "RG")
    private Long pessoaFisicaRg;
    @Column(name = "orgaoEmissor", length = 4)
    private String pessoaFisicaOrgaoEmissor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PessoaFisicaModel that = (PessoaFisicaModel) o;
        return Objects.equals(pessoaFisicaCpf, that.pessoaFisicaCpf) && Objects.equals(pessoaFisicaRg, that.pessoaFisicaRg) && Objects.equals(pessoaFisicaOrgaoEmissor, that.pessoaFisicaOrgaoEmissor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pessoaFisicaCpf, pessoaFisicaRg, pessoaFisicaOrgaoEmissor);
    }
}

/*
{
  "pessoaFisicaOrgaoEmissor": "SSP",
  "pessoaFisicaRg": 2325987,
  "pessoaFisicaCpf": 7015874589,
  "pessoaNome": "Teste",
  "pessoaTelefone": "62993589658",
  "pessoaEmail": "@teste",
  "pessoaLogradouro": "Teste",
  "pessoaNumero": "25",
  "pessoaBairro": "Teste",
  "pessoaComplemento": "",
  "pessoaUf": "GO",
  "pessoaMunicipio": "Teste"
}
 */