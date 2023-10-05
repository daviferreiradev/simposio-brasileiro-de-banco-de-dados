import java.time.LocalDate;

public class Estudante extends Pessoa {
    private String matricula;
    private String curso;

    public Estudante(String nome, String cpf, LocalDate dataNascimento, String email, String matricula, String curso) {
        super(nome, cpf, dataNascimento, email);
        this.matricula = matricula;
        this.curso = curso;
    }
}
