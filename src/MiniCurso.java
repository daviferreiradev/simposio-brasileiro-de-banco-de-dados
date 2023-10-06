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

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public Profissional getProfissional() {
        return this.profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public ArrayList<Pessoa> getParticipantes() {
        return this.participantes;
    }

    public void setParticipantes(ArrayList<Pessoa> participantes) {
        this.participantes = participantes;
    }

    public Sala getLocal() {
        return this.local;
    }

    public void setLocal(Sala local) {
        this.local = local;
    }

}
