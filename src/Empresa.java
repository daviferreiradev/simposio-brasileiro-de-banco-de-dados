public class Empresa extends Instituicao {
    private String ramoAtividade;

    public Empresa(String cnpj, String nome, String ramoAtividade) {
        super(cnpj, nome);
        this.ramoAtividade = ramoAtividade;
    }

    public String getRamoAtividade() {
        return this.ramoAtividade;
    }

    public void setRamoAtividade(String ramoAtividade) {
        this.ramoAtividade = ramoAtividade;
    }

}
