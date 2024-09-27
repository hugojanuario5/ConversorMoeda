package ConversorMoeda;

public class ConversorMoedaMain {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.coletaDolar();
        System.out.println(conversor.converterDolarParaReal());
    }
}
