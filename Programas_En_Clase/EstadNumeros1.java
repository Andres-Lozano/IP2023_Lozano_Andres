import java.util.Scanner;

public class EstadNumeros1 {
    public static void main(String[] args) {
        // Declaración de variables
        int num, suma, cn;

        // Inicialización de variables
        num = 1;
        suma = 0;
        cn = 0;

        // Entrada de números positivos y negativos
        Scanner lea = new Scanner(System.in);

        System.out.println("Ingrese números positivos y negativos (para terminar, digite 0): ");

        while (num != 0) {
            num = lea.nextInt();

            if (num < 0) {
                cn = cn + 1;
            }

            suma = suma + num;
        }

        // Mostrar resultados
        System.out.println("En total usted ingresó " + cn + " números negativos");
        System.out.println("La suma de los números ingresados es " + suma);

        // Cerrar el escáner
        lea.close();
    }
}
