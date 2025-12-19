package br.com.jdev.domain.estoque;

public class MainEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque(10);
        estoque.reservar(3);
        System.out.println("Quantidade disponível: " + estoque.getQuantidade());
    }
}
