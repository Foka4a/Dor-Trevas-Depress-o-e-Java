
public class Tarefas {
   
    private String nome;
    private String descrição; 
    private boolean concluida;


    public Tarefas (String nome, String descrição) {
        this.nome = nome;
        this.descrição = descrição;
        this.concluida = false;

    }

    public boolean isConcluida() {
        return concluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "nome='" + nome + ", descricao='" + descrição + '\'' + ", concluida=" + concluida + '}';  
    }

    public String getNome() {
        return nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
