package primo2;
import java.util.Scanner;
public class Primo2 {
    public static void main(String[] args) { 
        Scanner lea = new Scanner(System.in); 
        boolean primo;
        short num;
        short c;

        System.out.println("Ingrese un numero entero: ");  
            num = lea.nextShort();

        primo = true;
        c = (short) (num - 1); 
        while (c >= 2){

            if (num % c == 0){ 
                primo = false ; 
                c = 1;
                }else {
                    c = (short)(c - 1);
                }
        }

        if (primo == true) {
        System.out.println("El numero " + num + " es primo");
            }else {
                System.out.println("El numero " + num + " no es primo");
            }

    
    }
}
