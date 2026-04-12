package condicionais;

import java.util.Scanner;

public class MenuOpcoes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Escolha uma opcao:");
    System.out.println("1 - Par ou Impar");
    System.out.println("2 - Positivo ou Negativo");
    System.out.println("3 - Maior ou Menor");
    System.out.print("Opcao: ");
    int opcao = input.nextInt();

    if (opcao == 1) {
      System.out.print("Digite um numero: ");
      int numero = input.nextInt();

      if (numero % 2 == 0) {
        System.out.println("Par");
      } else {
        System.out.println("Impar");
      }
    } else if (opcao == 2) {
      System.out.print("Digite um numero: ");
      int numero = input.nextInt();

      if (numero > 0) {
        System.out.println("Positivo");
      } else if (numero < 0) {
        System.out.println("Negativo");
      } else {
        System.out.println("Zero");
      }
    } else if (opcao == 3) {
      System.out.print("Digite o primeiro numero: ");
      int num1 = input.nextInt();

      System.out.print("Digite o segundo numero: ");
      int num2 = input.nextInt();

      if (num1 > num2) {
        System.out.println("O maior numero e: " + num1);
      } else if (num2 > num1) {
        System.out.println("O maior numero e: " + num2);
      } else {
        System.out.println("Os dois numeros sao iguais");
      }
    } else {
      System.out.println("Opcao invalida");
    }

    input.close();
  }
}