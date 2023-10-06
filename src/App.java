import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();

        Scanner scanner = new Scanner(System.in);

        int choice = -1;

        while(choice != 0) {
            System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS *****");
            System.out.println("1 - Pessoa");
            System.out.println("2 - Instituição");
            System.out.println("3 - Trabalho");
            System.out.println("6 - Mini Curso");           
            System.out.println("0 - Sair");
            System.out.print("Digite a opcao desejada: ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("\033[H\033[2J"); // Limpa o console
                    System.out.flush();
                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOA *****");
                    System.out.println("1 - Estudante");
                    System.out.println("2 - Professor");
                    System.out.println("3 - Profissional");
                    System.out.println("0 - Sair");
                    System.out.print("Digite a opcao desejada: ");
                    choice = scanner.nextInt();
                    switch(choice) {
                        case 1:
                            System.out.print("\033[H\033[2J"); // Limpa o console
                            System.out.flush();
                            System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOA // ESTUDANTE *****");
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
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOA // ESTUDANTE // CADASTRAR *****");
                                    ColecaoEstudantes.getInstance().adicionarEstudante();
                                    break;
                                case 2:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOA // ESTUDANTE // LISTAR *****");
                                    ColecaoEstudantes.getInstance().listarEstudantes();
                                    break;
                                case 3:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOA // ESTUDANTE // ATUALIZAR *****");
                                    ColecaoEstudantes.getInstance().atualizarEstudante();
                                    break;
                                case 4:
                                    System.out.print("\033[H\033[2J"); // Limpa o console
                                    System.out.flush();
                                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS // PESSOA // ESTUDANTE // REMOVER *****");
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
                            System.out.println("Cadastrar Professor");
                            break;
                        case 3:
                            System.out.print("\033[H\033[2J"); // Limpa o console
                            System.out.flush();
                            System.out.println("Cadastrar Profissional");
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
                    System.out.println("Cadastrar Apresentação");
                    break;
                case 3:
                    System.out.print("\033[H\033[2J"); // Limpa o console
                    System.out.flush();
                    System.out.println("Cadastrar Pessoa");
                    break;
                case 4:
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

        scanner.close();
    }
}
