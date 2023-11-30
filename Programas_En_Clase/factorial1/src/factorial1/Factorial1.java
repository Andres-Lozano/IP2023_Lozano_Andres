package factorial1; import java.util.Scanner;
public class Factorial1 {
    public static void main(String[] args) {

    //Variables
    Scanner lea = new Scanner(System.in); short num,c,num1,num2 ;

    c = 1;
    num1 = 1;
    //Ingreso de datos
    System.out.print("Ingrese un numero entero: "); 
    num = lea.nextShort();

    //Proceso 
    while (c <= num){
    num1= (short)(num1 * c);

    c = (short)(c + 1);
    }

    System.out.println("El factorial de " + num + " es: " + num1);
    
    }

}

