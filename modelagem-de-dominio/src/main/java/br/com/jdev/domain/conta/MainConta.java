package br.com.jdev.domain.conta;

import java.math.BigDecimal;

public class MainConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(new BigDecimal("1000.00"));
        conta.sacar(new BigDecimal("200.00"));
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
