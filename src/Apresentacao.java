public class Apresentacao {
    private static int proximoCod = 1;
    private String horaApresentacao;
    private Trabalho trabalho;

    public Apresentacao(String horaApresentacao, Trabalho trabalho) {
        this.horaApresentacao = horaApresentacao;
        this.trabalho = trabalho;
        proximoCod++;
    }

    public int getCod() {
        return proximoCod;
    }

    public String getHoraApresentacao() {
        return this.horaApresentacao;
    }

    public void setHoraApresentacao(String horaApresentacao) {
        this.horaApresentacao = horaApresentacao;
    }

    public Trabalho getTrabalho() {
        return this.trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

}
