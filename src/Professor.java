public class Professor extends Pessoa {
    private int proximoID = 1;

    private String disciplina;

    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
        this.proximoID++;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getId() {
        return this.proximoID;
    }

}
