package aula3.calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculo1 = new Calculadora();
        Calculadora calculo2 = new Calculadora(2.5, 5);
        Calculadora calculo3 = new Calculadora(10, 7);

        calculo2.imprimirResultado();
        calculo3.imprimirResultado();


       /* System.out.println("Números 2.5 e 5");
        System.out.println("Resultado da adição: " + numeros2.adicionar());
        System.out.println("Resultado da subtração: " + numeros2.subtrair());
        System.out.println("Resultado da multiplicação: " + numeros2.multiplicar());
        System.out.println("Resultado da divisão: " + numeros2.dividir());


        System.out.println("Resultado da adição 2 + 5: " + numeros.adicionar(2, 5));
        System.out.println("Resultado da subtração 125 - 5: " + numeros.subtrair(125, 5));
        System.out.println("Resultado da multiplicação 512 + 4: " + numeros.multiplicar(512, 4));
        System.out.println("Resultado da divisão 17/5: " + numeros.dividir(17, 5));*/
    }
}
