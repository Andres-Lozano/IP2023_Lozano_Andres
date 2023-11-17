import java.util.Sacanner;

public class CalculoIMC3 {
	public static void main(String[] args ) {
	
	// Declaracion de variables
	Scanner lea = new Scanner(System.in); 
	String nombre;
	byte pesoKG; 
	float estaturaM;
	float imc; 
	
	// Ingreso de Datos 
	System.out.println("CALCULO DEL IMC"); 
	System.out.println("==============="); 
	System.out.println(""); 
	System.out.println("Ingrese su nombre: "); 
	nombre = sc.nextLine(); 
	System.out.println("Ingrese su peso en Kg: "); 
	pesoKG = sc.nextByte();
	System.out.println("Ingrese su estatura en metros: "); 
	estaturaM = sc.nextFloat();
	// Calcular IMC
	imc = pesoKG / (float) Math.pow(estaturaM,2); 
	System.out.println("");
	// Muestra de resultados
	System.out.println("El imc de "+ nombre +" es igual a "+imc); 
	System.out.println("");
		if (imc <= 18.49 ) {
			System.out.println("+	+	+"); 
			System.out.println("| Valor del IMC | Estado	|"); 
			System.out.println("+		+"); 
			System.out.println("| Menos de 18.49 | Infra Peso |"); 
			System.out.println("+		+");
		} else if (imc >= 18.50 && imc <= 24.99) {
			System.out.println("+	+	+"); 
			System.out.println("| Valor del IMC | Estado	|"); 
			System.out.println("+		+"); 
			System.out.println("| 18.50 a 24.99 | Peso Normal |"); 
			System.out.println("+		+");
		} else if (imc >= 25 && imc <= 29.99) {
			System.out.println("+	+	+"); 
			System.out.println("| Valor del IMC | Estado	|"); 
			System.out.println("+		+"); 
			System.out.println("| 25 a 29.99 | Sobre Peso |"); 
			System.out.println("+		+");
		} else if (imc >= 30 && imc <= 34.99) {
			System.out.println("+	+	+"); 
			System.out.println("| Valor del IMC | Estado	|"); 
			System.out.println("+		+"); 
			System.out.println("| 30 a 34.99 | Obesidad Leve |"); 
			System.out.println("+		+");
		} else if (imc >=35 && imc <= 39.99) {
			System.out.println("+	+	+"); 
			System.out.println("| Valor del IMC | Estado	|"); 
			System.out.println("+		+"); 
			System.out.println("| 35 a 39.99 | Obesidad Media |"); 
			System.out.println("+		+");
