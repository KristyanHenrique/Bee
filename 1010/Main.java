import java.util.*;
import java.io.IOException;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("en", "US"));
		Double n4 = 0.0;
		for (int i = 0; i <2;i++ ) {	
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			Double n3 = sc.nextDouble();
			n4 = (n3*n2) + n4;
		}
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",n4);
	}
}