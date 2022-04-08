package trabalho_java1b;

import java.util.Locale;
import java.util.Scanner;

public class Trabalho_java1b {
	public static void main(String[] args) {  
		int raio;
		double area;
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o raio de uma circunferência");
		raio = entrada.nextInt();
		
		area = 3.141596 * (raio * raio);
		
		System.out.println("A área da circunferência é: "+ area);
		
		
	}
}
