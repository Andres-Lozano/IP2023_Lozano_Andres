import java.util.Scanner;

	public class CalculoIMC2 {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		byte pesoKg;
		float estatura_m;
		double imc; 

		// Ingreso de Datos
		System.out.println("CALCULO DEL IMC");
		System.out.println("===============");
		
		System.out.println("\nIngrese su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Ingrese su peso en Kg: ");
		pesoKg = sc.nextByte();
		System.out.println("Ingrese su estatura en metros: ");
		estatura_m = sc.nextFloat();
		imc = pesoKG/ Math.pow(estaturaM,2);
		

		System.out.println("\nEl imc de "+ nombre +" es igual a  "+imc);
		System.out.println("\nTabla IMC*");
		System.out.println(":---------------------------------------:");
		System.out.println("| Valor del IMC   : Estado              |");
		System.out.println("|-----------------+---------------------|");
		System.out.println("| Menos de 18.49  : Infra Peso          |");
		System.out.println("|-----------------+---------------------|");
		System.out.println("| 18.50 a 24.99   : Peso Normal         |");
		System.out.println("|-----------------+---------------------|");
		System.out.println("| 25 a 29.99      : Sobre Peso          |");
		System.out.println("|-----------------+---------------------|");
		System.out.println("| 30 a 34.99      : Obesidad Leve       |");
		System.out.println("|-----------------+---------------------|");
		System.out.println("| 35 a 39.99      : Obesidad Media      |");
		System.out.println("|-----------------+---------------------|");
		System.out.println("| 40 o mas        : Obesidad Morbida    |");
		System.out.println(":---------------------------------------:");
		System.out.println("\nClasificacion de la OMS de acuerdo con el IMC");
	}
}