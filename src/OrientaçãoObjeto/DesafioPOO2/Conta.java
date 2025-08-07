package OrientaçãoObjeto.DesafioPOO2;

public class Conta {
    private String numeroConta;
    private double saldo;
    private String titular; // Atributo titular agora é privado

    // Construtor da classe
    public Conta(String numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Getters para os atributos privados
    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Getter para o atributo titular
    public String getTitular() {
        return titular;
    }

    // Setters para os atributos privados
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Setter para o atributo titular
    public void setTitular(String titular) {
        this.titular = titular;
    }
}
