package personagem;

public class Personagem {
    private String nome;
    private int vida;
    private int mana;
    private int forca;

    public Personagem(String nome, int vida, int mana, int forca) {
        this.nome = nome;
        setVida(vida);
        setMana(mana);
        setForca(forca);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 0) {
            throw new IllegalArgumentException("A vida não pode ser negativa.");
        }
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("A mana não pode ser negativa.");
        }
        this.mana = mana;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        if (forca < 0) {
            throw new IllegalArgumentException("A força não pode ser negativa.");
        }
        this.forca = forca;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Mana: " + mana);
        System.out.println("Força: " + forca);
    }
}