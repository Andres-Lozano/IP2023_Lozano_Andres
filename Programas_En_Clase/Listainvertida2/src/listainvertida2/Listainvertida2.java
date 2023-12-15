package listainvertida2;
import java.util.Scanner;
public class Listainvertida2 {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        int n;
        int[] lista;
        System.out.print("Cuantos números desea ingresar? ");
        n= lea.nextInt();
        lista= new int[n];
        for(int i = 0;i<=n-1 ; i++){
            System.out.print("Ingrese el elemento" + (i+1)+":");
            lista[i]= lea.nextInt();
            
        }
        System.out.print("\nLa lista invertida es:");
        for (int i = n -1;i>=0;i--){
            System.out.println(lista[i]);
        }
    }
    
}
