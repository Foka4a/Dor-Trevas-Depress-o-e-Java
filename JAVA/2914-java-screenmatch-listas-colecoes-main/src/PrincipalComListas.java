import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import java.util.ArrayList;

public class PrincipalComListas {
public static void main(String[] args) {

    Filme meuFilme = new Filme("O poderoso chefão", 1970);
    Serie lost = new Serie("Lost", 2000);
    Filme outroFilme = new Filme("Avatar", 2023);
    Filme filmeDoPaulo = new Filme("Django", 2015);
    Filme lancamento = new Filme("Shrek 5", 2025);
 
    ArrayList<Titulo> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(outroFilme);
        outroFilme.avalia(2);
        listaDeFilmes.add(filmeDoPaulo);
        filmeDoPaulo.avalia(8);
        listaDeFilmes.add(meuFilme);
        meuFilme.avalia(7);
        listaDeFilmes.add(lancamento);
        lancamento.avalia(9);
        listaDeFilmes.add(lost);
        lost.avalia(5);

    for(Titulo item : listaDeFilmes) {
        System.out.println("Nome: " +item.getNome());
        if (item instanceof Filme filme && filme.getClassificacao() > 2) {
            System.out.println("Classificação: " +filme.getClassificacao());
        }
    }
}

 
}
