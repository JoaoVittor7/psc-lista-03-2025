import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) throws Exception {
        
        Scanner q5 = new Scanner(System.in);

        Double valorUm, valorDois, resultado;
        String operacao;
        
        System.out.println("Digite aqui o primeiro valor: ");
        valorUm = q5.nextDouble();
        System.out.println("Digite aqui o segundo valor: ");
        valorDois = q5.nextDouble();

        System.out.println("Digite aqui o símbolo da operação que deseja usar (+ , - , * , / ou ^ )");
        operacao = q5.next();

        switch (operacao) {
            case "+":
                resultado = valorUm + valorDois;
                System.out.println("Resultado: " + resultado);
                break;

            case "-":
                resultado = valorUm - valorDois;
                System.out.println("Resultado: " + resultado);
                break;

            case "*":
                resultado = valorUm * valorDois;
                System.out.println("Resultado: " + resultado);
                break;

            case "/":
                //Verificando para que nenhum numero seja divido por 0 :
                if (valorDois != 0) {
                    resultado = valorUm / valorDois;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Impossível prosseguir, divisão por '0' não é permitido.");
                }
                break;

            case "^":
                resultado = Math.pow(valorUm, valorDois);
                System.out.println("Resultado: " + resultado);
                break;

            default:
                System.out.println("Símbolo informado não condiz com nenhum preestabelecido.");
                break;
        }

        q5.close();
    }
}
