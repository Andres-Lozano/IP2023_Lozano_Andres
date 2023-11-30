
package estadnumeros3;
import java.util.Scanner;
public class EstadNumeros3 {

    public static void main(String[] args) {
    int n,n1,n2,c,n4;
    float n3;
    Scanner lea=new Scanner(System.in);
    
    System.out.print("Ingresar nuemro entero: ");
    n = lea.nextInt();
    System.out.print("Ingrese los valores a promediar: ");
    
    c=1;
    n2=0;
    n4=0;
    
    while (c <= n) {
        n1 = lea.nextInt();
        
        
        if (n1 > n4) {
            n4= n1;
            
        }
        n2 = n2 + n1;
        c = c +1;
       
    }
    
    n3 = (float)n2/n;
    System.out.println("la media aritmetica de"+ n+ "numeroses " +n3);
    System.out.println("El numero mayor es: " + n4);
    
           
            
    
   
    }
    
}
