public class Main {

    public static void main(String[] args) {

        Arma armaGuerreiro = new Arma("Espada do Guerreiro", 10);
        Arma armaAssassino = new Arma("Lamina do assassino", 12);

        Guerreiro guerreiro = new Guerreiro("Guerreiro Flamejante", 100, 100, 10, armaGuerreiro);
        Assassino assassino = new Assassino("Assassino Sombrio", 100, 150, 5, armaAssassino);
        Mago mago = new Mago("Mago de gelo", 80, 100, 15);


        assassino.addPersonagemLista(assassino);
        guerreiro.addPersonagemLista(guerreiro);
        mago.addPersonagemLista(mago);

        System.out.println("-----Antes da batalha-----");
        guerreiro.mostraInfo();
        assassino.mostraInfo();
        mago.mostraInfo();

        System.out.println("-----Batalha-----");
        guerreiro.atacar(mago);
        mago.usarHabilidade(guerreiro);
        mago.usarHabilidade(guerreiro);
        assassino.atacar(mago);
        assassino.atacar(guerreiro);
        guerreiro.atacar(assassino);
        System.out.println("");

        System.out.println("-----Após batalha-----");
        guerreiro.mostraInfo();
        assassino.mostraInfo();
        mago.mostraInfo();


    }

}
