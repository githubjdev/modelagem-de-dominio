package br.com.jdev.domain.os;

public class OrdemServico {
    private String status = "ABERTA";

    public void iniciar() {
        status = "EM_EXECUCAO";
    }

    public void finalizar() {
        status = "FINALIZADA";
    }

    public String getStatus() {
        return status;
    }
}
