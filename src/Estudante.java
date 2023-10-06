public class Estudante extends Pessoa {
    private String matricula;
    private String curso;

    public Estudante(String nome, String matricula, String curso) {
        super(nome);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
