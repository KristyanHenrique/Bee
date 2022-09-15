import java.util.Scanner;
import java.io.IOException;
public class Main{
	public static void main(String[] args) {
	/* presentarion error 15% */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n2 = sc.nextInt();
		n = n-n2;
		System.out.println(n+"\n");
	}
}