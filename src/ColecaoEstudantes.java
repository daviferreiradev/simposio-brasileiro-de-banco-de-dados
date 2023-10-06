import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColecaoEstudantes {
    private static ColecaoEstudantes colecaoEstudantes = null;
    private List<Estudante> estudantes = new ArrayList<>();

    private ColecaoEstudantes() {}

    public static synchronized ColecaoEstudantes getInstance() {
        if(colecaoEstudantes == null) {
            colecaoEstudantes = new ColecaoEstudantes();
        }
        return colecaoEstudantes;
    }

    public void adicionarEstudante() {
        String nome, matricula, curso;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do Estudante: ");
        nome = scanner.nextLine();
        System.out.print("Matrícula do Estudante: ");
        matricula = scanner.nextLine();
        System.out.print("Curso do Estudante: ");
        curso = scanner.nextLine();
        

        Estudante estudante = new Estudante(nome, matricula, curso);
        estudantes.add(estudante);

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Estudante cadastrado com sucesso!\n");
    }

    public void listarEstudantes() {
        if(estudantes.size() == 0) {
            System.out.println("Não há estudantes cadastrados!\n");
        }
        
        for(Estudante estudante : estudantes) {
            System.out.println("Nome: " + estudante.getNome());
            System.out.println("Matrícula: " + estudante.getMatricula());
            System.out.println("Curso: " + estudante.getCurso());
            System.out.println("");
        }
    }

    public void atualizarEstudante() {
        String matricula;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Matrícula do Estudante: ");
        matricula = scanner.nextLine();

        for(Estudante estudante : estudantes) {
            if(estudante.getMatricula().equals(matricula)) {
                System.out.print("Nome do Estudante: ");
                estudante.setNome(scanner.nextLine());
                System.out.print("Matrícula do Estudante: ");
                estudante.setMatricula(scanner.nextLine());
                System.out.print("Curso do Estudante: ");
                estudante.setCurso(scanner.nextLine());
                break;
            }
        }
        

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Estudante atualizado com sucesso!\n");
    }

    public void removerEstudante() {
        String matricula;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrícula do Estudante: ");
        matricula = scanner.nextLine();


        for(Estudante estudante : estudantes) {
            if(estudante.getMatricula().equals(matricula)) {
                estudantes.remove(estudante);
                break;
            }
        }

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Estudante removido com sucesso!\n");
    }
}
