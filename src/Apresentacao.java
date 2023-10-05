import java.time.LocalTime;

public class Apresentacao {
    private LocalTime horaApresentacao;
    private Trabalho trabalho;

    public Apresentacao(LocalTime horaApresentacao, Trabalho trabalho) {
        this.horaApresentacao = horaApresentacao;
        this.trabalho = trabalho;
    }
}
