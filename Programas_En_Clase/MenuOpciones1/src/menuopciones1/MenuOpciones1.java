
package menuopciones1;
import java.util.Scanner;
public class MenuOpciones1 {

    public static void main(String[] args) {
        int  nu , valorABS;
        byte seleccion;
        Scanner lea = new Scanner(System.in);
        System.out.print("Ingrese número entero: ");
        nu = lea.nextInt();
        System .out.println("\nOPERACION A REALIZAR: ");
        System .out.println("   1) Determinar si es par");
        System .out.println("   2) Determinar si es multiplo de 3");
        System .out.println("   3) Calcular Valor Absoluto");
        System .out.println("Elija una Opcion (1-3): ");
        seleccion = lea.nextByte();
        switch (seleccion) {
            case 1:
                if (nu % 2 == 0) {
                    System.out.println("\nEl numero 6" + nu + " SI es par");
                }else {
                    System.out.println("\nEl numero " + nu + " NO es par");
                }
                break;
            case 2:
                if (nu % 3 == 0) {
                    System.out.println("\nEl numero" + nu + "Si es multiplo de 3");
                    
                }else {
                    System.out.println("\nEl numero" + nu + "NO es multiplo de 3");
                    
                }
                break;
            case 3:
                valorABS = nu;
                if (nu < 0) {
                    valorABS = nu * (-1);
                }
                System.out.println("\nValor absoluto de " + nu + "es:" + valorABS);
                break;
            default:
                System.out.println("\nOpción incorrecta!");
                
        }       
                
        
        
        
        
    }
    
}
