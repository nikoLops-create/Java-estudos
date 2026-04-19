package condicionais;

import java.util.Scanner;

public class MenuOpcoesSwitch {

     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);

          System.out.println("Escolha uma opção: ");
          System.out.println("1 Par ou Impar;");
          System.out.println("2 Positivo ou Negativo;");
          System.out.println("3 idade:");
          System.out.print("Opcao:");

          int opcao = input.nextInt();

          int numero;

          switch (opcao) {

               case 1:
                    System.out.print("Digite um numero:");
                    numero = input.nextInt();

                    if (numero % 2 == 0) {
                         System.out.print("Par");
                    } else {
                         System.out.print("Impar");
                    }

                    break;

               case 2:
                    System.out.print("Digite um numero: ");
                    numero = input.nextInt();

                    if (numero >= 0) {
                         System.out.print("Positivo: ");
                    } else {
                         System.out.print("Negativo");
                    }

                    break;

               case 3:
                    System.out.print("Digite uma idade: ");
                    int idade = input.nextInt();

                    if (idade >= 18) {
                         System.out.print("Maior de idade: ");
                    } else {
                         System.out.print("Menor de idade: ");

                    }

                    break;

               default:
                    System.out.print("Opcao invalida!");

          }

          input.close();

     }
}
