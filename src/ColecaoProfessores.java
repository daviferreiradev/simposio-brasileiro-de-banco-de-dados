import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColecaoProfessores {
    private static ColecaoProfessores colecaoProfessores = null;
    private List<Professor> professores = new ArrayList<>();

    private ColecaoProfessores() {}

    public static synchronized ColecaoProfessores getInstance() {
        if(colecaoProfessores == null) {
            colecaoProfessores = new ColecaoProfessores();
        }
        return colecaoProfessores;
    }

    public void adicionarProfessor() {
        String nome, disciplina;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do Professor: ");
        nome = scanner.nextLine();
        System.out.print("Disciplina do Professor: ");
        disciplina = scanner.nextLine();
        

        Professor professor = new Professor(nome, disciplina);
        professores.add(professor);

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Professor cadastrado com sucesso!\n");
    }

    public void listarProfessores() {
        if(professores.size() == 0) {
            System.out.println("Não há estudantes cadastrados!\n");
        }
        
        for(Professor professor : professores) {
            System.out.println("Nome: " + professor.getNome());
            System.out.println("Disciplina: " + professor.getDisciplina());
            System.out.println("");
        }
    }

    public void atualizarProfessor() {
        int id;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ID do Professor: ");
        id = scanner.nextInt();

        for(Professor professor : professores) {
            if(professor.getId() == id) {
                System.out.print("Nome do Professor: ");
                professor.setNome(scanner.nextLine());
                System.out.print("Disciplina do Professor: ");
                professor.setDisciplina(scanner.nextLine());
                break;
            }
        }

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Estudante atualizado com sucesso!\n");
    }

    public void removerProfessor() {
        int id;
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID do Professor: ");
        id = scanner.nextInt();


        for(Professor professor : professores) {
            if(professor.getId() == id) {
                professores.remove(professor);
                break;
            }
        }

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Estudante removido com sucesso!\n");
    }

    public Professor buscarProfessorPorID(int idProfessor) {
        for(Professor professor : professores) {
            if(professor.getId() == idProfessor) {
                return professor;
            }
        }
        return null;
    }
}
