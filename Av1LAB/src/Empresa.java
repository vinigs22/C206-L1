public class Empresa {

    String nome;
    String cnpj;
    String endereco;

    int numFuncionarios = 0;

    Funcionario[] funcionarios = new Funcionario[20];

    int funcionariosDisponiveis = 0;

    Empresa(String nome, String cnpj, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    void mostraInfo(){
        System.out.println("Nome da empresa: " + nome);
        System.out.println("CNPJ da empresa: " + cnpj);
        System.out.println("Endereço da empresa: " + endereco);
        System.out.println();
        System.out.println("Lista de funcionarios");

        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null){
                System.out.println("Matricula: " + funcionarios[i].matricula);
                System.out.println("Nome: " + funcionarios[i].pessoas.nome);
                System.out.println("CPF: " + funcionarios[i].pessoas.cpf);
                System.out.println("Idade: " + funcionarios[i].pessoas.idade);
                System.out.println();

            }
        }
    }

    void adicionarFuncinario(Funcionario funcionario){

        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] == null){
                funcionarios[i] = funcionario;
                funcionariosDisponiveis++;
                numFuncionarios++;
            }
        }
    }

    void alocarFuncionario(){
        System.out.println("Alocando um funcionario...");
        System.out.println();
        funcionariosDisponiveis = funcionariosDisponiveis - 1;
    }

    void contarFuncionarioDisponiveis(){
        if (numFuncionarios != 0) {
            double porcentagem = ((double)funcionariosDisponiveis / numFuncionarios) * 100;
            System.out.println("Porcentagem de funcionarios disponiveis: " + porcentagem + "%");
            System.out.println();
        }else{
            System.out.println("Sem funcionarios cadastrados");
        }
    }

}
