package br.com.jdev.domain.pedido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final String numero;
    private final List<ItemPedido> itens = new ArrayList<>();
    private BigDecimal desconto = BigDecimal.ZERO;

    public Pedido(String numero) {
        this.numero = numero;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public BigDecimal total() {
        return itens.stream().map(ItemPedido::subtotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .subtract(desconto);
    }

    public void aplicarDesconto(BigDecimal valor) {
        this.desconto = valor;
    }
}
