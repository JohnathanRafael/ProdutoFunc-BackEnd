package br.weg.vaProgWeb.repository;

import br.weg.vaProgWeb.model.PessoaFisicaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaFisicaReposiory extends JpaRepository<PessoaFisicaModel, Long> {
}
