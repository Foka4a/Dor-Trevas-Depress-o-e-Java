public class Produtos {


    private String nome;
    private double preco;
    private int qtd;

    public Produtos(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    @Override
    public String toString(){
        return " Nome do Produto: " +this.getNome() + " / Preço: " + this.getPreco() + " / Quantidade: " +this.getQtd();
    }
    
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }
}
