import java.util.Scanner;
import java.io.IOException;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valorLido = sc.nextFloat();
        
        if (valorLido>=0 && valorLido<=25) {
            System.out.println("Intervalo [0,25]");
        }else if (valorLido>25 && valorLido<=50) {
            System.out.println("Intervalo (25,50]");
        }else if (valorLido>50 && valorLido<=25) {
            System.out.println("Intervalo (50,75]");
        }else if (valorLido>75 && valorLido<=100) {
            System.out.println("Intervalo (75,100]");
        }else if (valorLido<0 || valorLido>100) {
            System.out.println("Fora de intervalo");
        }

    }
}