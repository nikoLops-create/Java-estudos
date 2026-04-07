import java.util.Scanner;

public class CadastroSalario {

    public static void main(String[] args) throws Exception {

      
       Scanner input = new Scanner(System.in);
      
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        
        System.out.print("Quanto voce recebe por mes?: ");
        double salarioMensal = input.nextDouble();

    
        double salarioAnual = salarioMensal *12;


        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("SalarioMensal: " + salarioMensal);
        System.out.println("Salario anual: " + salarioAnual);

        input.close();
        




      

    }

}
  



    





       