package listanumabundantes1; import java.util.Scanner;
public class ListaNumAbundantes1 {
public static void main(String[] args) {

int n;
Scanner en = new Scanner(System.in);

System.out.print("Ingrese el numero de elementos que quiera mostrar: "); n= en.nextInt();

int[] l = new int[n];

for (int i = 1; i <= n; i++) { int suma = 0;
for (int j = 1; j < i; j++) { if (i % j == 0) {
suma += j;
}
}
if (suma > i) { l[i - 1] = i;
}
}
for (int i = 0; i < n; i++) { if (l[i] != 0) {
System.out.println(l[i]);
}
}
}

}
