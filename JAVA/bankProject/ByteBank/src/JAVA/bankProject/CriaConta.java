package JAVA.bankProject;

public class CriaConta {
    
    public static void main(String[] args) {
              
              //REFERÊNCIA
        Conta primeiraConta = new Conta(123,42);
        primeiraConta.setSaldo(100);

            //System.out.println(primeiraConta.saldo);

        primeiraConta.setSaldo(1900);

            //System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta(123,34);
        segundaConta.setSaldo(1000);

            //System.out.println("A primera conta tem R$ " + primeiraConta.saldo);
            //System.out.println("A segunda conta tem R$ " + segundConta.saldo);
  
        primeiraConta.deposita(2000);
        System.out.println(primeiraConta.getSaldo());
        
        boolean conseguiRetirar = primeiraConta.saca(1500);
        System.out.println(primeiraConta.getSaldo());
        System.out.println(conseguiRetirar);

        boolean sucessoTranferencia = segundaConta.transfere(500, primeiraConta);
           
            if (sucessoTranferencia) {
                System.out.println("A tranferencia foi realizada com sucesso");
            } else {
                System.out.println("Ta pobre");
            }


        Cliente gabriel = new Cliente();
        gabriel.setNome("gabriel somariva");
        primeiraConta.setTitular("gabriel");


    }

}
