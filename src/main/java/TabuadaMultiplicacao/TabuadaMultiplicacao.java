package TabuadaMultiplicacao;

import java.util.Scanner;

public class TabuadaMultiplicacao implements Tabuada{
    private int number = 5;

    public void recebeNumero(){
        System.out.println("Informe o numero que deseja exibir a tabuada: ");
        Scanner scanNumber = new Scanner (System.in);
        number = scanNumber.nextInt();

    }

    @Override
    public int getMostrarTabuada() {

        for (int i = 1; i < 11; i++) {
            int result = number * i;
            System.out.printf(number + "x" + i + "= " + result + "\n");
        }

        return this.number;
    }
}
