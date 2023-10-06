public class Estudante extends Pessoa {
    private int matricula;
    private String curso;

    public Estudante(String nome, int matricula, String curso) {
        super(nome);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
