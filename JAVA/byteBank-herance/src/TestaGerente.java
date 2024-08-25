public class TestaGerente {

    public static void main(String[] args) {
        
        Gerente paulao = new Gerente();
        paulao.setNome("Paulão");
        paulao.setCpf("465432156-33");
        paulao.setSalario(5000);
        paulao.setSenha(4865);

        System.out.println(paulao.getNome());
        System.out.println(paulao.getCpf());
        System.out.println(paulao.getSalario());

        paulao.setSenha(1234);

        boolean autenticou = paulao.autentica(1234);
        System.out.println(autenticou);
    }   



}
