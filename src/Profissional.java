public class Profissional extends Pessoa {
    private MiniCurso miniCurso;

    public Profissional(String nome, MiniCurso miniCurso) {
        super(nome);
        this.miniCurso = miniCurso;
    }

    public MiniCurso getMiniCurso() {
        return this.miniCurso;
    }

    public void setMiniCurso(MiniCurso miniCurso) {
        this.miniCurso = miniCurso;
    }

}
