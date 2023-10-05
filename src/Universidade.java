public class Universidade extends Instituicao {
    private int qtdCursos;

    public Universidade(String cnpj, String nome, int qtdCursos) {
        super(cnpj, nome);
        this.qtdCursos = qtdCursos;
    }
}
