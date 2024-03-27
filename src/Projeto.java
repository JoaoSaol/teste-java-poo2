import java.util.ArrayList;
import java.util.Date;

public class Projeto {
    private String nome;
    private Date dt_Inicio;
    private Date dt_Termino;
    private ArrayList<Contratacao> contratacoes;

    public Projeto(String nome, Date dt_Inicio, Date dt_Termino) {
        this.nome = nome;
        this.dt_Inicio = dt_Inicio;
        this.dt_Termino = dt_Termino;
        this.contratacoes = new ArrayList<>();
    }

    public boolean adicionarContratacao(Contratacao contratacao) {
        return contratacoes.add(contratacao);
    }

    public boolean removerContratacao(Contratacao contratacao) {
        return contratacoes.remove(contratacao);
    }

    public void listarContratacao() {
        for (Contratacao contratacao : contratacoes) {
            System.out.println(contratacao);
        }
    }
}
