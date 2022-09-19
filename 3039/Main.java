import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = sc.nextInt();sc.nextLine();
		int numeroMeninos = 0;
		int numeroMeninas = 0;
		for (int i=0; i<contador ; i++) {
			String NomeGenero = sc.nextLine();
			String[] parts = NomeGenero.split(" ");
			if (parts[1].equals("M")) {
				numeroMeninos = numeroMeninos + 1;
			}else{
				numeroMeninas++;
			}
		}
		System.out.printf("%d carrinhos\n%d bonecas\n",numeroMeninos,numeroMeninas);
	}
}