package venta2;
import java.util.Scanner; public class Venta2 {
    public static void main(String[] args) {

        //Variables
        Scanner lea = new Scanner(System.in); 
        short num,c,num1,num2;
        float num3;

        c = 0;
        num2 = 0;
        num3 = 0;

        //Ingreso de datos
        System.out.print("Ingrese el numero de articulos: "); 
        num = lea.nextShort();
        System.out.println("Ingrese el precio de los articulos: ");

        //Proceso 
        while (c<num){
            
        num1 = lea.nextShort();
        num2 = (short) (num2 + num1);
        num3 = (float)(num2 * 0.12) + (num2); 
        c = (short) (c +1);
    }
        System.out.print("El total a pagar por los " + num + " articulos incluido el IVA es de: " + num3);
    }
}

