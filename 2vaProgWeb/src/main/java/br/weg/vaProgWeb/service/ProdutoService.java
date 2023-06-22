package br.weg.vaProgWeb.service;

import br.ueg.prog.webi.api.service.CrudService;
import br.weg.vaProgWeb.model.ProdutoModel;
import br.weg.vaProgWeb.model.TelefoneModel;

public interface ProdutoService extends CrudService<ProdutoModel, Long> {
    public TelefoneModel enviarMensagem (Long produtoCodigo, TelefoneModel telefone);

}
