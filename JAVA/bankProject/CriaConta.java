package JAVA.bankProject;

import JAVA.Cliente;

public class CriaConta {
    
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        //System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
       //System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 1000;

        //System.out.println("A primera conta tem R$ " + primeiraConta.saldo);
        //System.out.println("A segunda conta tem R$ " + segundConta.saldo);
  
        primeiraConta.deposita(2000);
        System.out.println(primeiraConta.saldo);
        
        boolean conseguiRetirar = primeiraConta.saca(1500);
        System.out.println(primeiraConta.saldo);
        System.out.println(conseguiRetirar);

        boolean sucessoTranferencia = segundaConta.transfere(500, primeiraConta);
           
            if (sucessoTranferencia) {
                System.out.println("A tranferencia foi realizada com sucesso");
            } else {
                System.out.println("Ta pobre");
            }

        Conta contaGabriel = new Conta();
        contaGabriel.titular = new Cliente();
        contaGabriel.titular.nome = "Gabriel";


            
    }

}
