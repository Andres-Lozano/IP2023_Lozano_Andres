package estadnumeros1;
import java.util.Scanner; public class EstadNumeros1 {
    public static void main(String[] args) {

    Scanner lea = new Scanner(System.in); 
    int num, suma, neg;

    System.out.println("Ingrese numeros positivos y negativos (para terminar digite 0): ");

    num = 1;
    suma = 0;
    neg = 0;

    while (num != 0) {
        num = lea.nextInt();

        if (num < 0){
            neg = neg + 1;
        }

        suma = suma + num;
    }
    System.out.println("En total usted ingreso " + neg + " numeros negativos"); 
    System.out.println("La suma de los numeros ingresados es "+suma);
 
    }

}

