package Monstro;

public class Monstro {
    private String nome;
    private int vida;
    private int energia;
    private int forca;

    public Monstro(String nome, int vida, int energia, int forca) {
        this.nome = nome;
        setVida(vida);
        setEnergia(energia);
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

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia < 0) {
            throw new IllegalArgumentException("Erro ao definir a energia");
        }
        this.energia = energia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        if (forca < 0) {
            throw new IllegalArgumentException("Erro ao definir a força");
        }
        this.forca = forca;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + forca);
    }
}
