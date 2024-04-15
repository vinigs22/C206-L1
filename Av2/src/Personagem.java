public class Personagem {

    private String nome;
    private int vida;
    private int energia;
    private int poder;
    Personagem[] personagens = new Personagem[5];


    public Personagem(String nome, int vida, int energia, int poder) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.poder = poder;
    }

    public void addPersonagemLista(Personagem personagem){
        for (int i = 0; i < personagens.length; i++) {
            if(personagens[i] == null){
                personagens[i] = personagem;
                break;
            }
        }
    }

    public void usarHabilidade(Personagem personagem){
        setVida(personagem.getVida() - this.poder);
        System.out.println("Dano Causado: " + this.poder);
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Energia: " + energia);
        System.out.println("Poder: " + poder);
    }

    public int getVida() {
        return vida;
    }

    public int getPoder() {
        return poder;
    }

    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
