import java.io.IOException;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double n1 = sc.nextDouble();
		Double n2 = sc.nextDouble();
		n1=((n1*3.5)+(n2*7.5))/11;
		System.out.printf("MEDIA = %.5f\n",n1);
	}
}