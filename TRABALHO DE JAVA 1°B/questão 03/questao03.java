package trabalho_java1b;

public class questao03 {
	public static void main(String[]args ) {
		double A = 2;
		double B = -17;
		double C = 10;
		
		double delta = Math.pow(B,  2.0) - 4*A*C;
		double x1 = (-B + Math.sqrt(delta)) / (2.0 * A);
		System.out.println("valor de x1:" +x1);
		
		double x2 = (B- Math.sqrt(delta)) / (2.0 * A);
		System.out.println("valor de x2:" +x2);
}
}