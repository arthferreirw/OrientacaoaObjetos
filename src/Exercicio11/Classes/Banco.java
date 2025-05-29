package Exercicio11.Classes;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> lstContas = new ArrayList<>();
    private List<Transação> lstTransacao = new ArrayList<>();


    public Banco() {
        this.nome = " ";
        this.lstContas = new ArrayList<>();
        this.lstTransacao = new ArrayList<>();
    }

    public Banco(String nome) {
        this.nome = " ";
        this.lstContas = new ArrayList<>();
        this.lstTransacao = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Transação> getLstTransacao() {
        return lstTransacao;
    }

    public void setLstTransacao(List<Transação> lstTransacao) {
        this.lstTransacao = lstTransacao;
    }

    public List<Conta> getLstContas() {
        return lstContas;
    }

    public void setLstContas(List<Conta> lstContas) {
        this.lstContas = lstContas;
    }

    public void adicionarConta(Conta conta) {
        this.getLstContas().add(conta);
    }
    public void removerConta(Conta conta){
        this.getLstContas().remove(conta);
    }
    public void adicionarTransacao(Transação transacao){
            this.getLstTransacao().add(transacao);
    }
    public void removerTransacao(Transação transacao){
        this.getLstContas().remove(transacao);
    }
    public void imprimirListaConta() { //imprimir lista de contas
        System.out.println("---- Lista de Contas ----");
        for (int i = 0; i < lstContas.size(); i++) {
            System.out.println("Conta " + (i + 1) + ": " + lstContas.get(i));
        }
    }
    public void imprimirListaTransacao(){
        System.out.println(" ---- Lista de transação ---- ");
        for (int i = 0 ; i < lstTransacao.size(); i++){
            System.out.println(" Transacao" + (i+1) + ": " +lstTransacao.get(i));
        }
    }
    public void identificarMaiorMenorSaldo(){

        Conta maiorSaldo = lstContas.get(0);
        Conta menorSaldo = lstContas.get(0);


        if(this.lstContas.isEmpty()){
            System.out.println(" Nenhuma conta cadastrada ");
        }

        for (Conta conta : lstContas){ //percorrendo a lista de contas
            if(conta.getSaldo_atual() > maiorSaldo.getSaldo_atual()){
                maiorSaldo = conta;
            }else if(conta.getSaldo_atual() < menorSaldo.getSaldo_atual()){
                menorSaldo = conta;
            }
        }
        System.out.println( " A conta de maior saldo é: "+ maiorSaldo);
        System.out.println(" A conta de menor saldo é: "+ menorSaldo);

    }
    public void totalDevedores(){
        int contador = 0;

        System.out.println("Contas com saldo negativo:");
        if(this.lstContas.isEmpty()){
            System.out.println(" A lista esta vazia, logo não é possivel calcular o total de devedores ");
        }
        for(Conta conta : lstContas){
            if (conta.getSaldo_atual() < 0){
                System.out.println(conta);
                contador++;
            }
        }
        System.out.println(" O numero de devedores é: " +contador);

    }
    public void totalCredores (){
        if (lstContas.isEmpty()){
            System.out.println(" Não é possivel saber o total de credores, pois a lista está vazia ");
        }
        int contador = 0;

        System.out.println("Contas com saldo positivo ou zero (credores):");
        for (Conta conta : lstContas){
            if (conta.getSaldo_atual() >= 0 ){
                System.out.println(conta);
                contador = contador + 1;
            }
        }
        System.out.println(" O total de credores é: " +contador);
    }
    public void SomatorioSaldoDevedores(){
        if (lstContas.isEmpty()) {
            System.out.println("Não é possível calcular o somatório de devedores, pois não há contas cadastradas.");
            return;
        }
        double somatorio = 0.0;

        for (Conta conta : lstContas){
            if (conta.getSaldo_atual() < 0 ){
                somatorio = conta.getSaldo_atual() + somatorio;
            }
        }
        System.out.printf("O somatório dos saldos negativos é: R$ %.2f%n", somatorio);
    }
    public void somatorioSaldoCredores(){
        if (lstContas.isEmpty()) {
            System.out.println("Não é possível calcular o somatório de credores, pois não há contas cadastradas.");
            return;
        }
        double somatorio = 0.0;

        for (Conta conta : lstContas){
            if (conta.getSaldo_atual() >0 ){
                somatorio  = somatorio + conta.getSaldo_atual();
            }
        }

        System.out.printf("O somatório dos saldos positivos (credores) é: R$ %.2f%n", somatorio);
    }
    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", lstContas=" + lstContas +
                ", lstTransacao=" + lstTransacao +
                '}';
    }
}

