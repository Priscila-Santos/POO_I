package aula2.jogador;

public class Main {
    public static void main(String[] args) {
        Jogador rodrygo = new Jogador("Rodrygo", 23, "Atacante");
        Jogador gavi = new Jogador("Gavi", 20, "Meio Campo");

        rodrygo.mostrarJogador();
        System.out.println("------------------------");
        gavi.mostrarJogador();
    }
}