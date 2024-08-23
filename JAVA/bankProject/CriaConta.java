package JAVA.bankProject;

public class CriaConta {
    
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundConta = new Conta();
        segundConta.saldo = 1000;

        System.out.println("A primera conta tem R$ " + primeiraConta.saldo);
        System.out.println("A segunda conta tem R$ " + segundConta.saldo);


    }

}
