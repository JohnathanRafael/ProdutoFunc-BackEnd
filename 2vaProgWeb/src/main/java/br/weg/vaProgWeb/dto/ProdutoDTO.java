package br.weg.vaProgWeb.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

public @Data class ProdutoDTO {
    private Long produtoCodigo;
    private String produtoNome;
    private String produtoMarca;
    private String produtoCategoria;
    private BigDecimal produtoValorVenda;
    private BigDecimal produtoValorCusto;
    private String statusProduto;
    private Long produtoEstoque;
    private LocalDate produtolancamento;
}

