package aula3.termostato;

public class Main {
    public static void main(String[] args) {
        Termostato temperatura = new Termostato(40, 30);
        Termostato temperatura1 = new Termostato(-6, 32);

        temperatura.aumetarTemperatura(12);
        temperatura.diminuirTemperatura(25);
        temperatura.ajustarTemperaturaDesejada(28);
        temperatura.exibirStatus();

        temperatura1.aumetarTemperatura(15);
        temperatura1.diminuirTemperatura(1);
        temperatura1.ajustarTemperaturaDesejada(8);
        temperatura1.exibirStatus();
    }
}
