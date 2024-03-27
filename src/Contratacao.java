
public class Contratacao {
    private Funcionario funcionario;
    private String numeroDocumento;
    private Cargo cargo;

    public Contratacao(Funcionario funcionario, String numeroDocumento, Cargo cargo) {
        this.funcionario = funcionario;
        this.numeroDocumento = numeroDocumento;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Contratacao{" +
                "funcionario=" + funcionario +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", cargo=" + cargo +
                '}';
    }
}
