package br.com.jdev.domain.conta;

import java.math.BigDecimal;

public class ContaBancaria {
    private BigDecimal saldo;

    public ContaBancaria(BigDecimal saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        if (saldo.compareTo(valor) < 0) throw new IllegalStateException("Saldo insuficiente");
        saldo = saldo.subtract(valor);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
