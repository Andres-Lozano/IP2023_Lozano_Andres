
package estadmatriz1;
import java.util.Scanner;
public class EstadMatriz1 {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        //variables 
        int nfil,ncol;
        float ppares,c1,c2,pimpares,promediop,promedioi,prog,n3,cu;
        System.out.print("Cuantas filas tendrá la matriz? ");
        nfil=lea.nextInt();
        System.out.print("Cuantas filas tendrá la matriz? ");
        ncol=lea.nextInt();
        
        int[][] matriz = new int[nfil][ncol];
                ppares=0;
                c1=0;
                pimpares=0;
                c2=0;
                cu=0;     
                n3=0;
        System.out.println("Ingrese los eleentos[fila,columna]");
        System.out.println("----------------------------------");
        for(int i=0;i<=nfil-1;i++){
            for(int j=0;j<=ncol-1;j++){
                n3= n3+matriz[i][j];
                cu++;
                
                System.out.println("Ingrese el elemento ["+(i+1)+","+(j+1)+"]");
                matriz[i][j]=lea.nextInt();
                
               if(matriz[i][j] % 2==0 && matriz[i][j]==0){
                   ppares = ppares + matriz[i][j];
                   c1++;
               }else {
                   pimpares= pimpares+matriz[i][j];
                   c2++;
               } 
            }
        }
        promediop= (float)ppares/c1;
        promedioi=(float)pimpares/c2;
        prog = (float)n3/cu;
        
        System.out.println("Promedio pares:"+ promediop);
        System.out.println("Promedio impares:"+ promedioi);
        System.out.println("Promedio general:"+ prog);
    }
    
}
