import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre; 
        int horasTrabajadas;
        double valorPorHora;

        System.out.println("CALCULO TOTAL DEL SALARIO DE UN TRABAJADOR");
        System.out.println("==========================================");

        // Solicitar al usuario que ingrese los datos
        System.out.print("Ingrese el nombre de la persona: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = scanner.nextInt();
        System.out.print("Ingrese el valor por hora: ");
        valorPorHora = scanner.nextDouble();

        // Calcular el salario sin descuento ni incremento
        double salario = horasTrabajadas * valorPorHora;

        // Verificar si se aplica un descuento o incremento
        if (salario > 1200.0) {
            salario *= 0.90; 
        } else {
            salario *= 1.05; 
        }

        System.out.println("Nombre: " + nombre);
        System.out.println("Salario con descuento o incremento: $" + salario);

        scanner.close();
    }
}