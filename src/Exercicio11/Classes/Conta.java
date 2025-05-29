package Exercicio11.Classes;

public class Conta {
    private String numero_da_conta;
    private String titular_da_conta;
    private double saldo_atual;

    public Conta() {
        this.numero_da_conta = " ";
        this.titular_da_conta = " ";
        this.saldo_atual = 0.0;

    }

    public Conta(String numero_da_conta, String titular_da_conta, double saldo_atual) {
        this.numero_da_conta = numero_da_conta;
        this.titular_da_conta = titular_da_conta;
        this.saldo_atual = saldo_atual;
    }

    public String getNumero_da_conta() {
        return numero_da_conta;
    }

    public void setNumero_da_conta(String numero_da_conta) {
        this.numero_da_conta = numero_da_conta;
    }

    public String getTitular_da_conta() {
        return titular_da_conta;
    }

    public void setTitular_da_conta(String titular_da_conta) {
        this.titular_da_conta = titular_da_conta;
    }

    public double getSaldo_atual() {
        return saldo_atual;
    }

    public void setSaldo_atual(double saldo_atual) {
        this.saldo_atual = saldo_atual;
    }

    public void imprimir_conta() {
        System.out.println(this); //imprimir o toString
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero_da_conta='" + numero_da_conta + '\'' +
                ", titular_da_conta='" + titular_da_conta + '\'' +
                ", saldo_atual=" + saldo_atual +
                '}';
    }

    public double depositarSaldo(double valor) {
        if (valor > 0) {
            atualizarSaldo(saldo_atual + valor); //REFATORANDO O CÓDIGO, UTILIZANDO O METODO ATUALIZAR SALDO
        }else{
            System.out.println(" Não é possivel realizar um deposito, pois o valor é negativo ");
        }

        return saldo_atual;

    }
    public double sacarSaldo(double valor_sacar){
        if( saldo_atual > 0 && saldo_atual > valor_sacar){

            atualizarSaldo(saldo_atual - valor_sacar);
        }else{
            System.out.println( "Não é possivel realizar o saque, pois o seu saldo é menor do que o valor a ser sacado");
        }
        return saldo_atual;
    }
    public void atualizarSaldo(double atualizar_saldo){
        this.saldo_atual = atualizar_saldo;

        }
    }

