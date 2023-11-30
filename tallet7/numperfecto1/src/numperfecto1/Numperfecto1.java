package numperfecto1; import java.util.Scanner;
public class NumPerfecto1 {
    public static void main(String[] args) {

    //Variables
    Scanner lea = new Scanner(System.in); 
    short c,num,num1;

    //Ingreso de datos
    System.out.print("Ingrese un numero natural: "); 
    num = lea.nextShort();

    num1 = 0;
    c = 1;

    //Proceso 
    while (c < num){
        if (num% c == 0){

        num1 = (short)(num1 + c) ;
        }
         c = (short)(c +1) ;
    }
    if (num1 == num){

        System.out.println("El numero " + num + " es perfecto");
        }else {

            System.out.println("El numero " + num + " no es perfecto");
        }
    
    }
}
