import java.time.LocalTime;

public class Apresentacao {
    private LocalTime horaApresentacao;
    private Trabalho trabalho;

    public Apresentacao(LocalTime horaApresentacao, Trabalho trabalho) {
        this.horaApresentacao = horaApresentacao;
        this.trabalho = trabalho;
    }

    public LocalTime getHoraApresentacao() {
        return this.horaApresentacao;
    }

    public void setHoraApresentacao(LocalTime horaApresentacao) {
        this.horaApresentacao = horaApresentacao;
    }

    public Trabalho getTrabalho() {
        return this.trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

}
