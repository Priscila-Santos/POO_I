package aula2.jogador;

public class Jogador {
    String nome;
    int idade;
    String posicao;

    public Jogador(String nome, int idade, String posicao) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
    }

    void mostrarJogador(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Posicao: " + posicao);
    }
}
