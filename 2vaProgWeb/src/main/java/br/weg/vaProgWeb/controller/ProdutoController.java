package br.weg.vaProgWeb.controller;

import br.ueg.prog.webi.api.controller.CrudController;
import br.weg.vaProgWeb.dto.ProdutoDTO;
import br.weg.vaProgWeb.dto.TelefoneDTO;
import br.weg.vaProgWeb.mapper.ProdutoMapper;
import br.weg.vaProgWeb.mapper.TelefoneMapper;
import br.weg.vaProgWeb.model.ProdutoModel;
import br.weg.vaProgWeb.service.ProdutoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(path = "${app.api.base}/produto")
public class ProdutoController extends CrudController<ProdutoModel, ProdutoDTO, Long, ProdutoMapper, ProdutoService> {

    @Autowired
    private TelefoneMapper telefoneMapper;

    @Autowired
    private ProdutoService produtoService;

    @PostMapping (path = "/{id}")
    @Operation(description = "Metodo para enviar mensagem", responses = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Mensagem enviada",
                    content = @Content(
                            mediaType = "application/json"
                    )
            )
    })
    public ResponseEntity<TelefoneDTO> enviarMensagem(@PathVariable(name = "id") Long codigo, @RequestBody() TelefoneDTO telefone){
        TelefoneDTO retorno = telefoneMapper.toTelefoneDTO( produtoService.enviarMensagem(codigo, telefoneMapper.toTelefoneModel(telefone)));
        return ResponseEntity.ok(retorno);
    }
}
