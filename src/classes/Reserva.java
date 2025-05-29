package classes;


public class Reserva {
    private String nomeReserva;
    private int numPessoas;
    private String dataHora;

    public Reserva(){
        this.nomeReserva = "";
        this.numPessoas = 0;
        this.dataHora = "";
    }
    public Reserva(String nomeReserva , int numPessoas , String dataHora){
        this.nomeReserva = nomeReserva;
        this.numPessoas = numPessoas;
        this.dataHora = dataHora;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public String getNomeReserva() {
        return nomeReserva;
    }

    public void setNomeReserva(String nomeReserva) {
        this.nomeReserva = nomeReserva;
    }

    public void imprimir(){
        System.out.println(this); //imprimir a lista utilizando o metodo toString
    }

    @Override
    public String toString() {
        return "classes.Reserva{" +
                "nomeReserva='" + nomeReserva + '\'' +
                ", numPessoas=" + numPessoas +
                ", dataHora='" + dataHora + '\'' +
                '}';
    }
}

