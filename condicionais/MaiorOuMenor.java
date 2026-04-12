package condicionais;

import java.util.Scanner;

public class MaiorOuMenor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = input.nextInt();

        if(numero1 > numero2) {
            System.out.println("O maior numero é:" + numero1);

        } else if (numero2 > numero1) {
            System.out.println("O maior numero é: " + numero2);
        } else {
            System.out.println("Os números são iguais!");

        }

        input.close();
    }
}
