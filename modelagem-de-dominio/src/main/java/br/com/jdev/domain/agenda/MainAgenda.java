package br.com.jdev.domain.agenda;

import java.time.LocalDateTime;

public class MainAgenda {
    public static void main(String[] args) {
        Consulta c1 = new Consulta(LocalDateTime.now(), 30);
        Consulta c2 = new Consulta(LocalDateTime.now().plusMinutes(15), 30);
        System.out.println("Conflito: " + c1.conflitaCom(c2));
    }
}
