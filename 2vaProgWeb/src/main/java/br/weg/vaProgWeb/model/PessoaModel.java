package br.weg.vaProgWeb.model;

import br.ueg.prog.webi.api.model.IEntidade;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

import static jakarta.persistence.GenerationType.SEQUENCE;

// TODO: 08/06/2023 DTYPE APARECENDO NA CRIACAO DO BANCO
@Data
@Entity
@Table(name = "loja_pessoa")
public abstract class PessoaModel implements IEntidade<Long> {
    @SequenceGenerator(
            name="peessoa_sequence",
            sequenceName = "pessoa_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "pessoa_sequence"
    )
    @Id
    @Column(name = "codigo")
    private Long pessoaCodigo;
    @Column(name = "nome_pessoa", length = 200, nullable = false)
    private String pessoaNome;
    @Column(name = "telefone_pessoa", length = 20)
    private String pessoaTelefone;
    @Column(name = "logradouro_pessoa", length = 200, nullable = false)
    private String pessoaLogradouro;
    @Column(name = "numeroRua_pessoa", length = 4, nullable = false)
    private String pessoaNumero;
    @Column(name = "bairro_pessoa", length = 50, nullable = false)
    private String pessoaBairro;
    @Column(name = "complementoBairro_pessoa", length = 200)
    private String pessoaComplemento;
    @Column(name = "municipio_pessoa", length = 50, nullable = false)
    private String pessoaMunicipio;
    @Column(name = "estado_pessoa", length = 2, nullable = false)
    private String pessoaUf;
    @Column(name = "email_pessoa", length = 50)
    private String pessoaEmail;

    @Override
    public String getTabelaNome() {
        return "loja_pessoa";
    }
    @Override
    public Long getId() {
        return null;
    }
    @Override
    public void setId(Long id) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaModel that = (PessoaModel) o;
        return Objects.equals(pessoaCodigo, that.pessoaCodigo) && Objects.equals(pessoaNome, that.pessoaNome) && Objects.equals(pessoaTelefone, that.pessoaTelefone) && Objects.equals(pessoaLogradouro, that.pessoaLogradouro) && Objects.equals(pessoaNumero, that.pessoaNumero) && Objects.equals(pessoaBairro, that.pessoaBairro) && Objects.equals(pessoaComplemento, that.pessoaComplemento) && Objects.equals(pessoaMunicipio, that.pessoaMunicipio) && Objects.equals(pessoaUf, that.pessoaUf) && Objects.equals(pessoaEmail, that.pessoaEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pessoaCodigo, pessoaNome, pessoaTelefone, pessoaLogradouro, pessoaNumero, pessoaBairro, pessoaComplemento, pessoaMunicipio, pessoaUf, pessoaEmail);
    }
}
