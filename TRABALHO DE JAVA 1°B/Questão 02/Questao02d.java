package trabalho_java1b;
import java.util.Locale;
import java.util.Scanner;

public class Questao02d { //item d)
	public static void main(String[] args) {
		double lado;
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor do lado: ");
		lado = entrada.nextDouble();

		double area = Math.pow(lado, 2.0);
		
		System.out.println("O quadrado com lado "+ lado+ " e lado " + lado+ " tem área igual a:"+ area);
	}
}