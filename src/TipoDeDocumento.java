
public enum TipoDeDocumento {
    CPF("Cadastrode Pessoa Física"),
    CNPJ("Cadastro de Pessoa Jurídica"),
    RG("Registro Geral");

    private String descricao;

    TipoDeDocumento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
