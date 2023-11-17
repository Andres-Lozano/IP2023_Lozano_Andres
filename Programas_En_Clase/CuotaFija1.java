import java.util.Scanner;

public class CuotaFija1 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        // Variables
        int plazo;
        double monto, interesAnual, interesMensual, cuotaParcial, seguroDes, cuotaFinal;

        // Ingreso de datos del préstamo
        System.out.print("Ingrese monto total del prestamo: ");
        monto = lea.nextDouble();

        System.out.print("Ingrese plazo para pago de prestamo (en meses): ");
        plazo = lea.nextInt();

        System.out.print("Ingrese el % de la tasa de interes anual: ");
        interesAnual = lea.nextDouble();

        // Validar plazo mínimo
        if (plazo < 3) {
            System.out.println("Error, el plazo no puede ser inferior a 3");
        } else {
            // Validar plazo máximo
            if (plazo > 36 && monto < 20000) {
                System.out.println("Error, el plazo no puede ser mayor a 36 en prestamos inferiores a USD 20000");
            } else {
                // Cálculo de la cuota
                interesMensual = interesAnual / 12 / 100;
                cuotaParcial = monto * (interesMensual * Math.pow((1 + interesMensual), plazo)) / (Math.pow((1 + interesMensual), plazo) - 1);
                seguroDes = cuotaParcial * 0.05 / 100;
                cuotaFinal = cuotaParcial + seguroDes;

                // Mostrar resultado
                System.out.println("LA CUOTA MENSUAL A PAGAR ASCIENDE A: " + cuotaFinal);
            }
        }
    }
}
