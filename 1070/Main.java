import java.io.IOException;
import java.util.*; 

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inicio = sc.nextInt();
		int fim;		
		if (inicio % 2==0) {
			fim=inicio+12;
		}else{
			fim=inicio+11;
		}

		for (int i=inicio; i<=fim ; i++) {
			if (i % 2!=0) {
				System.out.printf("%d\n",i);
			}
		}	
	}
}