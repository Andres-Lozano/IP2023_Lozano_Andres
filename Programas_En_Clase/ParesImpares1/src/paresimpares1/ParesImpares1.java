
package paresimpares1;
import java.util.Scanner;
public class ParesImpares1 {
    public static void main(String[] args) {
        Scanner lea =new Scanner(System.in);
        int n,b,par,impar;
        float resp,resi;
        int[] num;
        System.out.print("Ingresar la cantidad de numeros enteros: ");
        n=lea.nextInt();
        num= new int[n];
        for( b = 0; b < n-1; b++){
            System.out.print("Ingresar el elemento "+ (b+1)+":");
            num[b]= lea.nextInt();    
        }
        par=0;
        impar=0;
        
        for(b = 0; b<n;b++){
            if(num[b]% 2==0 || num[b]==0){
                par= par + 1;
                
            }else {
                impar= impar+1;
                
            }
             
        }
            
        resp = (par*100)/ (float)n;
        resi= (impar *100)/(float)n;
        System.out.println("El"+resp+ "% de los números son pares y el " + resi+"%impares ");
            
    }
 
    
}
