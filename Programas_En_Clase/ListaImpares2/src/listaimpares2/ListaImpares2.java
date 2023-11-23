
package listaimpares2;
import java.util.Scanner;
public class ListaImpares2 {
    public static void main(String[] args) {
    Scanner lea =new Scanner(System.in);
    int n,c;
    
    System.out.print("Ingrese el numero de caracteres impares: ");
    n = lea.nextInt();
    c = 1;
        while (c <= n) {
            System.out.println(c);  
            c = c + 2;
           
             
               
        }
            
    }
    
}