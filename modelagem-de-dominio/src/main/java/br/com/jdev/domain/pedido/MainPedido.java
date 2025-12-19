package br.com.jdev.domain.pedido;

import java.math.BigDecimal;

public class MainPedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("PED-01");
        pedido.adicionarItem(new ItemPedido("SKU1", 2, new BigDecimal("10.00")));
        pedido.aplicarDesconto(new BigDecimal("5.00"));
        System.out.println("Total do pedido: " + pedido.total());
    }
}
