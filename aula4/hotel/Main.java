package aula4.hotel;

import javax.swing.*;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Cliente clienteJoao =  new Cliente("João", "012.345.678-10", "(55)12345678", "joao@email.com");
        Quarto quartoJoao = new Quarto("simples");
        LocalDate checkinJoao = LocalDate.of(2024, 8, 28);
        LocalDate checkoutJoao = LocalDate.of(2024, 9, 30);

        Cliente clienteMaria = new Cliente("Maria Souza","012.345.678-99", "(55)12345679", "maria@email.com" );
        Quarto quartoMaria = new Quarto("lux plus");
        LocalDate checkinMaria = LocalDate.of(2024, 8, 30);
        LocalDate checkoutMaria = LocalDate.of(2024, 9, 2);

        Reserva joao = new Reserva(clienteJoao, quartoJoao, quartoJoao.getDiaria(), checkinJoao, checkoutJoao, quartoJoao.getDiaria());
        Reserva maria = new Reserva(clienteMaria, quartoMaria, quartoMaria.getDiaria(), checkinMaria, checkoutMaria, quartoMaria.getDiaria());

        joao.imprimirReserva();
        maria.imprimirReserva();


    }
}
