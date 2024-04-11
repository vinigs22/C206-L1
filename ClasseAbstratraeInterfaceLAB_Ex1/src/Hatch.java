public class Hatch extends Carro implements Controle{

    private int portas;

    public Hatch(double valor, String cor, int ano, int portas) {
        super(valor, cor, ano);
        this.portas = portas;
    }

    @Override
    public void taxa() {
        setValor((getValor() + getValor()*0.25));
    }

    @Override
    public void mostraInfo() {
        System.out.println("--Hatch--");
        System.out.println("Valor: " + getValor()  + " mil");
        System.out.println("Cor: " + getCor() );
        System.out.println("Ano: " + getAno());
        System.out.println("Portas: " + portas);
        System.out.println("");

    }
}
