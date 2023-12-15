package estadnumeros4; import java.util.Scanner;
public class EstadNumeros4 {
public static void main(String[] args) {
Scanner en = new Scanner(System.in); int n,c,n1,n2,n4,n5,n6,n7;
float n3;

System.out.print("Ingrese el numero de elementos que quiera mostrar: "); n= en.nextInt();
System.out.println("Ingrese el numeros de los que quiere la media aritmetica: ");
int [] l = new int [n]; n2 = 0;
n4 = 0;
n5 = 100; n6=0; n7=0;
for (c = 0 ; c < n; c++){ l[c]= en.nextInt();
if (l[c] > 1){ n6 = n6 +1;

    }else {
    n7 = n7 +1;
}
    if (l[c] > n4 ){ n4 = l[c];
}

if (l[c] < n5 ){
n5 = l[c];
}

n2= n2 + l[c];
}
n3 =(float)n2/n;
System.out.println("La media arimetica de los "+n+" numeros es "+n3); System.out.println("El numero mayor es: "+ n4); System.out.println("El numero menor es: "+ n5); System.out.println("La cantidad de numeros positvos es de: "+ n6); System.out.println("La cantidad de numeros negativos es de: "+ n7);
}
}
