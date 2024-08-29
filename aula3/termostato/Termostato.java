package aula3.termostato;

public class Termostato {
    double temperaturaAtual;
    double temperaturaDesejada;

    public Termostato(double temperaturaAtual, double temperaturaDesejada) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaDesejada = temperaturaDesejada;
    }

    public void aumetarTemperatura(double valor) {
        temperaturaAtual = temperaturaAtual + valor;
    }

    public void diminuirTemperatura(double valor) {
        temperaturaAtual = temperaturaAtual - valor;
    }

    public void ajustarTemperaturaDesejada(double valor) {
        temperaturaDesejada = valor;
    }

    void exibirStatus() {
        System.out.println("A Temperatura Atual é: " + temperaturaAtual);
        System.out.println("A Temperatura Desejada é: " + temperaturaDesejada);

        if(temperaturaAtual > temperaturaDesejada) {
            System.out.println("Temperatura atual é maior que temperatura desejada");
        } else  if(temperaturaAtual < temperaturaDesejada) {
            System.out.println("Temperatura atual é menor que temperatura desejada");
        } else {
            System.out.println("Temperatura atual é igual a temperatura desejada");
        }
        System.out.println("**************************************************************************");
    }

}

