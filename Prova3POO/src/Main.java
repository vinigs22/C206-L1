import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "src/arquivo.txt";
        Arquivos arquivos = new Arquivos();
        String choice;

        System.out.println("1 - Salvar jogo");
        System.out.println("2 - Mostrar jogos");
        System.out.println("3 - Encerrar");

        while (true) {
            choice = sc.nextLine();

            switch (choice) {
                case "1":
                    arquivos.salvarJogo(sc, fileName);
                    break;
                case "2":
                    arquivos.mostrarJogos(fileName);
                    break;
                case "3":
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        }
    }
}
