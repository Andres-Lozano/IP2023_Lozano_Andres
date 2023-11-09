import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        // Declaración de variables
        String nombre;
        double pesoKg;
        double estaturaM;
        double imc;

        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos
        System.out.println("CALCULO DEL IMC DE UNA PERSONA");
        System.out.println("==============================");
        System.out.println();
        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese su peso en Kg: ");
        pesoKg = scanner.nextDouble();
        System.out.print("Ingrese su estatura en metros: ");
        estaturaM = scanner.nextDouble();

        // Cálculo de IMC
        imc = pesoKg / (estaturaM * estaturaM);

        // Muestra de resultados
        System.out.println("El IMC de " + nombre + " es igual a: " + imc);

        
        scanner.close();
    }
}