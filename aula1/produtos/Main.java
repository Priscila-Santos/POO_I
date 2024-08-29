package aula1.produtos;

public class Main {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz", 5.50, 10);
        Produto feijao = new Produto("Feijão", 7.30, 20);
        Produto leite = new Produto("Leite", 4.20, 15);

        System.out.println("Informações dos Produtos:");
        arroz.mostrarDetalhes();
        System.out.println();
        feijao.mostrarDetalhes();
        System.out.println();
        leite.mostrarDetalhes();
    }
}
