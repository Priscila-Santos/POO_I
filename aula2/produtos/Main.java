package aula2.produtos;

public class Main {
    public static void main(String[] args) {
        Produto arroz = new Produto("arroz", 6.00, "três corações");
        Produto feijao = new Produto("feijão", 7.50, "carioca");
        Produto acucar = new Produto("açucar", 10.50, "cristal");

        System.out.println("Produtos da Lista");
        arroz.mostrarProdutos();
        System.out.println();

        feijao.mostrarProdutos();
        System.out.println();

        acucar.mostrarProdutos();

    }
}