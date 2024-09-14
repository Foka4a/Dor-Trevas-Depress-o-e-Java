import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {

    private ArrayList<Tarefa> listaTarefas;
    private Scanner scanner;

    public GerenciadorTarefas() {
        listaTarefas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

}
