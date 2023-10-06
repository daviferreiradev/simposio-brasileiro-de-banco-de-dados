import java.util.ArrayList;

public class SessaoTecnica {
    private static int proximoID = 0;

    private int codigo;
    private String data;
    private String horaInicio;
    private String horaFim;
    private Sala local;
    private Professor mediador;
    private ArrayList<Apresentacao> apresentacoes = new ArrayList<>();

    public SessaoTecnica(String data, String horaInicio, String horaFim, Sala local, Professor mediador) {
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.local = local;
        this.mediador = mediador;
        proximoID++;
    }

    public void adicionarApresentacao(Apresentacao apresentacao) {
        apresentacoes.add(apresentacao);
    }

    public void removerApresentacao(Apresentacao apresentacao) {
        apresentacoes.remove(apresentacao);
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo() {
        this.codigo = proximoID;
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
}
