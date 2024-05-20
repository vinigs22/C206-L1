import java.io.*;
import java.util.Scanner;

class Arquivos {
    /*
    void ordenarJogos(String fileName, boolean crescente) {
        List<Jogo> jogos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] partes = line.split(", ");
                String nome = partes[0];
                double preco = Double.parseDouble(partes[1]);
                String genero = partes[2];
                jogos.add(new Jogo(nome, preco, genero));
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler os jogos!");
            return;
        }

        if (crescente) {
            jogos.sort(Comparator.comparingDouble(Jogo::getPreco));
        } else {
            jogos.sort(Comparator.comparingDouble(Jogo::getPreco).reversed());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Jogo jogo : jogos) {
                bw.write(jogo.toString() + "\n");
            }
            System.out.println("Jogos ordenados com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os jogos ordenados!");
        }
    }
    */

    void salvarJogo(Scanner sc, String fileName) {
        try {
            System.out.print("Nome do jogo: ");
            String nome = sc.nextLine();
            System.out.print("Preço do jogo: ");
            double preco = sc.nextDouble();
            sc.nextLine();
            System.out.print("Gênero do jogo: ");
            String genero = sc.nextLine();
            if (preco <= 0) {
                throw new PrecoNegativoException("O preço não pode ser menor ou igual a zero.");
            }

            Jogo jogo = new Jogo(nome, preco, genero);
            try (FileWriter fw = new FileWriter(fileName, true);
                 BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(jogo.toString() + "\n");
                System.out.println("Jogo salvo com sucesso!");
            }
        } catch (PrecoNegativoException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro ao salvar o jogo!");
        }
    }

    void mostrarJogos(String fileName) {
        //ordenarJogos(fileName, true);

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Não foi possível mostrar os jogos!");
        }
    }
}
