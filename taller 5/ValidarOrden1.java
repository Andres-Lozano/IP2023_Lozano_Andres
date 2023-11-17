import java.util.Scanner; 
public class ValidarOrden1 {
	public static void main (String[] args) {
	// Declaracion de variables
	Scanner sc = new Scanner(System.in); 
	int a, b, c;
	// Ingreso de Datos
	System.out.println("Escriba tres números enteros: "); 
	System.out.println("Escriba el primer número: ");
	a = sc.nextInt();
	System.out.println("Escriba el segundo número: "); 
	b = sc.nextInt();
	System.out.println("Escriba el tercer número: "); 
	c = sc.nextInt();
	// Indicar si estan en orden ascendente o no 
	if (a < b && b < c) {
	System.out.println("Los números estan en orden ascendente.");
		} else {
			System.out.println("Los números no están en orden ascendente.");
		}
	}
}

