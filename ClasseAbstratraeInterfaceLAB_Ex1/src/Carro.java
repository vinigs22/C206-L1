public class Carro {

    private double valor;
    private String cor;
    private int ano;

    public Carro(double valor, String cor, int ano) {
        this.valor = valor;
        this.cor = cor;
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
