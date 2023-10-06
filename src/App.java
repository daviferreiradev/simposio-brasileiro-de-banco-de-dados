import java.util.ArrayList;
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
                    System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS / CADASTRAR *****");
                    System.out.println("1 - Estudante");
                    System.out.println("2 - Professor");
                    System.out.println("3 - Profissional");
                    System.out.println("0 - Sair");
                    System.out.print("Digite a opcao desejada: ");
                    choice = scanner.nextInt();
                    switch(choice) {
                        case 1:
                            System.out.println("***** SIMPOSIO BRASILEIRO DE  BANCO DE DADOS / ESTUDANTE *****");
                            System.out.println("1 - Cadastrar");
                            System.out.println("2 - Listar");
                            System.out.println("3 - Remover");
                            System.out.print("Digite a opcao desejada: ");
                            choice = scanner.nextInt();
                            switch(choice) {
                                case 1:
                                    Estudante.cadastrarEstudante();
                                    break;
                                case 2:
                                    Estudante.listarEstudantes();
                                    break;
                                case 3:
                                    Estudante.removerEstudante();
                                    break;
                                default:
                                    System.out.println("Opção inválida");
                                    break;
                            }

                            break;
                        case 2:
                            System.out.println("Cadastrar Professor");
                            break;
                        case 3:
                            System.out.println("Cadastrar Profissional");
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Cadastrar Apresentação");
                    break;
                case 3:
                    System.out.println("Cadastrar Pessoa");
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
