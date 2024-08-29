package aula4.hotel;

public class Quarto {
    String tipoQuarto; //simples, casal, suite master, lux plus
    double diaria;

    public Quarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;

        switch (tipoQuarto) {
            case "simples":
                this.diaria = 50;
                break;
            case "casal":
                diaria = 85;
                break;
            case "suite master":
                diaria = 250;
                break;
            case "lux plus":
                diaria = 500;
                break;
            default:
                diaria = Double.parseDouble(null);
                break;

        }
    }

    public double getDiaria() {
        return diaria;
    }

    Object imprimirQuarto() {
        return tipoQuarto;
    }

    /*public void valorQuarto() {
        switch (tipoQuarto) {
            case "simples":
                diaria = 50;
                break;
            case "casal":
                diaria = 85;
                break;
            case "suite master":
                diaria = 250;
                break;
            case "lux plus":
                diaria = 500;
                break;
            default:
                diaria = Double.parseDouble(null);
                break;

        }
    }

    public double getDiaria() {
        return diaria;
    } */

}
