package aula3.calculadora;

public class Calculadora {
    double numero1;
    double numero2;
    double resultado;

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Calculadora() {}

    public double adicionar() {
        return resultado = numero1 + numero2;
    }
    public double subtrair() {
        return resultado = numero1 - numero2;
    }
    public double multiplicar() {
        return resultado = numero1 * numero2;
    }
    public double dividir() {
        return resultado = numero1 / numero2;
    }

    void imprimirResultado() {
        System.out.printf("""
                
                     RESULTADOS DAS OPERAÇÕES
                     
                ADIÇÃO: %.2f + %.2f = %.2f
                SUBTRAÇÃO: %.2f - %.2f = %.2f
                MULTIPLICAÇÃO: %.2f * %.2f = %.2f
                DIVISÃO: %.2f / %.2f = %.2f
                
                """,numero1, numero2, adicionar(),
                numero1, numero2, subtrair(),
                numero1, numero2, multiplicar(),
                numero1, numero2, dividir()
        ).toString();
    }

    /* public double adicionar(double numero1, double numero2) {
        return resultado = numero1 + numero2;
    }
    public double subtrair(double numero1, double numero2) {
        return resultado = numero1 - numero2;
    }
    public double multiplicar(double numero1, double numero2) {
        return resultado = numero1 * numero2;
    }
    public double dividir(double numero1, double numero2) {
        return resultado = numero1 / numero2;
    } */
}

