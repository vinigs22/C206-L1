public class Sedan extends Carro implements Controle {

    private int portaMalas;

    public Sedan(double valor, String cor, int ano, int portaMalas) {
        super(valor, cor, ano);
        this.portaMalas = portaMalas;
    }

    @Override
    public void taxa() {
        setValor((getValor() + getValor()*0.2));

    }

    @Override
    public void mostraInfo() {
        System.out.println("--Sedan--");
        System.out.println("Valor: " + getValor() + " mil");
        System.out.println("Cor: " + getCor() );
        System.out.println("Ano: " + getAno());
        System.out.println("Porta Malas: " + portaMalas + "L");
        System.out.println("");

    }
}
