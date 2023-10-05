public class Empresa extends Instituicao {
    private String ramoAtividade;

    public Empresa(String cnpj, String nome, String ramoAtividade) {
        super(cnpj, nome);
        this.ramoAtividade = ramoAtividade;
    }
}
