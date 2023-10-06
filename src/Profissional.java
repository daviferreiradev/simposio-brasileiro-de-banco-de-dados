public class Profissional extends Pessoa {
    private int proximoCodigo = 0;
    // private MiniCurso miniCurso;

    public Profissional(String nome) {
        super(nome);
        proximoCodigo++;
    }

    public int getCodigo() {
        return this.proximoCodigo;
    }

    public void setCodigo(int codigo) {
        this.proximoCodigo = codigo;
    }

    // public MiniCurso getMiniCurso() {
    //     return this.miniCurso;
    // }

    // public void setMiniCurso(MiniCurso miniCurso) {
    //     this.miniCurso = miniCurso;
    // }

}
