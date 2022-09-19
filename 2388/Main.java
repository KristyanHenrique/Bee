import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ciclos = sc.nextInt();
		int kms = 0;
		int kmsSup = 0;
		for (int i = 0; i < ciclos; i++) {
			int tempo = sc.nextInt();
			int velocidade = sc.nextInt();
			kmsSup = (0+velocidade)*tempo;
			kms = kmsSup+kms;
		}
		System.out.printf("%d\n",kms);
	}
}