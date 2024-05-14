package listas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefas> listaTarefas;

    public ListaTarefa(){
        this.listaTarefas = new ArrayList<>();
    }


    public void adicionarTarefa(String descricao, String nome, String status){
        listaTarefas.add(new Tarefas(nome, descricao,status));
    }

    public void removerTarefa(String nome){
        List<Tarefas> tarefasParaRemover = new ArrayList<>();

        for(Tarefas d: listaTarefas){
            if(d.getNome().equalsIgnoreCase(nome)){
                tarefasParaRemover.add(d);
            }
        }
        listaTarefas.removeAll(tarefasParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(listaTarefas);
    }

    public void filtrarTarefas(String status){

        List<Tarefas> listaFiltrada = new ArrayList<>();

        for(Tarefas t: listaTarefas){
            if(t.getStatus().equalsIgnoreCase(status)){
                listaFiltrada.add(t);
            }
        }

        System.out.println(listaFiltrada);

    }
}
