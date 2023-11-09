import java.util.Scanner;

public class Circulo1 {
    public static void main(String[] args) {
        
        double diametro;
        double radio;
        double circunferencia;
        double area;
        double pi = 3.14;

        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el diámetro del círculo en centímetros
        System.out.print("INGRESE EL DIAMETRO DEL CIRCULO EN CENTIMETROS: ");
        diametro = scanner.nextDouble();

        // Calcular el radio (la mitad del diámetro)
        radio = diametro / 2.0;

        // Calcular la circunferencia
        circunferencia = 2 * pi * radio;

        // Calcular el área
        area = pi * Math.pow(radio, 2);

        // Mostrar la circunferencia y el área del círculo
        System.out.println("Circunferencia del círculo: " + circunferencia + " cm");
        System.out.println("area De La Circunferencia: " + area + "cm2");

        
        scanner.close();
    }
}
