package br.weg.vaProgWeb.repository;

import br.weg.vaProgWeb.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
