import java.util.Scanner; 
public class Bisiesto1 {
	public static void main (String[] args) {
		// Declaracion de variables
		Scanner  lea = new Scanner(System.in); 
		int an;
		// Ingreso de Datos 
		System.out.println("Ingrese un año: "); 
		an = lea.nextInt();
		// Calculos para saber si es multiplo de 4 
		if (an % 4 != 0) {
			System.out.println(an + " No es un año bisiesto");
		} else if (an % 100 == 0 && an % 400 != 0) { 
			// Calculos para saber si es multiplo de 100 y no de 400
			System.out.println(an + " No es un año bisiesto");
		} else{ 
		// Cumple las condiciones para ser año bisiesto 
			System.out.println(an + " Es un año bisiesto");
		}

	}
}
