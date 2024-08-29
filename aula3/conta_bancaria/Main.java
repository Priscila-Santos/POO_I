package aula3.conta_bancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(123456, "Maria", 1040.57);
        ContaBancaria conta2 = new ContaBancaria(123457, "João", 3500.57);

        //Conta 1
        conta1.depositar(300.98);
        conta1.sacar(1.99);
        conta1.transferir(50, conta2);

        conta1.exibirSaldo();

        //Conta 2
        conta2.depositar(450);
        conta2.sacar(100.99);
        conta2.transferir(50, conta1);

        conta2.exibirSaldo();
    }
}
