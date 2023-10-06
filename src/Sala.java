public class Sala {
    private int proximoCodigo = 0;
    private int predio;
    private int numero;

    public Sala(int predio, int numero) {
        this.predio = predio;
        this.numero = numero;
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

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
