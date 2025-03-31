import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) throws Exception {
        
        Scanner q1 = new Scanner(System.in);

        
        double num1, num2, num3, maior, menor, media;

        
        System.out.print("Por favor, digite o primeiro número: ");
        num1 = q1.nextDouble();
        System.out.print("Por favor, digite o segundo número: ");
        num2 = q1.nextDouble();
        System.out.print("Por favor, digite o terceiro número: ");
        num3 = q1.nextDouble();

        
        maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        
        menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        
        media = (num1 + num2 + num3) / 3;

        
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média aritmética é: " + media);

       
        q1.close();
    }
}
