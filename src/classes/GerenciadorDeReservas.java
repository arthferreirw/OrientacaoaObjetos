package classes;


import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeReservas {
    private List<Reserva> LstReserva = new ArrayList<>();

    public GerenciadorDeReservas() {
        this.LstReserva = new ArrayList<>(); // inicializando lista
    }

    public void adicionarReserva(Reserva reserva) {
        LstReserva.add(reserva);
    }

    public boolean CancelarReserva(String nomeReserva) {
        for (int i = 0; i < LstReserva.size() - 1; i++) {
            //for( Reserva r : LstReserva) {
            // if(r.getNomeReserva().equals(nomeReserva)) {
            //  LstReserva.remove(r);
            // }
            //   }

            Reserva reseva = LstReserva.get(i);
            if (reseva.getNomeReserva().equals(nomeReserva)) {
                LstReserva.remove(i);
                return true;
            }


        }
        return false;

    }

    public String  buscarReserva(String nomeReserva) {
        for (Reserva r : LstReserva) {
            if (r.getNomeReserva().equals(nomeReserva)) {
                System.out.println(" O nome encontrado: " + r.getNomeReserva());

            }


        }
        return null;
    }
    public void listarReservar(){
        for (Reserva r : LstReserva){
            r.imprimir();
        }
    }
}




