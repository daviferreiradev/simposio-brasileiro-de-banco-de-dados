import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColecaoMiniCurso {
    private static ColecaoMiniCurso colecaoMiniCurso = null;
    private List<MiniCurso> miniCursos = new ArrayList<>();

    private ColecaoMiniCurso() {}

    public static synchronized ColecaoMiniCurso getInstance() {
        if(colecaoMiniCurso == null) {
            colecaoMiniCurso = new ColecaoMiniCurso();
        }
        return colecaoMiniCurso;
    }

    public void adicionarMiniCurso() {
        String titulo, data, horaInicio, horaFim;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Título do Minicurso: ");
        titulo = scanner.nextLine();
        System.out.print("Data do Minicurso: ");
        data = scanner.nextLine();
        System.out.print("Hora de Início do Minicurso: ");
        horaInicio = scanner.nextLine();
        System.out.print("Hora de Fim do Minicurso: ");
        horaFim = scanner.nextLine();
        System.out.print("ID do Profissional do Minicurso: ");
        int idProfissional = scanner.nextInt();
        Profissional profissional = ColecaoProfissionais.getInstance().buscarProfissionalPorID(idProfissional);
        System.out.print("ID do Local do Minicurso: ");
        int idSala = scanner.nextInt();
        Sala sala = ColecaoSalas.getInstance().buscarSalaPorID(idSala);

        MiniCurso miniCurso = new MiniCurso(titulo, data, horaInicio, horaFim, profissional, sala);
        miniCursos.add(miniCurso);

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Mini Curso cadastrado com sucesso!\n");
    }

    public void listarMiniCurso() {
        if(miniCursos.size() == 0) {
            System.out.println("Não há Mini Cursos cadastrados!\n");
        }
        
        for(MiniCurso miniCurso : miniCursos) {
            System.out.println("Título: " + miniCurso.getTitulo());
            System.out.println("Data: " + miniCurso.getData());
            System.out.println("Hora de Início: " + miniCurso.getHoraInicio());
            System.out.println("Hora de Fim: " + miniCurso.getHoraFim());
            System.out.println("Local: Prédio " + miniCurso.getLocal().getPredio() + ", Sala " + miniCurso.getLocal().getNumero());
            System.out.println("Profissional: " + miniCurso.getProfissional().getNome());
            for(Pessoa participante : miniCurso.getParticipantes()) {
                System.out.println("Participante: " + participante.getNome());
            }
            System.out.println("");
        }
        
    }

    public void atualizarMiniCurso() {
        int cod;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Código do Minicurso: ");
        cod = scanner.nextInt();

        for(MiniCurso miniCurso : miniCursos) {
            if(miniCurso.getCodigo() == cod) {
                System.out.print("Título do Minicurso: ");
                miniCurso.setTitulo(scanner.nextLine());
                System.out.print("Data do Minicurso: ");
                miniCurso.setData(scanner.nextLine());
                System.out.print("Hora de Início do Minicurso: ");
                miniCurso.setHoraInicio(scanner.nextLine());
                System.out.print("Hora de Fim do Minicurso: ");
                miniCurso.setHoraFim(scanner.nextLine());
                System.out.print("ID do Profissional do Minicurso: ");
                int idProfissional = scanner.nextInt();
                Profissional profissional = ColecaoProfissionais.getInstance().buscarProfissionalPorID(idProfissional);
                miniCurso.setProfissional(profissional);
                System.out.print("ID do Local do Minicurso: ");
                int idSala = scanner.nextInt();
                Sala sala = ColecaoSalas.getInstance().buscarSalaPorID(idSala);
                miniCurso.setLocal(sala);
                break;
            }
        }
        
        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Mini Curso atualizado com sucesso!\n");
    }

    public void removerMiniCurso() {
        int cod;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Código do Minicurso: ");
        cod = scanner.nextInt();

        for(MiniCurso miniCurso : miniCursos) {
            if(miniCurso.getCodigo() == cod) {
                miniCursos.remove(miniCurso);
                break;
            }
        }

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Mini Curso removido com sucesso!\n");
    }

    public void adicionarParticipante() {
        int cod;
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID do Mini Curso: ");
        cod = scanner.nextInt();

        for(MiniCurso miniCurso : miniCursos) {
            if(miniCurso.getCodigo() == cod) {
                System.out.println("QUal o tipo de participante?\n1 - Estudante\n2 - Professor\n3 - Profissional");
                int tipoParticipante = scanner.nextInt();
                switch(tipoParticipante) {
                    case 1:
                        System.out.print("ID do Estudante: ");
                        int idEstudante = scanner.nextInt();
                        Estudante estudante = ColecaoEstudantes.getInstance().buscarEstudantePorMatricula(idEstudante);
                        miniCurso.getParticipantes().add(estudante);
                        break;
                    case 2:
                        System.out.print("ID do Professor: ");
                        int idProfessor = scanner.nextInt();
                        Pessoa professor = ColecaoProfessores.getInstance().buscarProfessorPorID(idProfessor);
                        miniCurso.getParticipantes().add(professor);
                        break;
                    case 3:
                        System.out.print("ID do Profissional: ");
                        int idProfissional = scanner.nextInt();
                        Pessoa profissional = ColecaoProfissionais.getInstance().buscarProfissionalPorID(idProfissional);
                        miniCurso.getParticipantes().add(profissional);
                        break;
                }
                break;
            }
        }

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Participante adicionado com sucesso!\n");
    }
}
