import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();

        Scanner scanner = new Scanner(System.in);

        int choice = -1;

        while(choice != 0) {
            System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS *****");
            System.out.println("1 - Pessoas");
            System.out.println("2 - Instituições");
            System.out.println("3 - Eventos");
            System.out.println("0 - Sair");
            System.out.print("Digite a opcao desejada: ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("\033[H\033[2J"); // Limpa o console
                    System.out.flush();
                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOAS *****");
                    System.out.println("1 - Estudantes");
                    System.out.println("2 - Professores");
                    System.out.println("3 - Profissionais");
                    System.out.println("0 - Sair");
                    System.out.print("Digite a opcao desejada: ");
                    choice = scanner.nextInt();
                    switch(choice) {
                        case 1:
                            System.out.print("\033[H\033[2J"); // Limpa o console
                            System.out.flush();
                            System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOAS // ESTUDANTES *****");
                            System.out.println("1 - Cadastrar");
                            System.out.println("2 - Listar");
                            System.out.println("3 - Atualizar");
                            System.out.println("4 - Remover");
                            System.out.println("0 - Sair");
                            System.out.print("Digite a opcao desejada: ");
                            choice = scanner.nextInt();
                            switch(choice) {
                                case 1:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOAS // ESTUDANTES // CADASTRAR *****");
                                    ColecaoEstudantes.getInstance().adicionarEstudante();
                                    break;
                                case 2:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOAS // ESTUDANTES // LISTAR *****");
                                    ColecaoEstudantes.getInstance().listarEstudantes();
                                    break;
                                case 3:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOAS // ESTUDANTES // ATUALIZAR *****");
                                    ColecaoEstudantes.getInstance().atualizarEstudante();
                                    break;
                                case 4:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOAS // ESTUDANTES // REMOVER *****");
                                    ColecaoEstudantes.getInstance().removerEstudante();
                                    break;
                                default:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("Opção inválida");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.print("\033[H\033[2J"); // Limpa o console
                            System.out.flush();
                            System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOAS // PROFESSORES *****");
                            System.out.println("1 - Cadastrar");
                            System.out.println("2 - Listar");
                            System.out.println("3 - Atualizar");
                            System.out.println("4 - Remover");
                            System.out.println("0 - Sair");
                            System.out.print("Digite a opcao desejada: ");
                            choice = scanner.nextInt();
                            switch(choice) {
                                case 1:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOAS // PROFESSORES // CADASTRAR *****");
                                    ColecaoProfessores.getInstance().adicionarProfessor();
                                    break;
                                case 2:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOAS // PROFESSORES // LISTAR *****");
                                    ColecaoProfessores.getInstance().listarProfessores();
                                    break;
                                case 3:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOAS // PROFESSORES // ATUALIZAR *****");
                                    ColecaoProfessores.getInstance().atualizarProfessor();
                                    break;
                                case 4:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOAS // PROFESSORES // REMOVER *****");
                                    ColecaoProfessores.getInstance().removerProfessor();
                                    break;
                                default:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("Opção inválida");
                                    break;
                            }
                            break;
                        case 3:
                            System.out.print("\033[H\033[2J"); // Limpa o console
                            System.out.flush();
                            System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOAS // PROFISSIONAIS *****");
                            System.out.println("1 - Cadastrar");
                            System.out.println("2 - Listar");
                            System.out.println("3 - Atualizar");
                            System.out.println("4 - Remover");
                            System.out.println("0 - Sair");
                            System.out.print("Digite a opcao desejada: ");
                            choice = scanner.nextInt();
                            switch(choice) {
                                case 1:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOAS // PROFISSIONAIS // CADASTRAR *****");
                                    ColecaoProfissionais.getInstance().adicionarProfissional();
                                    break;
                                case 2:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOAS // PROFISSIONAIS // LISTAR *****");
                                    ColecaoProfissionais.getInstance().listarProfissionais();
                                    break;
                                case 3:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOAS // PROFISSIONAIS // ATUALIZAR *****");
                                    ColecaoProfissionais.getInstance().atualizarProfissional();
                                    break;
                                case 4:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOAS // PROFISSIONAIS // REMOVER *****");
                                    ColecaoProfissionais.getInstance().removerProfissional();
                                    break;
                                case 0:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("Saindo...");
                                    break;
                                default:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("Opção inválida");
                                    break;
                            }
                            break;
                        default:
                            System.out.print("\033[H\033[2J"); // Limpa o console
                            System.out.flush();
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("\033[H\033[2J"); // Limpa o console
                    System.out.flush();
                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // INSTITUICOES *****");
                    System.out.println("1 - Universidades");
                    System.out.println("2 - Empresas");
                    System.out.println("0 - Sair");
                    System.out.print("Digite a opcao desejada: ");
                    choice = scanner.nextInt();
                    switch(choice) {
                        case 1:
                            System.out.print("\033[H\033[2J"); // Limpa o console
                            System.out.flush();
                            System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // INSTITUICOES // UNIVERSIDADES *****");
                            System.out.println("1 - Cadastrar");
                            System.out.println("2 - Listar");
                            System.out.println("3 - Atualizar");
                            System.out.println("4 - Remover");
                            System.out.println("0 - Sair");
                            System.out.print("Digite a opcao desejada: ");

                            choice = scanner.nextInt();
                            switch(choice) {
                                case 1:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // INSTITUICOES // UNIVERSIDADES // CADASTRAR *****");
                                    ColecaoEstudantes.getInstance().adicionarEstudante();
                                    break;
                                case 2:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // INSTITUICOES // UNIVERSIDADES // LISTAR *****");
                                    ColecaoEstudantes.getInstance().listarEstudantes();
                                    break;
                                case 3:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // INSTITUICOES // UNIVERSIDADES // ATUALIZAR *****");
                                    ColecaoEstudantes.getInstance().atualizarEstudante();
                                    break;
                                case 4:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // INSTITUICOES // UNIVERSIDADES // REMOVER *****");
                                    ColecaoEstudantes.getInstance().removerEstudante();
                                    break;
                                case 0:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("Saindo...");
                                    break;
                                default:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("Opção inválida");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.print("\033[H\033[2J"); // Limpa o console
                            System.out.flush();
                            System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // INSTITUICOES // EMPRESAS *****");
                            System.out.println("1 - Cadastrar");
                            System.out.println("2 - Listar");
                            System.out.println("3 - Atualizar");
                            System.out.println("4 - Remover");
                            System.out.println("0 - Sair");
                            System.out.print("Digite a opcao desejada: ");

                            choice = scanner.nextInt();
                            switch(choice) {
                                case 1:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // INSTITUICOES // EMPRESAS // CADASTRAR *****");
                                    ColecaoEstudantes.getInstance().adicionarEstudante();
                                    break;
                                case 2:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // INSTITUICOES // EMPRESAS // LISTAR *****");
                                    ColecaoEstudantes.getInstance().listarEstudantes();
                                    break;
                                case 3:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // INSTITUICOES // EMPRESAS // ATUALIZAR *****");
                                    ColecaoEstudantes.getInstance().atualizarEstudante();
                                    break;
                                case 4:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // INSTITUICOES // EMPRESAS // REMOVER *****");
                                    ColecaoEstudantes.getInstance().removerEstudante();
                                    break;
                                case 0:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("Saindo...");
                                    break;
                                default:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("Opção inválida");
                                    break;
                            }
                            break;
                    }
                case 3:
                    System.out.print("\033[H\033[2J"); // Limpa o console
                    System.out.flush();
                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS *****");
                    System.out.println("1 - Minicursos");
                    System.out.println("2 - Sessoes Tecnicas");
                    System.out.println("3 - Apresentacoes");
                    System.out.println("4 - Trabalhos");
                    System.out.println("5 - Salas");
                    System.out.println("0 - Sair");
                    System.out.print("Digite a opcao desejada: ");
                    
                    choice = scanner.nextInt();
                    switch(choice) {
                        case 1:
                            System.out.print("\033[H\033[2J"); // Limpa o console
                            System.out.flush();
                            System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // MINICURSOS *****");
                            System.out.println("1 - Cadastrar");
                            System.out.println("2 - Adicionar Participante");
                            System.out.println("3 - Listar");
                            System.out.println("4 - Atualizar");
                            System.out.println("5 - Remover");
                            System.out.println("0 - Sair");
                            System.out.print("Digite a opcao desejada: ");
                            choice = scanner.nextInt();
                            switch(choice) {
                                case 1:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // SESSOES TECNICAS // CADASTRAR *****");
                                    ColecaoMiniCurso.getInstance().adicionarMiniCurso();
                                    break;
                                case 2:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // SESSOES TECNICAS // ADICIONAR PARTICIPANTE *****");
                                    ColecaoMiniCurso.getInstance().adicionarParticipante();
                                    break;
                                case 3:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // SESSOES TECNICAS // LISTAR *****");
                                    ColecaoMiniCurso.getInstance().listarMiniCurso();
                                    break;
                                case 4:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // SESSOES TECNICAS // ATUALIZAR *****");
                                    ColecaoMiniCurso.getInstance().atualizarMiniCurso();
                                    break;
                                case 5:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // SESSOES TECNICAS // REMOVER *****");
                                    ColecaoMiniCurso.getInstance().removerMiniCurso();
                                    break;
                                default:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("Opção inválida");
                                    break;
                            }   
                            break;
                        case 2:
                            System.out.print("\033[H\033[2J"); // Limpa o console
                            System.out.flush();
                            System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // SESSOES TECNICAS *****");
                            System.out.println("1 - Cadastrar");
                            System.out.println("2 - Adicionar Apresentacao");
                            System.out.println("3 - Listar");
                            System.out.println("4 - Atualizar");
                            System.out.println("5 - Remover");
                            System.out.println("0 - Sair");
                            System.out.print("Digite a opcao desejada: ");
                            choice = scanner.nextInt();
                            switch(choice) {
                                case 1:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // SESSOES TECNICAS // CADASTRAR *****");
                                    ColecaoSessoesTecnicas.getInstance().adicionarSessaoTecnica();
                                    break;
                                case 2:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // SESSOES TECNICAS // ADICIONAR APRESENTACAO *****");
                                    ColecaoSessoesTecnicas.getInstance().adicionarApresentacao();
                                    break;
                                case 3:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // SESSOES TECNICAS // LISTAR *****");
                                    ColecaoSessoesTecnicas.getInstance().listarSessoesTecnicas();
                                    break;
                                case 4:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // SESSOES TECNICAS // ATUALIZAR *****");
                                    ColecaoSessoesTecnicas.getInstance().atualizarSessaoTecnica();
                                    break;
                                case 5:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // SESSOES TECNICAS // REMOVER *****");
                                    ColecaoSessoesTecnicas.getInstance().removerSessaoTecnica();
                                    break;
                                default:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("Opção inválida");
                                    break;
                            }   
                            break;
                        case 3:
                            System.out.print("\033[H\033[2J"); // Limpa o console
                            System.out.flush();
                            System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // APRESENTACOES *****");
                            System.out.println("1 - Cadastrar");
                            System.out.println("2 - Listar");
                            System.out.println("3 - Atualizar");
                            System.out.println("4 - Remover");
                            System.out.println("0 - Sair");
                            System.out.print("Digite a opcao desejada: ");
                            choice = scanner.nextInt();
                            switch(choice) {
                                case 1:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // APRESENTACOES // CADASTRAR *****");
                                    ColecaoApresentacoes.getInstance().adicionarApresentacao();
                                    break;
                                case 2:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // APRESENTACOES // LISTAR *****");
                                    ColecaoApresentacoes.getInstance().listarApresentacoes();
                                    break;
                                case 3:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // APRESENTACOES // ATUALIZAR *****");
                                    ColecaoApresentacoes.getInstance().atualizarApresentacao();
                                    break;
                                case 4:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // APRESENTACOES // REMOVER *****");
                                    ColecaoApresentacoes.getInstance().removerApresentacao();
                                    break;
                                default:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("Opção inválida");
                                    break;
                            }   
                            break;
                        case 4:
                            System.out.print("\033[H\033[2J"); // Limpa o console
                            System.out.flush();
                            System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // TRABALHOS *****");
                            System.out.println("1 - Cadastrar");
                            System.out.println("2 - Listar");
                            System.out.println("3 - Atualizar");
                            System.out.println("4 - Remover");
                            System.out.println("0 - Sair");
                            System.out.print("Digite a opcao desejada: ");
                            choice = scanner.nextInt();
                            switch(choice) {
                                case 1:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // TRABALHOS // CADASTRAR *****");
                                    ColecaoTrabalhos.getInstance().adicionarTrabalho();
                                    break;
                                case 2:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // TRABALHOS // LISTAR *****");
                                    ColecaoTrabalhos.getInstance().listarTrabalhos();
                                    break;
                                case 3:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // TRABALHOS // ATUALIZAR *****");
                                    ColecaoTrabalhos.getInstance().atualizarTrabalho();
                                    break;
                                case 4:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // TRABALHOS // REMOVER *****");
                                    ColecaoTrabalhos.getInstance().removerTrabalho();
                                    break;
                                default:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("Opção inválida");
                                    break;
                            }   
                            break;

                        case 5:
                            System.out.print("\033[H\033[2J"); // Limpa o console
                            System.out.flush();
                            System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // SALAS *****");
                            System.out.println("1 - Cadastrar");
                            System.out.println("2 - Listar");
                            System.out.println("3 - Atualizar");
                            System.out.println("4 - Remover");
                            System.out.println("0 - Sair");
                            System.out.print("Digite a opcao desejada: ");
                            choice = scanner.nextInt();
                            switch(choice) {
                                case 1:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // SALAS // CADASTRAR *****");
                                    ColecaoSalas.getInstance().adicionarSala();
                                    break;
                                case 2:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // SALAS // LISTAR *****");
                                    ColecaoSalas.getInstance().listarSalas();
                                    break;
                                case 3:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // SALAS // ATUALIZAR *****");
                                    ColecaoSalas.getInstance().atualizarSala();
                                    break;
                                case 4:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // EVENTOS // SALAS // REMOVER *****");
                                    ColecaoSalas.getInstance().removerSala();
                                    break;
                                default:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("Opção inválida");
                                    break;
                            }   
                            break;
                        case 0:
                            System.out.print("\033[H\033[2J"); // Limpa o console
                            System.out.flush();
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.print("\033[H\033[2J"); // Limpa o console
                            System.out.flush();
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;
                case 0:
                    System.out.print("\033[H\033[2J"); // Limpa o console
                    System.out.flush();
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.print("\033[H\033[2J"); // Limpa o console
                    System.out.flush();
                    System.out.println("Opção inválida");
                    break;
                }
            }
        
            // scanner.close();
        }
    }
