package JAVA.bankProject;

public class Conta {
    
    private double saldo;
    private int agencia;
    private int numero;
    private String titular;
    private static int total = 0;


    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        total++;
        System.out.println("Criando conta");
    }

    //MÉTEDOS
    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {

        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } 
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
    //GETTERS AND SETTERS

    public static int getTotal() {
        return Conta.total;
    }

    public double getSaldo() {
        return this.saldo;
    }


    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não pode numero <= 0");
            return;
        }
        this.numero = numero;
    
    }
    
    public int getAgencia() {
        return this.agencia;
    }
    
    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não pode numero <= 0");
            return;
        }
        this.agencia = agencia;
    }

    public String getTitular() {
        return (String) titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}