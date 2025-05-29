

import classes.*;

public class Main {
    public static void main(String[] args) {
        Reserva reserva = new Reserva (" arthur " , 15 , "17:5" );
        Reserva reserva1 = new Reserva("fefo" , 10 , "18:190");

        GerenciadorDeReservas gerenciador = new GerenciadorDeReservas();

        gerenciador.adicionarReserva(reserva);
        gerenciador.adicionarReserva(reserva1);

        gerenciador.buscarReserva("fefo");

        System.out.println(" Imprimindo a lista de reservas: ");
        gerenciador.listarReservar();

    }
}
