import listas.ListaTarefa;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ListaTarefa teste = new ListaTarefa();


        teste.adicionarTarefa("Teste", "nome", "Fazer");
        teste.adicionarTarefa("Teste2", "nome2", "Fazendo");
        teste.adicionarTarefa("Teste2", "nome2", "Fazendo");
        teste.adicionarTarefa("Teste2", "nome5", "Fazer");
        teste.adicionarTarefa("Teste2", "nome2", "Feito");

        teste.filtrarTarefas("fazer");



    }
}