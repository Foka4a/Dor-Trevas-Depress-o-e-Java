
import java.util.ArrayList;

public class CarrinhoDeCompras {

    public static void main(String[] args) {
        
        var arroz = new Produtos("Arroz", 5.50, 2);
        var feijao = new Produtos("Feijão", 7.20, 1);
        var leite = new ProdutoPerecivel("Leite", 4.30, 3, 14.06);
        var pao = new Produtos("Pão", 1.00, 10);
        var ovos = new Produtos("Ovos", 12.00, 1);
        var frango = new Produtos("Frango", 12.90, 2);
        

        ArrayList<Produtos> listaDeCompras = new ArrayList<>();
        listaDeCompras.add(arroz);
        listaDeCompras.add(feijao);
        listaDeCompras.add(leite);
        listaDeCompras.add(pao);
        listaDeCompras.add(ovos);
        listaDeCompras.add(frango);
        System.out.println(listaDeCompras.get(2));
        System.out.println(listaDeCompras.size());
            
        

    }

}


