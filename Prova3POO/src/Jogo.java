class Jogo implements Comparable<Jogo> {
    private String nome;
    private double preco;
    private String genero;

    public Jogo(String nome, double preco, String genero) {
        this.nome = nome;
        this.preco = preco;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return nome + ", " + preco + ", " + genero;
    }

    @Override
    public int compareTo(Jogo outroJogo) {
        return Double.compare(this.preco, outroJogo.preco);
    }

    public double getPreco() {
        return preco;
    }
}
