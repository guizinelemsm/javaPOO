package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Cristiano Ronaldo");
        Jogador jogador03 = new Jogador("Messi");
        Jogador[] jogadores = {jogador01, jogador02, jogador03};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
            
        }


    }
}
