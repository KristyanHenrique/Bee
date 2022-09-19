import java.io.IOException;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 0; i<x ;i++) {
			int teste = sc.nextInt();

			if (teste == 0) {
				System.out.printf("NULL\n");	
			}else if (teste%2==0) {
				System.out.printf("EVEN ");
			}else{
				System.out.printf("ODD ");
			}
			if (teste>0) {
				System.out.printf("POSITIVE\n");
			}else if (teste<0){
				System.out.printf("NEGATIVE\n");
			}
		}
	}
}