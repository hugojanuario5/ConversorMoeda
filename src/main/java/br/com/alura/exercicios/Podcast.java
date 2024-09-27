package br.com.alura.exercicios;

import java.util.Scanner;

public class Podcast extends Audio {
    private int quantidadeEpisodios;

    public int getQuantidadeEpisodios() {
        return quantidadeEpisodios;
    }

    public void setQuantidadeEpisodios(int quantidadeEpisodios) {
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    public void exibiEpisodios(){
        Audio audio = new Audio();
        audio.exibirFicha();
        Scanner scanEpisodios = new Scanner(System.in);
        System.out.println("Informe a quantidade de episodios da serie "+ getNome()+ ": ");
        quantidadeEpisodios = scanEpisodios.nextInt();
        System.out.println(quantidadeEpisodios + " Episodios");

    }
}
