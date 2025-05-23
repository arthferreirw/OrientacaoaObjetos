package Exercicio11.Classes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Banco banco = new Banco("Banco Digital");

                Conta conta1 = new Conta("123", "Ana", 500.0);
                Conta conta2 = new Conta("456", "Carlos", -150.0);
                banco.adicionarConta(conta1);
                banco.adicionarConta(conta2);

                Transação transacao1 = new Transação("T001", "Depósito", 300.0, "2023-03-15", conta1);
                banco.adicionarTransacao(transacao1);

                banco.identificarMaiorMenorSaldo();
                banco.totalDevedores();
                banco.totalCredores();
            }
        }



