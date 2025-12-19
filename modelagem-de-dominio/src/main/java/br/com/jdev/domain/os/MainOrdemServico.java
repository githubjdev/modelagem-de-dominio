package br.com.jdev.domain.os;

public class MainOrdemServico {
    public static void main(String[] args) {
        OrdemServico os = new OrdemServico();
        os.iniciar();
        os.finalizar();
        System.out.println("Status da OS: " + os.getStatus());
    }
}
