import java.util.Scanner;
import java.util.Random;


public class Atividades {
    public static void main(String[] args) throws Exception {
        
        Scanner q6 = new Scanner(System.in);
        int valor1, valor2, numeroSorteado, maior, menor;

        System.out.println("Digite aqui o primeiro valor: ");
        valor1 = q6.nextInt();
        System.out.println("Digite aqui o segundo valor: ");
        valor2 = q6.nextInt();

        if (valor1 < valor1) {  menor = valor1;
            maior = valor2;} 
            else { menor = valor2;
            maior = valor1;}

        Random random = new Random();
        numeroSorteado = random.nextInt(maior - menor);

        System.out.println("Número sorteado: " + numeroSorteado);

        if (numeroSorteado % 2 == 0) {
            System.out.println("O número gerado é par.");
        } else {
            System.out.println("O número gerado é ímpar.");
        }

        q6.close();
    }