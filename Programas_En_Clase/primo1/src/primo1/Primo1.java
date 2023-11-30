package primo1;
import java.util.Scanner; public class Primo1 {
    public static void main(String[] args) {

    Scanner lea = new Scanner (System.in); 
    short num;
    short c;
    String primo;

    System.out.println("Ingrese un numero entero: "); 
    num = lea.nextShort();

    primo = "S";
    c = (short) (num - 1); 
    while (c >= 2){
    
        if (num % c == 0){ 
            primo = "N"; c = 1;
            }else {
                c = (short)(c - 1);
            }
    }
    if (primo.equals("S")) {
        System.out.println("El numero " + num + " es primo");
        }else {
            System.out.println("El numero " + num + " no es primo");
        }
    
    }
}

