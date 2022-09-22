import java.util.*;
import java.io.IOException;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("en", "US"));
		String n1 = sc.nextLine();
		Double n2 = sc.nextDouble();
		Double n3 = sc.nextDouble();
		Double n4 = (n3*0.15);
		n3 = n4+n2;
		System.out.printf("TOTAL = R$ %.2f\n",n3);
	}
}