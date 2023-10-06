import java.util.ArrayList;

public class Trabalho {
    private int id;
    private String titulo;
    private String resumo;
    private Professor orientador;
    private ArrayList<Estudante> integrantes;

    public Trabalho(int id, String titulo, String resumo, Professor orientador) {
        this.id = id;
        this.titulo = titulo;
        this.resumo = resumo;
        this.orientador = orientador;
        this.integrantes = new ArrayList<Estudante>();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return this.resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public Professor getOrientador() {
        return this.orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    public ArrayList<Estudante> getIntegrantes() {
        return this.integrantes;
    }

    public void setIntegrantes(ArrayList<Estudante> integrantes) {
        this.integrantes = integrantes;
    }

}
