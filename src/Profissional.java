import java.time.LocalDate;

public class Profissional extends Pessoa {
    private MiniCurso miniCurso;

    public Profissional(String nome, MiniCurso miniCurso) {
        super(nome);
        this.miniCurso = miniCurso;
    }
}
