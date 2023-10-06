import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColecaoSalas {
    private static ColecaoSalas colecaoSalas = null;
    private List<Sala> salas = new ArrayList<>();

    private ColecaoSalas() {}

    public static synchronized ColecaoSalas getInstance() {
        if(colecaoSalas == null) {
            colecaoSalas = new ColecaoSalas();
        }
        return colecaoSalas;
    }

    public void adicionarSala() {
        int predio, numSala;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Prédio da Sala: ");
        predio = scanner.nextInt();
        System.out.print("Sala: ");
        numSala = scanner.nextInt();

        Sala sala = new Sala(predio, numSala);
        salas.add(sala);

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Sala cadastrada com sucesso!\n");
    }

    public void listarSalas() {
        if(salas.size() == 0) {
            System.out.println("Não há salas cadastradas!\n");
        }
        
        for(Sala sala : salas) {
            System.out.println("Código: " + sala.getCodigo());
            System.out.println("Prédio: " + sala.getPredio());
            System.out.println("Sala: " + sala.getNumero());
            System.out.println("");
        }
    }

    public void atualizarSala() {
        int cod;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Código da Sala: ");
        cod = scanner.nextInt();

        for(Sala sala : salas) {
            if(sala.getCodigo() == cod) {
                int predio, numSala;

                System.out.print("Prédio da Sala: ");
                predio = scanner.nextInt();
                System.out.print("Sala: ");
                numSala = scanner.nextInt();

                sala.setPredio(predio);
                sala.setNumero(numSala);
                break;
            }
        }

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Sala atualizada com sucesso!\n");
    }

    public void removerSala() {
        int cod;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Código da Sala: ");
        cod = scanner.nextInt();

        for(Sala sala : salas) {
            if(sala.getCodigo() == cod) {
                salas.remove(sala);
                break;
            }
        }

        System.out.print("\033[H\033[2J"); // Limpa o console
        System.out.flush();
        System.out.println("Sala removida com sucesso!\n");
    }

    public Sala buscarSalaPorID(int idSala) {
        for(Sala sala : salas) {
            if(sala.getCodigo() == idSala) {
                return sala;
            }
        }
        return null;
    }
}
