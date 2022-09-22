import java.util.*;
import java.io.IOException;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("en", "US"));
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		float n3 = sc.nextFloat();
		n3=(n3*n2);
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n",n1,n3);
	}
}