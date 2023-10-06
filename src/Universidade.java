public class Universidade extends Instituicao {
    private int qtdCursos;

    public Universidade(String cnpj, String nome, int qtdCursos) {
        super(cnpj, nome);
        this.qtdCursos = qtdCursos;
    }

    public int getQtdCursos() {
        return this.qtdCursos;
    }

    public void setQtdCursos(int qtdCursos) {
        this.qtdCursos = qtdCursos;
    }

}
