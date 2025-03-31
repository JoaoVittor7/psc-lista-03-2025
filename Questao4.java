import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) throws Exception {
        
        Scanner q4 = new Scanner(System.in);

        Double operacao, raio, perimetro, area, volume;

        

        System.out.println("Digite o valor do raio: ");
        raio = q4.nextDouble();

        perimetro = (2.0*3.141592)*raio;

        area = 3.141592*(raio*raio);

        volume = (4.0/3.0 * 3.141592) * (raio*raio*raio);

        System.out.print("Digite aqui qual número de operação deseja fazer: ");

        operacao = q4.nextDouble();

        if(operacao==1){System.out.println("O valor do perímetro é de: "+perimetro);
    } else if(operacao==2){System.out.println("O valor da área é de: "+area);
}   else{System.out.println("O valor do volume é de: "+volume);
}
        
     q4.close();
    }
}
