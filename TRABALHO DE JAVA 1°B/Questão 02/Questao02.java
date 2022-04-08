package trabalho_java1b;

import java.util.Locale;
import java.util.Scanner;

public class Questao02 { //item e)
	public static void main(String[]args ) {
		double altura, base, area;
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor da base: ");
		base = entrada.nextDouble();
		
		System.out.println("Informe o valor da altura: ");
		altura = entrada.nextDouble();
		
		area = base * altura;
		
		System.out.println("O retângulo com base "+ base+ " e altura " + altura+ " tem área igual a:"+ area);
	}
}
