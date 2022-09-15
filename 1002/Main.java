import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double result, r;
        r = scan.nextDouble();
        result = 3.14159 * (r*r);
        System.out.printf("A=%.4f\n",result);
 
    }
 
}
