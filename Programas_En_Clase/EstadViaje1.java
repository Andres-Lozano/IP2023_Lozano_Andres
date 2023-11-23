import java.util.Scanner;

public class EstadViaje1 {
    public static void main(String[] args) {
        // Declaración de variables
        double kilometros, horas, galones,velocidad,rendimiento  ;

        
        Scanner lea = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de kilómetros recorridos: ");
        kilometros = lea.nextDouble();

        System.out.print("Ingrese la duración del viaje en horas: ");
        horas = lea.nextDouble();

        System.out.print("Ingrese la cantidad de galones consumidos: ");
        galones = lea.nextDouble();

        // Calcular rendimiento en Km por litro (Km/lt)
        rendimiento = kilometros / (galones * 3.785);

        // Calcular velocidad en metros por segundo (m/s)
        velocidad = kilometros * 1000 / (horas * 3600);

        // Mostrar los resultados
        System.out.println("El rendimiento del vehiculo es " + r + "km/lt" + " La velocidad del automovil " + v + "m/s");
        
        scanner.close();
    }
}
