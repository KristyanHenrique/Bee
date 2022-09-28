import java.util.Scanner;
import java.io.IOException;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        double resultado = (a*c)/2;
        System.out.printf("TRIANGULO: %.3f\n",resultado);
        resultado = 3.14159*(Math.pow(c,2));
        System.out.printf("CIRCULO: %.3f\n",resultado);
        resultado = ((a+b)*c)/2;
        System.out.printf("TRAPEZIO: %.3f\n",resultado);
        resultado = (b*b);
        System.out.printf("QUADRADO: %.3f\n",resultado);
        resultado = (a*b);
        System.out.printf("RETANGULO: %.3f\n",resultado);
    }
}