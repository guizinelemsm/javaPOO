package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Aspas");
        Jogador jogador02 = new Jogador("Sacy");
        Time time = new Time("LOUD");
        Jogador[] jogadores = {jogador01, jogador02};

        jogador01.setTime(time);
        jogador02.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("-----Jogador-----");

        jogador01.imprime();

        System.out.println("-----Time-----");

        time.imprime();
    }
}
