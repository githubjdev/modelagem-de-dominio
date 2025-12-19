package br.com.jdev.domain.agenda;

import java.time.LocalDateTime;

public class Consulta {
    private final LocalDateTime inicio;
    private final int duracao;

    public Consulta(LocalDateTime inicio, int duracao) {
        this.inicio = inicio;
        this.duracao = duracao;
    }

    public LocalDateTime fim() {
        return inicio.plusMinutes(duracao);
    }

    public boolean conflitaCom(Consulta outra) {
        return inicio.isBefore(outra.fim()) && outra.inicio.isBefore(this.fim());
    }
}
