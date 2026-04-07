import java.util.Scanner;

public class SomaDoisNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = input.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = input.nextDouble();

        double soma = numero1 + numero2;

        System.out.println("A soma dos numeros e: " + soma);

        input.close();
    }
}
