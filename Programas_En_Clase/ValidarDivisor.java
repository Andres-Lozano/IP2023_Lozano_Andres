import java.util.Scanner;
public class ValidarDivisor1 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        //declarar variables 
        int num1, num2, t;
        
        //ingreso de datoss
        
        System.out.println("ingrese el primer numero");
        num1 = lea.nextInt();
        
        System.out.println("ingrese el segundo numero");
        num2 = lea.nextInt();
        
        if (num1 < num2) {
            t = num2 % num1;
            if (t == 0) {
                System.out.println(num1 + " Divisor del numero");
            } else {
                System.out.println(" No es divisor del numero" + num2);
            }
        } else {
            t= num1 % num2;
            if (T == 0) {
                System.out.println(num2 + " Divisor del numero" + num1);
            } else {
                System.out.println(num2 + " No es divisor del numero " + num1);
            }
        }

    }

}
