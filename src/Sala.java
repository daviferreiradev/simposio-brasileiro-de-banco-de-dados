public class Sala {
    private int codigo;
    private int idPredio;
    private int capacidade;

    public Sala(int codigo, int idPredio, int capacidade) {
        this.codigo = codigo;
        this.idPredio = idPredio;
        this.capacidade = capacidade;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getIdPredio() {
        return this.idPredio;
    }

    public void setIdPredio(int idPredio) {
        this.idPredio = idPredio;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

}
