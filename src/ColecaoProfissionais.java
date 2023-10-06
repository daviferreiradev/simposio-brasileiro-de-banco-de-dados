import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColecaoProfissionais {
    private static ColecaoProfissionais colecaoProfissionais = null;
    private List<Profissional> profissionals = new ArrayList<>();

    private ColecaoProfissionais() {}

    public static synchronized ColecaoProfissionais getInstance() {
        if(colecaoProfissionais == null) {
            colecaoProfissionais = new ColecaoProfissionais();
        }
        return colecaoProfissionais;
    }

    public void adicionarProfissional() {
        String nome;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do Profissional: ");
        nome = scanner.nextLine();
        System.out.println("ID do Minicurso: ");
        

        Profissional profissional = new Profissional(nome);
        profissionals.add(profissional);

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Profissional cadastrado com sucesso!\n");
    }

    public void listarProfissionais() {
        if(profissionals.size() == 0) {
            System.out.println("Não há profissionais cadastrados!\n");
        }
        
        for(Profissional profissional : profissionals) {
            System.out.println("ID: " + profissional.getCodigo());
            System.out.println("Nome: " + profissional.getNome());
            System.out.println("");
        }
    }

    public void atualizarProfissional() {
        String nome;
        int cod;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ID do Profissional: ");
        cod = scanner.nextInt();

        for(Profissional profissional : profissionals) {
            if(profissional.getCodigo() == cod) {
                System.out.print("Nome do Profissional: ");
                nome = scanner.nextLine();
                profissional.setNome(nome);
                break;
            }
        }

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Profissional atualizado com sucesso!\n");
    }

    public void removerProfissional() {
        int cod;
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID do Profissional: ");
        cod = scanner.nextInt();

        for(Profissional profissional : profissionals) {
            if(profissional.getCodigo() == cod) {
                profissionals.remove(profissional);
                break;
            }
        }

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("profissional removido com sucesso!\n");
    }

    public Profissional buscarProfissionalPorID(int codigo) {
        for(Profissional profissional : profissionals) {
            if(profissional.getCodigo() == codigo) {
                return profissional;
            }
        }
        return null;
    }
}
