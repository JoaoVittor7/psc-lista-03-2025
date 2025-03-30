import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) throws Exception {
        
        Scanner q3 = new Scanner(System.in);

        Double delta, a, b, c, raiz1grau, raiz1, raiz2;

        System.out.println("Por favor insira aqui o valor do coeficiente'a':");
        a = q3.nextDouble();
        System.out.println("Por favor insira aqui o valor do coeficiente 'b'");
        b = q3.nextDouble();
        System.out.println("Por favor insira aqui o valor do coeficiente 'c'");
        c = q3.nextDouble();
        
         raiz1grau = -c / b;

        delta = ( b*b - 4*a*c);

        raiz1 = (-b + Math.sqrt(delta)) / (2*a);
        raiz2 = (-b - Math.sqrt(delta)) / (2*a);
        //letra A
       if( a== 0 && b == 0 && c!= 0){System.out.println("Coeficientes informados incorretamente");
    }
        //letra B
        else if(a == 0 && b!=0){System.out.println("Está é uma equação do primeiro grau."+ raiz1grau);
    }
        //letra C
        else if(delta<0){System.out.println("Esta equação não possui raízes reais");
    }
        //letra D
        else if(delta==0){System.out.println("Esta equação possui duas raízes reais iguais: "+ raiz1);
    }
       //letra E

      else if(delta>0){System.out.println("Esta equação possui duas raízes reais diferentes: "+raiz1 + "e" + raiz2);
    }

        
     q3.close();
    }
}