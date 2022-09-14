import java.io.IOException;
import java.util.*; 
public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double media = 0.0;
        media = media+(2 * sc.nextDouble());
        media = media+(3 * sc.nextDouble());
        media = media+(5 * sc.nextDouble());
        media = media/10;
        System.out.printf("MEDIA = %.1f\n",media);
    }
 
}
