public class Funcionario extends Pessoa{

    int matricula = 0;
    Pessoa pessoas = new Pessoa();

    Funcionario(int matricula, Pessoa pessoas) {
        this.matricula = matricula;
        this.pessoas = pessoas;
    }

}
