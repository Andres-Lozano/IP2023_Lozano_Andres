
package fibonacci1;
import java.util.Scanner;
public class Fibonacci1 {
    public static void main(String[] args) {
        byte n;
        int fibAnterior, fibNuevo, proximo;
        byte c;

        Scanner lea = new Scanner(System.in);

        System.out.print("Ingrese los elementos Fibonacci a mostrar: ");
        n = lea.nextByte();

        fibAnterior = 0;
        System.out.println(fibAnterior);

        fibNuevo = 1;

        for (c = 2; c <= n; c++) {
            System.out.println(fibNuevo);
            proximo = fibAnterior + fibNuevo;
            fibAnterior = fibNuevo;
            fibNuevo = proximo;
        }

        lea.close();
    }
}