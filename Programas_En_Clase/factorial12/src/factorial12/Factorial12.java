
package factorial12;
import java.util.Scanner;
public class Factorial12 {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in);
        
        int n,c;
        long factorial;
        
        System.out.print("Ingrese un numero entero no negativo:");
        n=lea.nextInt();
        
        
        while (n<0){
            System.out.print("valor incorrecto");
            System.out.print("Ingrese un numero entero no negativo:");
            n=lea.nextInt();
                   
        }
        factorial=1;
        for (c=1; c<=n;c++) {
            factorial = factorial *c;
        }
       System.out.println("El factorial de "+n+" es"+factorial);
    
    }
    
}
