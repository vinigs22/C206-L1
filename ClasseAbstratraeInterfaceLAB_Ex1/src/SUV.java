public class SUV extends Carro implements Controle{

    private String tracao;

    public SUV(double valor, String cor, int ano, String tracao) {
        super(valor, cor, ano);
        this.tracao = tracao;
    }

    @Override
    public void taxa() {
        setValor((getValor() + getValor()*0.3));
    }

    @Override
    public void mostraInfo() {
        System.out.println("--SUV--");
        System.out.println("Valor: " + getValor() + " mil");
        System.out.println("Cor: " + getCor() );
        System.out.println("Ano: " + getAno());
        System.out.println("Tração: " + tracao);
        System.out.println("");
    }
}
