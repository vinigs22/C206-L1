public class Arma {

    private String nome;
    private int dano;

    public Arma(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public String getNome() {
        return nome;
    }
}
