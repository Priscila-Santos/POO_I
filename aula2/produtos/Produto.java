package aula2.produtos;

public class Produto{
    String nome;
    double preco;
    String marca;

    Produto(String nome, double preco, String marca) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
    }

    void mostrarProdutos() {
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Preco: %.2f\n ", preco);
        System.out.printf("Marca: %s\n", marca);
    }

}
