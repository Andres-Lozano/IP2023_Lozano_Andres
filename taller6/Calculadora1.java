import java.util.Scanner;
public class Calculadora1 {

   
    public static void main(String[] args) {
       Scanner lea = new Scanner(System.in);
        //declarar variables
        int num1, num2, op, d;
        //ingreasar datos
        System.out.println("Ingrese el primer numero a operar ");
        num1 = lea.nextInt();
        System.out.println("Ingrese que operacion desearia realizar\nPresione 1 para  (sumar)\nPresione 2 para   (restar)\nPresione 3 para  (multiplicar)\nPresione 4 para  (dividir) ");
        operador = lea.nextInt();
        System.out.println("Ingrese el segundo numero a operar ");
        num2 = lea.nextInt();

        //calcular
        d = 0;
        switch (op) {
            case 1:
                d = num1 + num2;
                System.out.println("operar\n" + num1 + " + " + num2 + " = " + d);
                break;
            case 2:
                d = num1 - num2;
                System.out.println("operar\n" + num1 + " - " + num2 + " = " + d);
                break;
            case 3:
                d = num1 * num2;
                System.out.println("operar\n" + num1 + " * " + num2 + " = " + d);
                break;
            case 4:
                d =(num1 / num2);
                System.out.println("operar\n" + num1 + " / " + num2 + " = " + d);
                break;
        }
       
    }
    
}
