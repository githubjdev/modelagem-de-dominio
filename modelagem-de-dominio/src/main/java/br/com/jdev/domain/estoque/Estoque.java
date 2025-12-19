package br.com.jdev.domain.estoque;

public class Estoque {
    private int quantidade;

    public Estoque(int inicial) {
        this.quantidade = inicial;
    }

    public void reservar(int qtd) {
        if (quantidade < qtd) throw new IllegalStateException("Estoque insuficiente");
        quantidade -= qtd;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
