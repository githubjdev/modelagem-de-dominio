package br.com.jdev.domain.pedido;

import java.math.BigDecimal;

public final class ItemPedido {
    private final String sku;
    private final int quantidade;
    private final BigDecimal precoUnitario;

    public ItemPedido(String sku, int quantidade, BigDecimal precoUnitario) {
        if (sku == null || sku.isBlank()) throw new IllegalArgumentException("SKU obrigatório");
        if (quantidade <= 0) throw new IllegalArgumentException("Quantidade inválida");
        if (precoUnitario == null || precoUnitario.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("Preço inválido");
        this.sku = sku;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public BigDecimal subtotal() {
        return precoUnitario.multiply(BigDecimal.valueOf(quantidade));
    }
}
