
package convertidortemp1;
import java.util.Scanner;
public class ConvertidorTemp1 {

    public static void main(String[] args) {
        byte grados;
        String unidad;
        float salida;
        Scanner lea = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura: ");
        grados = lea.nextByte();
        System.out.print("Ingrese la unidad de medida[Celcious(C)o Fahrenheit(F)]: ");
        lea.nextLine();
        unidad = lea.nextLine();
        
        //proceso
        if (unidad.equals("c") || unidad.equals("C") ){
            salida = (float)9 / 5 * grados + 32;
            System.out.println("La temperatura en grados Fahrenheit es: " + salida);
        }else if (unidad.equals("f")|| unidad.equals("F")){
            salida = (float)5 / 9 * grados - 32;
            System.out.println("La temperatura en grados Celcious es: " + salida);
        }else{
            System.out.println("Unidad de medida incorrecta...");
            
        }
        }
        
  
        
                
    
    }
    

