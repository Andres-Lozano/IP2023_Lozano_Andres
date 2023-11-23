import java.util.Scanner;

public class DuracionDescarga1 {
    public static void main(String[] args) {
        // Declaración de variables
        double tamanoGB, velocidadMbps;
        int horas, minutos, segundos;

        // Entrada de datos desde el usuario
        Scanner lea = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del archivo a descargar (en GB): ");
        tamanoGB = lea.nextDouble();

        System.out.print("Ingrese la velocidad efectiva de descarga (en Mbps): ");
        velocidadMbps = lea.nextDouble();

        
        double segundos = (tamanoGB * 8) / velocidadMbps;

        // Calcular horas, minutos y segundos
        horas = (int) segundos / 3600;
        minutos = (int) (segundos % 3600) / 60;
        segundos = (int) segundos % 60;

        // Mostrar el resultado
        System.out.println("El tiempo de descarga estimado es: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
                

       
        lea.close();
    }
}
