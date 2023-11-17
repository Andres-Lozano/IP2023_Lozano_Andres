
package tipologiapelículas3;
import java.util.Scanner;


public class TipologiaPelículas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short duracion;
        System.out.print("Ingrese la dracion de la pelicula en minutos: ");
        duracion = sc.nextShort();
        
        if(duracion<= 0 || duracion >1000) {
            System.out.print("El dato engresado es incorrecto");
        } else if (duracion < 30 ) {
            System.out.print("La´pelicula es un cortometraje");
        } else if (duracion < 60) {
            System.out.print("La´pelicula es un Mediometraje");
        } else {
            System.out.print("La´pelicula es un Largometraje");
            
        }
    
    }
    
}
