
package listaimpares1;
import java.util.Scanner;
public class ListaImpares1 {
    public static void main(String[] args) {
    Scanner lea =new Scanner(System.in);
    int n,c,n1;
    
    System.out.print("Ingrese el numero de caracteres impares: ");
    n = lea.nextInt();
    n1 = 1;
    c = 0;
        while (c < n) {
            System.out.println(n1);    
            n1 = n1 + 2;
            
            c = c + 1;
            
               
        }
         
    }
    
}
