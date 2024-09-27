package br.com.alura.exercicios;

import java.util.Scanner;

public class AudioMain {
    public static void main(String[] args) {
        Audio audio = new Audio();
        Musica musica = new Musica ();
        Podcast podcast = new Podcast();
        System.out.println("****MUSICA****");
        musica.exibeAlbum();
        System.out.println("****PODCAST****");
        podcast.exibiEpisodios();
    }
}
