public abstract class Instituicao {
    private String cnpj;
    private String nome;

    public Instituicao(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }
}
