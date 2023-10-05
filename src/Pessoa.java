import java.time.LocalDate;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;

    public Pessoa(String nome, String cpf, LocalDate dataNascimento, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }
}


