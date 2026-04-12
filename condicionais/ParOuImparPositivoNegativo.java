package condicionais;

import java.util.Scanner;

public class ParOuImparPositivoNegativo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        if (numero % 2==0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");

        }

        if (numero > 0) {
            System.out.println("Positivo");
        } else if ( numero < 0 ) { 
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");

        }


input.close();


    }


}
