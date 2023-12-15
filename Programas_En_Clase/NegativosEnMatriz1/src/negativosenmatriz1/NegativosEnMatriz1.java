
package negativosenmatriz1;
import java.util.Scanner;
public class NegativosEnMatriz1 {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        //variables
        byte nfil,ncol;
        System.out.println("cuantas filas tendrá la matriz?");
        nfil=lea.nextByte();
        System.out.println("cuantas columnas tendrá la matriz?");
        ncol=lea.nextByte();
        
        int[][] matriz =new int[nfil][ncol];
        
        System.out.println("Ingrese los eleentos[fila,columna]");
        System.out.println("----------------------------------");
        for (int i=0;i<= nfil-1;i++) {
            for (int j=0;j<= ncol-1;j++){
                System.out.print("Elemento["+ (i+1) + ","+ (j+1)+"]"); 
                matriz[i][j]=lea.nextInt();
            }
        }
        int cneg=0;
        for (int i=0;i<= nfil-1;i++) {
            for (int j=0;j<= ncol-1;j++){
                if(matriz[i][j]<0){
                    matriz[i][j]=matriz[i][j]*(-1);
                    cneg++;
                }

            }
        }
        System.out.println("\nSe encontraron "+ cneg + "negativos"); 
        
    }
    
}
