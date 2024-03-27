

public class Program {
    public static void main(String[] args) {
        Projeto projeto = new Projeto("Projeto 1", new Date(), new Date());
        Funcionario funcionario1 = new Funcionario("Funcionario 1", TipoDeDocumento.CPF, "12345678901");
        Funcionario funcionario2 = new Funcionario("Funcionario 2", TipoDeDocumento.CNPJ, "12345678901234");
        Contratacao contratacao1 = new Contratacao(funcionario1, "123456", Cargo.DIRETOR);
        Contratacao contratacao2 = new Contratacao(funcionario2, "12345678901234", Cargo.ASSESSOR);
        projeto.adicionarContratacao(contratacao1);
        projeto.adicionarContratacao(contratacao2);
        projeto.listarContratacao();
    }
}