import java.util.Scanner;

public class ConversionMinutos {
    public static void main(String[] args) {
        // Declaración de variables
        int minutos, dias, horas, minutosRestantes;

    
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad de minutos
        System.out.print("Ingrese la cantidad de minutos: ");
        minutos = scanner.nextInt();

        // Calcular la conversión
        dias = minutos / (24 * 60); // 24 horas en un día, 60 minutos en una hora
        minutosRestantes = minutos % (24 * 60);
        horas = minutosRestantes / 60;
        minutosRestantes = minutosRestantes % 60;

        // Mostrar el resultado
        System.out.println(minutos + " minutos equivalen a:");
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutosRestantes);

        
        scanner.close();
    }
}
