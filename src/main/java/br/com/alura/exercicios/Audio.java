package br.com.alura.exercicios;

import java.util.Scanner;

public class Audio {
    private String nome;
    private double nota;
    private double tempoMinutos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getTempoMinutos() {
        return tempoMinutos;
    }

    public void setTempoMinutos(double tempoMinutos) {
        this.tempoMinutos = tempoMinutos;
    }

    public void exibirFicha(){
        Scanner scanFicha = new Scanner (System.in);
        System.out.println("Informe o nome: ");
        nome = scanFicha.nextLine();
        System.out.println("Informe a nota que deseja dar: ");
        nota = scanFicha.nextDouble();
        System.out.println("Informe os minutos de reprodução: ");
        tempoMinutos = scanFicha.nextDouble();
        System.out.printf("Nome: %s\n Nota: %.2f\n Tempo em minutos: %.2f\n",nome, nota, tempoMinutos);

    }
}
