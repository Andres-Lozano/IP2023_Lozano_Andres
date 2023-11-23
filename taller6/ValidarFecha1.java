import java.util.Scanner;

public class ValidarFecha1 {
    public static void main(String[] args) {
        // Declaración de variables
        int a;
        byte m, d, dmax;

        // Ingreso de fecha
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el año: ");
        a = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        m = scanner.nextByte();

        System.out.print("Ingrese el día: ");
        d = scanner.nextByte();

        // Validar año, mes y día
        if (a < 1990 || a > 2020 || m <= 0 || m > 12 || d < 1) {
            System.out.println("Fecha incorrecta");
        } else {
            // Determinar y validar días del mes
            dmax = 31;

            if (m == 2) {
                if (a % 4 == 0 && !(a % 100 == 0 && a % 400 != 0)) {
                    // Significa que es bisiesto
                    dmax = 29;
                } else {
                    dmax = 28;
                }
            } else {
                if (m == 4 || m == 6 || m == 9 || m == 11) {
                    dmax = 30;
                }
            }

            if (d > dmax) {
                System.out.println("Fecha incorrecta");
            } else {
                System.out.println("Fecha correcta");
            }
        }

        // Cerrar el escáner
        scanner.close();
    }
}
