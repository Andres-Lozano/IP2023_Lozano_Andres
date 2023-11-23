
package sumarnumnat1;
import java.util.Scanner;

public class SumarNumNat1 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int n,c,suma;
        System.out.print("Ingrese el # de elementos a sumar: ");
        n = lea.nextInt();
        suma = 0;
        c = 1;
        while (c <= n ) {
            suma = suma + c;
            c = c + 1;
            
        }
            System.out.print("La suma es: "+ suma);
            
    }
    
}
