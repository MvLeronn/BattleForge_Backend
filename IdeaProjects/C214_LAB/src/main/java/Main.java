import Monstro.Monstro;
import personagem.Personagem;

public class Main {
    public static void main(String[] args) {
        Personagem p = new Personagem("Alvin", 1000, 100, 500);
        p.exibirInformacoes();

        Monstro m1 = new Monstro("Mesa",400,400,100);
        m1.exibirInformacoes();
    }
}
