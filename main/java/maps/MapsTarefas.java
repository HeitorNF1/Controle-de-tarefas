package maps;

import listas.Tarefas;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class MapsTarefas {

    Map<Integer, Tarefas> mapTarefas;

    public Integer getIndice() {
        return indice;
    }

    private Integer indice = 0;
    public MapsTarefas(){
        this.mapTarefas = new HashMap<>();
    }


    public void adicionarTarefa(String nome, String descricao,String status){
        indice++;
        mapTarefas.put(indice,new Tarefas(nome, descricao, status));
    }

    public void excluirTarefa(Integer indice){
        mapTarefas.remove(indice);
    }

    public void exibirTarefas(){
        System.out.println( mapTarefas);
    }

    public void filtrarPorIndice(Integer indice){
        System.out.println(mapTarefas.get(indice));
    }

    public static void main(String[] args) {
        MapsTarefas tarefas = new MapsTarefas();

        tarefas.adicionarTarefa("tarefa1", "descricao1", "status1");
        tarefas.adicionarTarefa("tarefa2", "descricao2", "status2");
        tarefas.adicionarTarefa("tarefa2", "descricao2", "status2");
        tarefas.adicionarTarefa("tarefa2", "descricao2", "status2");
        tarefas.adicionarTarefa("tarefa2", "descricao2", "status2");

        tarefas.excluirTarefa(4);

        tarefas.exibirTarefas();
    }

}


