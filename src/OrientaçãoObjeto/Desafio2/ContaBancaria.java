package Desafio2;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    public String titular;

    public ContaBancaria(String numeroConta, String titular, ){
        System.out.println("Modelo: " + numeroConta);
    }

            //GETTERS
    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

            //SETTERS
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }



}


