import java.util.Scanner;
public class MayorMenorEdad1 {
	public static void main(String[] args) {

		int nacimiento;
		int nActual;
		int edad;


		Scanner lea = new Scanner(System.in);

		System.out.print("Ingrese su año de nacimiento: ");
		nacimiento = lea.nextInt();
		System.out.print("Ingrese el año actual: ");
		nActual = lea.nextInt();


		edad = nActual - nacimiento;


		if( edad > 18){
			System.out.println("\nUsted es Mayor de edada");		

		} else {
			System.out.println("\nUsted es Menor de edad");

		lea.close();	
		
		}
			}
	}
