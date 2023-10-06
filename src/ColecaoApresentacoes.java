import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColecaoApresentacoes {
    private static ColecaoApresentacoes colecaoApresentacoes = null;
    private List<Apresentacao> apresentacoes = new ArrayList<>();

    private ColecaoApresentacoes() {}

    public static synchronized ColecaoApresentacoes getInstance() {
        if(colecaoApresentacoes == null) {
            colecaoApresentacoes = new ColecaoApresentacoes();
        }
        return colecaoApresentacoes;
    }

    public void adicionarApresentacao() {
        String horaApresentacao;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Código do Trabalho: ");
        int codTrabalho = scanner.nextInt();
        System.out.print("Hora da Apresentacao: ");
        horaApresentacao = scanner.nextLine();

        Trabalho trabalho = ColecaoTrabalhos.getInstance().buscarTrabalhoPorCod(codTrabalho);

        Apresentacao apresentacao = new Apresentacao(horaApresentacao, trabalho);
        apresentacoes.add(apresentacao);

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Apresentacao cadastrada com sucesso!\n");
    }

    public void listarApresentacoes() {
        if(apresentacoes.size() == 0) {
            System.out.println("Não há Apresentacoes cadastradas!\n");
        }
        
        for(Apresentacao apresentacao : apresentacoes) {
            System.out.println("Codigo do Trabalho: : " + apresentacao.getTrabalho().getTitulo());
            System.out.println("Hora da Apresentacao: " + apresentacao.getHoraApresentacao());
            System.out.println("");
        }
    }

    public void atualizarApresentacao() {
        int cod;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Código da Apresentacao: ");
        cod = scanner.nextInt();

        for(Apresentacao apresentacao : apresentacoes) {
            if(apresentacao.getCod() == cod) {
                System.out.print("Código do Trabalho: ");
                int codTrabalho = scanner.nextInt();
                System.out.print("Hora da Apresentacao: ");
                apresentacao.setHoraApresentacao(scanner.nextLine());
                apresentacao.setTrabalho(ColecaoTrabalhos.getInstance().buscarTrabalhoPorCod(codTrabalho));
            }
        }
        
        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Aprsentacao atualizada com sucesso!\n");
    }

    public void removerApresentacao() {
        int cod;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Código da Apresentacao: ");
        cod = scanner.nextInt();

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Apresentacao removida com sucesso!\n");
    }
}
