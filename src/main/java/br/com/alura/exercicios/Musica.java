package br.com.alura.exercicios;

import java.util.Scanner;

public class Musica {
    private String album;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void exibeAlbum(){
        Audio audio = new Audio();
        Scanner scanAlbum = new Scanner(System.in);
        audio.exibirFicha();
        System.out.println("Informe o album do seu cantor favorito: ");
        album = scanAlbum.nextLine();
        System.out.println(album);
    }
}
