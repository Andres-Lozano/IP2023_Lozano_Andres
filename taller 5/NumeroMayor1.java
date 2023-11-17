import java.util.Scanner; 
public class NumeroMayor1 {
	public static void main (String[] args) {
		// Declaracion de Variables
		Scanner sc = new Scanner(System.in); 
		int n1, n2, n3;
		// Ingreso de Datos
		System.out.println("Escriba tres números enteros: ");

		System.out.println("Escriba el primer número: ");
		n1 = sc.nextInt();
		
		System.out.println("Escriba el segundo número: "); 
		n2 = sc.nextInt();
		
		System.out.println("Escriba el tercer número: "); 
		n3 = sc.nextInt();
		
		// Determinar cual número es el mayor 
		if (n1 > n2 && n1 > n3) {
			System.out.println("El número mayor es: " + n1);
		} else if (n2 > n1 && n2 > n3) { 
			System.out.println("El número mayor es: " + n2);
		} else if (n3 > n1 && n3 > n2) { 
			System.out.println("El número mayor es: " + n3);
			}
		}

}