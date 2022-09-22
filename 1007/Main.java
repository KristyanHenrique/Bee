import java.util.Scanner;
import java.io.IOException;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		n1=(n1*n2)-(n3*n4);
		System.out.printf("DIFERENCA = %d\n",n1);
	}
}