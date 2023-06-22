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
public class PessoaJuridicaModel extends PessoaModel implements IEntidade<Long> {

    @Column(name = "cnpj")
    private Long pessoaJuridicaCnpj;
    @Column(name = "inscricaoEstadual")
    private Long pessoaJuridicaIe;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PessoaJuridicaModel that = (PessoaJuridicaModel) o;
        return Objects.equals(pessoaJuridicaCnpj, that.pessoaJuridicaCnpj) && Objects.equals(pessoaJuridicaIe, that.pessoaJuridicaIe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pessoaJuridicaCnpj, pessoaJuridicaIe);
    }
}
/*
{
  "pessoaJuridicaCnpj": 23285419000132,
  "pessoaJuridicaIe": 236598,
  "pessoaNome": "Teste",
  "pessoaTelefone": "62992097829",
  "pessoaEmail": "teste@email.com",
  "pessoaLogradouro": "Rua Albertina",
  "pessoaNumero": "N/A",
  "pessoaBairro": "Cenmtro",
  "pessoaComplemento": "Teste",
  "pessoaUf": "GO",
  "pessoaMunicipio": "Anapolis"
}
 */