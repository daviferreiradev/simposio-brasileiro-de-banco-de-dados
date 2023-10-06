public class Sala {
    private int proximoCodigo = 1;
    private int predio;
    private int andar;
    private int numSala;

    public Sala(int predio, int andar, int numSala) {
        this.predio = predio;
        this.andar = andar;
        this.numSala = numSala;

        proximoCodigo++;
    }

    public int getCodigo() {
        return this.proximoCodigo;
    }

    public void setCodigo(int codigo) {
        this.proximoCodigo = codigo;
    }

    public int getPredio() {
        return this.predio;
    }

    public void setPredio(int predio) {
        this.predio = predio;
    }

    public int getAndar() {
        return this.andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getSala() {
        return this.numSala;
    }

    public void setSala(int numSala) {
        this.numSala = numSala;
    }

}
