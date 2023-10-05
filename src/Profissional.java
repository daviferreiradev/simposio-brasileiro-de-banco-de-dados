import java.time.LocalDate;

public class Profissional extends Pessoa {
    private MiniCurso miniCurso;

    public Profissional(String nome, String cpf, LocalDate dataNascimento, String email, MiniCurso miniCurso) {
        super(nome, cpf, dataNascimento, email);
        this.miniCurso = miniCurso;
    }
}
