import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diasEnviados = sc.nextInt();
		int ano = 0;
		int mes = 0;
		if (diasEnviados>=365){
			ano = diasEnviados/365;
			diasEnviados = diasEnviados-(ano*365);
		}
		if (diasEnviados>=30) {
			mes = diasEnviados/30;
			diasEnviados = diasEnviados-(mes*30);
		}		
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",ano,mes,diasEnviados);
	}
}