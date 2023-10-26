public class Expreciones1 {
	public static void main(String[] args) {
		byte a;
		byte b;
		byte c;
		Boolean resultado;

		a = 4;
		b = 3;
		c = 5;

		resultado = (a > b + 2) && !(c + a == b + c);

		System.out.println("El resultado es: " + resultado);
		
	}
}