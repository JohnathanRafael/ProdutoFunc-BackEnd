package br.weg.vaProgWeb.exception;

import br.ueg.prog.webi.api.exception.MessageCode;

public enum SistemaMessageCode implements MessageCode {
    ERRO_CAMPOS_OBRIGATORIOS("MSG-001", 400),
    MSG_OPERACAO_REALIZADA_SUCESSO("MSG-002", 200),
    ERRO_SEM_CONTATO_COM_O_SERVIODR_DA_API("MSG-003", 400),
    ERRO_TELEFONE_INVALIDO("MSG-004", 400);

    private final String code;
    private final Integer status;
    SistemaMessageCode(final String code, final Integer status) {
        this.code = code;
        this.status = status;
    }
    public String getCode() { return code; }
    public Integer getStatus() { return status; }
    @Override
    public String toString() { return code; }
}
