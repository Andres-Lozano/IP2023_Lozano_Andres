package pkgfor;
import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        int n,par;
        System.out.print("Ingrese # de pares a mostrar: ");
        n = lea.nextInt();
        for (int c=1; c<=n;c=c+1){
            par = c* 2;
            System.out.println(par);
        }
        
        
    }
    
}
