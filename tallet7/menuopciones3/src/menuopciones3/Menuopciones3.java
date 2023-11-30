package menuopciones3; import java.util.Scanner;
public class MenuOpciones3 {
    public static void main(String[] args) {

    Scanner lea = new Scanner(System.in); 
    int num, valorAbs;
    byte selec; 
    selec = 4;
    System.out.print("Ingrese numero entero: "); num = lea.nextInt();
        while (selec > 3 | selec < 1 ){ 
        System.out.println("\nOPERACIÓN A REALIZAR: ");
        System.out.println("	1) Determinar si es par"); 
        System.out.println("	2) Determinar si es múltiplo de 3"); 
        System.out.println("	3) Calcular valor absoluto"); 
        System.out.print("\nElija una opción (1-3): ");
        selec = lea.nextByte();
        }
        switch(selec){ 
            case 1:
            if (num % 2 == 0){
                System.out.println("\nEl numero " + num + " SI es par");
                    }else {

                        System.out.println("\nEl numero " + num + " NO es par");
                    }
                    break; 
            case 2:
            if (num % 3 == 0) {
                System.out.println("\nEl número " + num + " SI es múltiplo de 3");
            }   else {
                    System.out.println("\nEl número " + num + " NO es múltiplo de 3");
                }
                break; 
            case 3:
            valorAbs = num; 
            if (num < 0) {
                valorAbs = num * (-1);
            }
            System.out.println("\nValor absoluto de " + num + " es: " + valorAbs);
            break;
        }
    }
}
