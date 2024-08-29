package aula2.locadora;

public class Main {
    public static void main(String[] args) {
        Filme ultimato = new Filme("Vingadores Ultimato", "ação", 2020);
        Filme rotaFuga = new Filme("Rota de Fuga", "ação", 2013);
        Filme titanic = new Filme("Titanic", "Romance", 1997);
        Filme senhorDosAneis = new Filme("O Senhor dos Anéis", "Fantasia", 2001);

        ultimato.mostrarFilmes();
        rotaFuga.mostrarFilmes();
        titanic.mostrarFilmes();
        senhorDosAneis.mostrarFilmes();


    }
}
