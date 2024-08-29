package aula4.hotel;

public class Cliente {
    String nome;
    String cpf;
    String telefone;
    String email;

    public Cliente(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    Object imprimirCliente() {
        return ("\nNome: " + nome
        + "\nCPF: " + cpf
        + "\nTelefone: " + telefone
        + "\nEmail: " + email
        );
    }
}
