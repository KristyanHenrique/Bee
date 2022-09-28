import java.util.Scanner;
import java.io.IOException;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorLido = sc.nextInt();
        /*float b = sc.nextFloat();
        float c = sc.nextFloat();*/
        int c100 = 0;
        int c50 = 0;
        int c20 = 0;
        int c10 = 0;
        int c5 = 0;
        int c2 = 0;
        int aux = 0;
        int a = valorLido;// variavel de decremento
        if(a>=100){
            aux = a/100;
            c100 = aux;
            a = a-(aux*100);
        }
        if(a>=50){
            aux = a/50;
            c50 = aux;
            a = a-(aux*50);
        }
        if(a>=20){
            aux = a/20;
            c20 = aux;
            a = a-(aux*20);
        }
        if(a>=10){
            aux = a/10;
            c10 = aux;
            a = a-(aux*10);
        }
        if(a>=5){
            aux = a/5;
            c5 = aux;
            a = a-(aux*5);
        }
        if(a>=2){
            aux = a/2;
            c2 = aux;
            a = a-(aux*2);
        }
        System.out.printf("%d\n",valorLido);
        System.out.printf("%d nota(s) de R$ 100,00\n",c100);
        System.out.printf("%d nota(s) de R$ 50,00\n",c50);
        System.out.printf("%d nota(s) de R$ 20,00\n",c20);
        System.out.printf("%d nota(s) de R$ 10,00\n",c10);
        System.out.printf("%d nota(s) de R$ 5,00\n",c5);
        System.out.printf("%d nota(s) de R$ 2,00\n",c2);
        System.out.printf("%d nota(s) de R$ 1,00\n",a);
    }
}