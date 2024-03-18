public class Main {

    public static void main(String[] args) {

        Restaurante restaurante = new Restaurante("231251", "Rua tal", "Casa da comida");
        Fornecedor fornecedor1 = new Fornecedor("Linguiça", 100);
        Fornecedor fornecedor2 = new Fornecedor("Banana", 200);

        restaurante.addFornecedor(fornecedor1);
        restaurante.addFornecedor(fornecedor2);

        restaurante.exibeInfos();

        restaurante.mostraQuantidadeAddmostraQuantidadeAdd();
    }

}
