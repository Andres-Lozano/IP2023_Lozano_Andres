package estadnumeros2; import java.util.Scanner;
public class EstadNumeros2 {
    public static void main(String[] args) {

    Scanner lea = new Scanner(System.in);  
    int num, suma, cn,n, num1,num3;
    float num2,num4;

    System.out.println("Ingrese numeros positivos y negativos (para terminar digite 0): ");

    num = 1;
    suma = 0;
    num3 = 0;
    num1 = 0;
    cn = 0;
    n = 0;

    while (num != 0) {
        num = lea.nextInt();
        if (num > 0){
            n = n+1;
            num3 = num3 + num;

        }
        if (num < 0){
            cn = cn + 1;
        }

        num1 = n + cn;

        suma = suma + num;
    }
    num2 = (float)suma/num1; 
    num4 = (float) num3 / n;

    System.out.println("En total usted ingreso " + num1 +" numeros"); 
    System.out.println("En total ingreso " + num + " numeros positivos"); 
    System.out.println("En total usted ingreso " + cn + " numeros negativos"); 
    System.out.println("El promedio de todos los numeros ingresados es: " + num2); 
    System.out.println("El promedio solo de los numeros positivos es de: "+ num4); 
    System.out.println("La suma de los numeros ingresados es " + suma);
    
    }
}
