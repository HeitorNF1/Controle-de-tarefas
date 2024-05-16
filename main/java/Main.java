import listas.ListaTarefa;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ListaTarefa teste = new ListaTarefa();


        teste.adicionarTarefa("Teste", "nome", "Fazer");
        teste.adicionarTarefa("Teste2", "nome2", "Fazendo");
        teste.adicionarTarefa("Teste3", "nome3", "Fazendo");
        teste.adicionarTarefa("Teste4", "nome4", "Fazer");
        teste.adicionarTarefa("Teste5", "nome5", "Feito");

        teste.exibirTarefas();

        List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');

        System.out.println(consoantesMeuNome);



    }
}