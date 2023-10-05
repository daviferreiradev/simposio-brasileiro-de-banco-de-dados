import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class MiniCurso {
    private String titulo;
    private LocalDate data;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private Profissional profissional;
    private ArrayList<Pessoa> participantes;
    private Sala local;

    public MiniCurso(String titulo, LocalDate data, LocalTime horaInicio, LocalTime horaFim, Profissional profissional, Sala local) {
        this.titulo = titulo;
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.profissional = profissional;
        this.local = local;
        this.participantes = new ArrayList<Pessoa>();
    }

    public void adicionarParticipante(Pessoa pessoa) {
        this.participantes.add(pessoa);
    }

    public void removerParticipante(Pessoa pessoa) {
        this.participantes.remove(pessoa);
    }

    public ArrayList<Pessoa> listarParticipantes() {
        return this.participantes;
    }
}
