import java.time.LocalDate;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String cpf, LocalDate dataNascimento, String email, String disciplina) {
        super(nome, cpf, dataNascimento, email);
        this.disciplina = disciplina;
    }
}
