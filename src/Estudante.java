import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Estudante extends Pessoa {
    private static Estudante instance;
    private static ArrayList<Estudante> listaEstudantes = new ArrayList<Estudante>();
    private String matricula;
    private String curso;

    private Estudante(String nome, String matricula, String curso) {
        super(nome);
        this.matricula = matricula;
        this.curso = curso;
    }

    public static synchronized Estudante getInstance() {
        if(instance == null) {
            instance = new Estudante();
        }
        return instance;
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

    public static void cadastrarEstudante() {
        String nome, matricula, curso;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do Estudante: ");
        nome = scanner.nextLine();
        System.out.println("Matrícula do Estudante: ");
        matricula = scanner.nextLine();
        System.out.println("Curso do Estudante: ");
        curso = scanner.nextLine();

        Estudante estudante = new Estudante(nome, matricula, curso);
        listaEstudantes.add(estudante);
    }

    public static void listarEstudantes() {
        for(Estudante estudante : listaEstudantes) {
            System.out.println("Nome: " + estudante.getNome());
            System.out.println("Matrícula: " + estudante.getMatricula());
            System.out.println("Curso: " + estudante.getCurso());
        }
    }

    public static void removerEstudante() {
        String matricula;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrícula do Estudante: ");
        matricula = scanner.nextLine();

        for(Estudante estudante : listaEstudantes) {
            if(estudante.getMatricula().equals(matricula)) {
                listaEstudantes.remove(estudante);
                break;
            }
        }
    }
}
