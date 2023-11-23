
package promediopares1;
import java.util.Scanner;
public class PromedioPares1 {
    public static void main(String[] args) {
    Scanner lea =new Scanner(System.in);
    int n,c,num1,sum,pro;
   
    
    System.out.print("Ingrese el numero de caracteres para promediar: ");
    n = lea.nextInt();
    c = 0;
    num1 = 0;
    sum = 0;       
          
        while (c < n) {
            
            num1 = num1 + 2;
              
            c = c + 1;
            
            sum = sum + num1;
             
        }
        pro = sum/ n;
        System.out.println(pro);
    

    }
    }