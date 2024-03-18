public class Restaurante {

    String cnpj;
    String endereco;
    String nome;
    Fornecedor[] fornecedores = new Fornecedor[10];

    int i = 0;


    int qtdAdd = 0;

    public Restaurante(String cnpj, String endereco, String nome) {
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.nome = nome;
    }

    void addFornecedor(Fornecedor fornecedor) {
        for (int i = 0; i < fornecedores.length; i++) {
            if (fornecedores[i] == null) {
                this.fornecedores[i] = fornecedor;
                qtdAdd++;
                return;
            }
        }
    }

    void mostraQuantidadeAddmostraQuantidadeAdd(){
        System.out.println("Quantidade de fornecedores adcionados: " + qtdAdd);
    }

    void exibeInfos(){

       System.out.println("Nome do Restaurante: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CNPJ: " + cnpj);

        for (int i = 0; i < fornecedores.length; i++) {
           if(fornecedores[i] != null){
                System.out.println("Fornecedor de " + fornecedores[i].tipo);
                System.out.println("Quantidade: " + fornecedores[i].quantidade);
                System.out.println();
           }
        }

        /*
        do {
            System.out.println("Nome do Restaurante: " + nome);
            System.out.println("Endereço: " + endereco);
            System.out.println("CNPJ: " + cnpj);

            System.out.println("Fornecedor de " + fornecedores[i].tipo);
            System.out.println("Quantidade: " + fornecedores[i].quantidade);
            System.out.println();

            i++;


        } while(fornecedores[i] != null);
        */
    }

}
