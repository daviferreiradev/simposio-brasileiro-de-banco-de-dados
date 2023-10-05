import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class SessaoTecnica {
    private LocalDate data;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private Sala local;
    private Professor mediador;
    private ArrayList<Apresentacao> apresentacoes;

    public SessaoTecnica(LocalDate data, LocalTime horaInicio, LocalTime horaFim, Sala local, Professor mediador) {
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.local = local;
        this.mediador = mediador;
        this.apresentacoes = new ArrayList<Apresentacao>();
    }

    public void adicionarApresentacao(Apresentacao apresentacao) {
        this.apresentacoes.add(apresentacao);
    }

    public void removerApresentacao(Apresentacao apresentacao) {
        this.apresentacoes.remove(apresentacao);
    }

    public ArrayList<Apresentacao> listarApresentacoes() {
        return this.apresentacoes;
    }
}
