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

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHoraInicio() {
        return this.horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFim() {
        return this.horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public Sala getLocal() {
        return this.local;
    }

    public void setLocal(Sala local) {
        this.local = local;
    }

    public Professor getMediador() {
        return this.mediador;
    }

    public void setMediador(Professor mediador) {
        this.mediador = mediador;
    }

    public ArrayList<Apresentacao> getApresentacoes() {
        return this.apresentacoes;
    }

    public void setApresentacoes(ArrayList<Apresentacao> apresentacoes) {
        this.apresentacoes = apresentacoes;
    }

}
