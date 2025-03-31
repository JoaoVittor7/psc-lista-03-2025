import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) throws Exception {
        
        Scanner q2 = new Scanner(System.in);

        int valorCompra, valorPago, troco;
        
        

        System.out.println("Por favor insira aqui o valor da compra: R$");
        valorCompra = q2.nextInt();
        System.out.println("Por favor insira aqui o valor pago: R$");
        valorPago = q2.nextInt();

        troco = (valorPago - valorCompra);

        if(valorCompra<valorPago){System.out.println("O seu troco é de: R$" +troco );
    } 
        else if(valorCompra>valorPago) { System.out.println("ERRO!!!, quantia paga insuficiente");
    }
        
    int nota50 = (troco / 50);
    troco = troco % 50;
    
    int nota20 = (troco / 20);
    troco = troco % 20;
    
    int nota10 = (troco / 10);
    troco = troco % 10;
    
    int nota5 = (troco / 5);
    troco = troco % 5;
    
    int nota2 = (troco / 2);
    troco = troco % 2;

    int nota1 = (troco / 1);
    troco = troco % 1;
    
    if (nota50 > 0) {
        System.out.println("Notas de R$ 50,00: " + nota50);
    }
    if (nota20 > 0) {
        System.out.println("Notas de R$ 20,00: " + nota20);
    }
    if (nota10 > 0) {
        System.out.println("Notas de R$ 10,00: " + nota10);
    }
    if (nota5 > 0) {
        System.out.println("Notas de R$ 5,00: " + nota5);
    }
    if (nota2 > 0) {
        System.out.println("Notas de R$ 2,00: " + nota2);
    }
    if (nota1 > 0) {
        System.out.println("Notas de R$ 1,00: " + nota1);

        
     q2.close();
    }
}



}
