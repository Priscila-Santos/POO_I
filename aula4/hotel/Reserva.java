package aula4.hotel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    LocalDate checking;
    LocalDate checkout;
    Cliente cliente;
    Quarto quarto;
    double valorDiaria;
    double valorEstadia;

    public Reserva(Cliente cliente, Quarto quarto, double valorDiaria, LocalDate checking, LocalDate checkout, double valorEstadia) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.valorDiaria = valorDiaria;
        this.checking = checking;
        this.checkout = checkout;
        this.valorEstadia = calcularEstadia();
    }

    public double calcularEstadia(){
        long between = ChronoUnit.DAYS.between(checking, checkout);
        return between * valorDiaria;
    }

    void imprimirReserva(){
        System.out.printf("""
                 %s
                Quarto: %s
                Valor diaria: %.2f
                Checking: %s
                Checkout: %s
                Valor total da estadia: %.2f
                
                """,cliente.imprimirCliente(), quarto.imprimirQuarto(), valorDiaria, checking, checkout, valorEstadia).toString();
    }

}
