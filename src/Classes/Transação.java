package Classes;

import java.util.ArrayList;
import java.util.List;

public class Transação {
    private String identicador_transacao;
    private String tipo_transacao;
    private double valor;
    private String data;
    private Conta conta;

    public Transação() {
        this.identicador_transacao = " ";
        this.tipo_transacao = " ";
        this.valor = 0.0;
        this.data = " ";

    }
    public Transação (String identicador_transacao , String tipo_transacao , double valor , String data , Conta conta  ){
        this.identicador_transacao = identicador_transacao;
        this.tipo_transacao = tipo_transacao;
        this.valor = valor;
        this.data = data;
        this.conta = conta;


    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo_transacao() {
        return tipo_transacao;
    }

    public void setTipo_transacao(String tipo_transacao) {
        this.tipo_transacao = tipo_transacao;
    }

    public String getIdenticador_transacao() {
        return identicador_transacao;
    }

    public void setIdenticador_transacao(String identicador_transacao) {
        this.identicador_transacao = identicador_transacao;
    }

    @Override
    public String toString() {
        return "Transação{" +
                "identicador_transacao='" + identicador_transacao + '\'' +
                ", tipo_transacao='" + tipo_transacao + '\'' +
                ", valor=" + valor +
                ", data='" + data + '\'' +
                '}';
    }
}