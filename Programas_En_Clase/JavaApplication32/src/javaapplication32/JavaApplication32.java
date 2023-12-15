
package javaapplication32;
import java.util.Scanner;
public class JavaApplication32 {
    public static void main(String[] args) {
        Scanner nc =new Scanner(System.in);
        byte eleMostrar;
        byte encontrados = 0;
        int num = 2;
        String esPrimo;
        int c;
        System.out.print("Ingrese la cantidad de números primos a mostrar: ");
        eleMostrar = nc.nextByte();

        while (encontrados < eleMostrar) {
            esPrimo = "S";
            c = num - 1;

            while (c >= 2) {
                if (num % c == 0) {
                    esPrimo = "N";
                }
                c--;
            }

            if (esPrimo.equals("S")) {
                System.out.println(num);
                encontrados++;
            }

            num++;
        }
    }
}