

public class ProdutoPerecivel extends Produtos{

    private double dataValidade;
    

    public ProdutoPerecivel(String nome, double preco, int qtd, double dataValidade) {
        super(nome, preco, qtd);
        this.dataValidade = dataValidade;

    }

    @Override
    public String toString(){
        return " Nome do Produto: " +this.getNome() + " / Preço: " + this.getPreco() + " / Data de Validade: " + this.dataValidade;
    }
}
