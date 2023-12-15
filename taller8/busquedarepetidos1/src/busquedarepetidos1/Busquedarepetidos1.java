package busquedarepetidos1; import java.util.Scanner;
public class BusquedaRepetidos1 {
public static void main(String[] args) {

Scanner la = new Scanner(System.in); int c, n, n1, n2,n3;

System.out.print("Ingrese el # de elementos que va a ingresar: "); n = la.nextInt();

int [] l = new int[n]; int[] p = new int[n];

c = 0;
n1 = 0;

while (c < n) {
System.out.print("Ingrese el " + (c + 1) + " elemento: "); l[c] = la.nextInt();
c++;
}

n2 = l[n - 1];

for (int i = 0; i < n; i=i+1) { n3 = l[i];
if (n3 == n2) { p[n1] = i; n1=n1+1;
}
}

if (n1 > 0) {
System.out.println("El último número es " + n2 + ", se repite " + n1 + " veces en las posiciones: ");
for (int i = 0; i < n1; i++) { System.out.print(p[i] + 1 + ", ");
}
}

}

}
