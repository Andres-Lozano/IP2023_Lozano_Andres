package parimpar1;
import java.util.Scanner;

public class ParImpar1 {  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System. out.println("Ingrese el numero:");
        numero = sc.nextInt();
     
        if(numero % 2 == 0){
            System.out.println("Su numero es par");    
        }else {
            System.out.println("Su numero es impar");
   
            
        }
    
    }
    
}
