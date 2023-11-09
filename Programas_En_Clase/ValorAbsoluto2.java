import java.util.Scanner;
public class ValorAbsoluto2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		float numero,valorABS;

		System.out.print("Ingrese un numero: ");
		numero = scanner.nextFloat();

		if (numero < 0) {
			valorABS = numero * (-1);

		} else {
			valorABS = numero;

		} 

		System.out.println("\n El Valor absoluto del numero " + numero + " es " + valorABS);

		scanner.close();

		
	}
}