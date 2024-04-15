public class Assassino extends Personagem implements LutarComArmas{

    Arma arma;

    public Assassino(String nome, int vida, int energia, int poder, Arma arma) {
        super(nome, vida, energia, poder);
        this.arma = arma;
    }



    @Override
    public void atacar(Personagem personagem) {
        personagem.setVida(personagem.getVida() - this.arma.getDano());
        System.out.println( this.getNome() + " causou " + this.arma.getDano() + " de dano no " + personagem.getNome());
    }

    @Override
    public void mostraInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Energia: " + getEnergia());
        System.out.println("Dano: " + this.arma.getDano());
        System.out.println("Arma " + arma.getNome());
        System.out.println("");

    }
}
