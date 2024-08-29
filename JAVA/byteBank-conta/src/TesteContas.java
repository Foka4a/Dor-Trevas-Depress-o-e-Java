
public class TesteContas {

    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(32, 300);
        cc.deposita(1000);

        ContaPoupanca cp = new ContaPoupanca(33, 200);
        cp.deposita(1000);

        cc.transfere(100, cp);

        System.out.println("CC:" + cc.getSaldo());
        System.out.println("CP:" + cp.getSaldo());    

    }

}
