package aula3.conta_bancaria;

public class ContaBancaria {
    int numeroConta;
    String titular;
    double saldo;

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.printf("Depósito de %.2f realizado com sucesso!Seu no novo saldo é de %.2f\n", valor, saldo);

    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.printf("Saque de %.2f realizado com sucesso!\n", valor);
        } else {
            throw new IllegalArgumentException("Saldo insuficiente para sacar");
        }
    }

    public void transferir(double valor, ContaBancaria destino) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.printf("Transferência de %.2f para a conta de %s realizada com sucesso! \n", valor, titular);
        } else {
            throw new IllegalArgumentException("Saldo insuficiente para transferir");
        }
    }

    public void exibirSaldo(){
        System.out.printf("""
    ----------------------------------------------------------------------------------------------
                 SALDO DA CONTA DE %s
                 
    Seu saldo atual é: %.2f\n
    """, titular.toUpperCase(), saldo).toString();
    }
}
