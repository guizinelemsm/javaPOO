package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        // Anime anime = new Anime(); puxa o identico
        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
