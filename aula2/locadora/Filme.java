package aula2.locadora;

public class Filme {
    String nome;
    String genero;
    int anoLancamento;

    public Filme(String nome, String genero, int anoLancamento) {
        this.nome = nome;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    void mostrarFilmes(){
        String mostrarFilmes =
                System.out.printf( """
                *********************************
                | Nome: %s 
                | Genero: %s 
                | Ano Lancamento: %d
                *********************************
                %n""", nome, genero, anoLancamento).toString();

    }
}
