public class Membro {

    String nome;
    String funcao;

    public Membro(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return nome + ", Função: " + funcao;

    }
}
