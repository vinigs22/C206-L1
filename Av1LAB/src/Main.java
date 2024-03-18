import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("Empreiteira Company", "1234567891234", "Rua Tal, 46, Varginha");

        Scanner pedido = new Scanner(System.in);

        int escolha;

        while(true) {
            System.out.println("Digite 1 para mostrar as informações da empresa");
            System.out.println("Digite 2 para adicionar um funcionário");
            System.out.println("Digite 3 para alocar um funcionário");
            System.out.println("Digite 4 para contar funcionários disponíveis");
            System.out.println("Digite 5 para sair do programa");

            escolha = pedido.nextInt();
            pedido.nextLine();

            if(escolha == 1){
                empresa.mostraInfo();
            } else if(escolha == 2){
                System.out.println("Digite a matrícula: ");
                int matricula = pedido.nextInt();
                pedido.nextLine();
                System.out.println("Digite o nome do funcionário: ");
                String nome = pedido.nextLine();
                System.out.println("Digite o CPF do funcionário: ");
                String cpf = pedido.nextLine();
                System.out.println("Digite a idade do funcionário: ");
                int idade = pedido.nextInt();
                pedido.nextLine();

                Pessoa pessoa = new Pessoa();

                pessoa.nome = nome;
                pessoa.cpf = cpf;
                pessoa.idade = idade;

                Funcionario funcionario1 = new Funcionario(matricula, pessoa);
                empresa.adicionarFuncinario(funcionario1);

            } else if (escolha == 3) {

                empresa.alocarFuncionario();

            } else if (escolha == 4){

                empresa.contarFuncionarioDisponiveis();

            } else if (escolha == 5) {
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Opção inválida, por favor escolha novamente");
            }
        }
    }
}
