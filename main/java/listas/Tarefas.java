package listas;
import listas.ListaTarefa;
import maps.MapsTarefas;
public class Tarefas {


    private String descricao;
    private String nome;
    private String status;



    public Tarefas(String nome, String descricao, String status ) {

        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getNome() {
        return nome;
    }
    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "\n" + "nome: "+ nome + " Descricao: " + descricao + " Status: " + status + "\n";
    }
}
