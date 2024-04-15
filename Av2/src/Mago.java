public class Mago extends Personagem{

    public Mago(String nome, int vida, int energia, int poder) {
        super(nome, vida, energia, poder);
    }

    @Override
    public void usarHabilidade(Personagem personagem) {
        personagem.setVida(personagem.getVida() - this.getPoder());
        System.out.println( this.getNome() + " causou " + this.getPoder() + " de dano no " + personagem.getNome());

    }

    @Override
    public void mostraInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Energia: " + getEnergia());
        System.out.println("Dano Magico: " + this.getPoder());

        System.out.println("");
    }
}
