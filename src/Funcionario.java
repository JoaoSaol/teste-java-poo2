
public class Funcionario {
	 private String nome;
	    private TipoDeDocumento documento;
	    private String numeroDocumento;
	    private Cargo cargo;
	    private Status status;

	    public Funcionario(String nome, TipoDeDocumento documento, String numeroDocumento) {
	        this.nome = nome;
	        this.documento = documento;
	        this.numeroDocumento = numeroDocumento;
	        this.status = Status.PENDENTE;
	    }

	    public void contratar() {
	        this.status = Status.CONTRATADO;
	    }

	    public void demitir() {
	        this.status = Status.DEMITIDO;
	    }

	    @Override
	    public String toString() {
	        return "Funcionario{" +
	                "nome='" + nome + '\'' +
	                ", documento=" + documento +
	                ", numeroDocumento='" + numeroDocumento + '\'' +
	                ", cargo=" + cargo +
	                ", status=" + status +
	                '}';
	    }
}
