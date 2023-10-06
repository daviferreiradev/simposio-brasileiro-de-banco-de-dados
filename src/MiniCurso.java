import java.util.ArrayList;

public class MiniCurso {
    private static int proximoID = 0;
    private String titulo;
    private String data;
    private String horaInicio;
    private String horaFim;
    private Profissional profissional;
    private ArrayList<Pessoa> participantes;
    private Sala local;

    public MiniCurso(String titulo, String data, String horaInicio, String horaFim, Profissional profissional, Sala local) {
        this.titulo = titulo;
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.profissional = profissional;
        this.local = local;
        this.participantes = new ArrayList<Pessoa>();
        proximoID++;
    }

    public static int getCodigo() {
        return proximoID;
    }

    public static void setCodigo(int proximoID) {
        MiniCurso.proximoID = proximoID;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHoraInicio() {
        return this.horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return this.horaFim;
    }

    public void setHoraFim(String horaFim) {
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
