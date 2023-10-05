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
}
