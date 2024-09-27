package ConversorMoeda;

import java.util.Scanner;

public class ConversorMoeda implements ConversaoFinanceira{
    private double valorDolar = 0;

    public double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    public void coletaDolar(){
        System.out.println("Informe o valor em dolar que deseja converter para real: ");
        Scanner scanDolar = new Scanner(System.in);
        valorDolar = scanDolar.nextDouble();

        scanDolar.close();
    }

    public void recebeValorDolar (ConversaoFinanceira dolar) {
        this.valorDolar += dolar.converterDolarParaReal();

    }

    @Override
    public double converterDolarParaReal() {
        return this.valorDolar * 5.44;
    }

}
