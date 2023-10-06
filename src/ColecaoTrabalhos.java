import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColecaoTrabalhos {
    private static ColecaoTrabalhos colecaoTrabalhos = null;
    private List<Trabalho> trabalhos = new ArrayList<>();

    private ColecaoTrabalhos() {}

    public static synchronized ColecaoTrabalhos getInstance() {
        if(colecaoTrabalhos == null) {
            colecaoTrabalhos = new ColecaoTrabalhos();
        }
        return colecaoTrabalhos;
    }

    public void adicionarTrabalho() {
        String titulo, resumo;
        int idOrientador;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Título do Trabalho: ");
        titulo = scanner.nextLine();
        System.out.print("Resumo do Trabalho: ");
        resumo = scanner.nextLine();
        System.out.print("ID do Orientador: ");
        idOrientador = scanner.nextInt();

        Professor orientador = ColecaoProfessores.getInstance().buscarProfessorPorID(idOrientador);

        Trabalho trabalho = new Trabalho(titulo, resumo, orientador);
        trabalhos.add(trabalho);

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Trabalho cadastrado com sucesso!\n");
    }

    public void listarTrabalhos() {
        if(trabalhos.size() == 0) {
            System.out.println("Não há trabalhos cadastrados!\n");
        }
        
        for(Trabalho trabalho : trabalhos) {
            System.out.println("Título: " + trabalho.getTitulo());
            System.out.println("Resumo: " + trabalho.getResumo());
            System.out.println("Professor/Orientador: " + trabalho.getOrientador().getNome());
            System.out.println("");
        }
    }

    public void atualizarTrabalho() {
        int cod;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Código do Trabalho: ");
        cod = scanner.nextInt();

        for(Trabalho trabalho : trabalhos) {
            if(trabalho.getCod() == cod) {
                System.out.print("Título do Trabalho: ");
                trabalho.setTitulo(scanner.nextLine());
                System.out.print("Resumo do Trabalho: ");
                trabalho.setResumo(scanner.nextLine());
                try {
                    System.out.print("ID do Orientador: ");
                    int idOrientador = scanner.nextInt();
                    trabalho.setOrientador(ColecaoProfessores.getInstance().buscarProfessorPorID(idOrientador));
                } catch(Exception e) {
                    System.out.println("ID inválido!");
                }
                break;
            }
        }

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Trabalho atualizado com sucesso!\n");
    }

    public void removerTrabalho() {
        int cod;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Código do Trabalho: ");
        cod = scanner.nextInt();

        for(Trabalho trabalho : trabalhos) {
            if(trabalho.getCod() == cod) {
                trabalhos.remove(trabalho);
                break;
            }
        }

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Trabalho removido com sucesso!\n");
    }

    public Trabalho buscarTrabalhoPorCod(int cod) {
        for(Trabalho trabalho : trabalhos) {
            if(trabalho.getCod() == cod) {
                return trabalho;
            }
        }
        return null;
    }
}
