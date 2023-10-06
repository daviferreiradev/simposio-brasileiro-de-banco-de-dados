import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColecaoSessoesTecnicas {
    private static ColecaoSessoesTecnicas colecaoSessoesTecnicas = null;
    private List<SessaoTecnica> sessoesTecnicas = new ArrayList<>();

    private ColecaoSessoesTecnicas() {}

    public static synchronized ColecaoSessoesTecnicas getInstance() {
        if(colecaoSessoesTecnicas == null) {
            colecaoSessoesTecnicas = new ColecaoSessoesTecnicas();
        }
        return colecaoSessoesTecnicas;
    }

    public void adicionarSessaoTecnica() {
        String data, horaInicio, horaFim;
        int idMediador, idSala;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Data da Sessão Técnica: ");
        data = scanner.nextLine();
        System.out.print("Hora de Início da Sessão Técnica: ");
        horaInicio = scanner.nextLine();
        System.out.print("Hora de Fim da Sessão Técnica:");
        horaFim = scanner.nextLine();
        System.out.print("ID do Local da Sessão Técnica: ");
        idSala = scanner.nextInt();
        Sala sala = ColecaoSalas.getInstance().buscarSalaPorID(idSala);
        System.out.print("ID do Mediador da Sessão Técnica: ");
        idMediador = scanner.nextInt();
        Professor mediador = ColecaoProfessores.getInstance().buscarProfessorPorID(idMediador);

        SessaoTecnica sessaoTecnica = new SessaoTecnica(data, horaInicio, horaFim, sala, mediador);
        sessoesTecnicas.add(sessaoTecnica);

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Estudante cadastrado com sucesso!\n");
    }

    public void listarSessoesTecnicas() {
        if(sessoesTecnicas.size() == 0) {
            System.out.println("Não há Sessões Técnicas cadastradas!\n");
        }
        
        for(SessaoTecnica sessaoTecnica : sessoesTecnicas) {
            System.out.println("Data: " + sessaoTecnica.getData());
            System.out.println("Hora de Início: " + sessaoTecnica.getHoraInicio());
            System.out.println("Hora de Fim: " + sessaoTecnica.getHoraFim());
            System.out.println("Local: " + sessaoTecnica.getLocal());
            System.out.println("Mediador: " + sessaoTecnica.getMediador());
            System.out.println("");
        }
    }

    public void atualizarSessaoTecnica() {
        int codigo;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Código da Sessão Técnica: ");
        codigo = scanner.nextInt();

        for(SessaoTecnica sessaoTecnica : sessoesTecnicas) {
            if(sessaoTecnica.getCodigo() == codigo) {
                System.out.print("Data da Sessão Técnica: ");
                sessaoTecnica.setData(scanner.nextLine());
                System.out.print("Hora de Início da Sessão Técnica: ");
                sessaoTecnica.setHoraInicio(scanner.nextLine());
                System.out.print("Hora de Fim da Sessão Técnica:");
                sessaoTecnica.setHoraFim(scanner.nextLine());
                System.out.print("Local da Sessão Técnica: ");
                ColecaoSalas.getInstance().buscarSalaPorID(scanner.nextInt());
                System.out.print("ID do Mediador da Sessão Técnica: ");
                ColecaoProfessores.getInstance().buscarProfessorPorID(scanner.nextInt());
                break;
            }
        }

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Sessão Técnica atualizada com sucesso!\n");
    }

    public void removerSessaoTecnica() {
        int codigo;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Código da Sessão Técnica:");
        codigo = scanner.nextInt();


        for(SessaoTecnica sessaoTecnica : sessoesTecnicas) {
            if(sessaoTecnica.getCodigo() == codigo) {
                sessoesTecnicas.remove(sessaoTecnica);
                break;
            }
        }

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Estudante removido com sucesso!\n");
    }
}
