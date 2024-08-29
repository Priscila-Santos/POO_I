package aula1.techcorp;

import java.util.Scanner;

public class FuncionarioTechCorp {
    String nome;
    String cargo;
    double salario;

    FuncionarioTechCorp(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }

    static FuncionarioTechCorp[] funcionarios = new FuncionarioTechCorp[100];
    static int contador = 0;

    static void adicionarFuncionario(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha

        funcionarios[contador] = new FuncionarioTechCorp(nome, cargo, salario);
        contador++;
        System.out.println("Funcionário adicionado com sucesso!");
    }

    static void listarFuncionarios() {
        if (contador == 0) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println("\nFuncionário " + (i + 1) + ":");
                funcionarios[i].mostrarDetalhes();
            }
        }
    }

    static void calcularSalarioTotal() {
        double salarioTotal = 0;
        for (int i = 0; i < contador; i++) {
            salarioTotal += funcionarios[i].salario;
        }
        System.out.println("Salário total: " + salarioTotal);
    }
}