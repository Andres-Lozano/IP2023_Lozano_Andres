package fibonacci1;
import java.util.Scanner; public class Fibonacci1 {
public static void main(String[] args) {

Scanner lea= new Scanner(System.in); byte num,c;
int fib_anterior; int fib_nuevo; int proximo;
System.out.print("Ingrese los elementos fibonacci a mostrar: "); num = lea.nextByte();
fib_anterior = 0; System.out.println(fib_anterior); fib_nuevo = 1;
for (c = 2; c <= n; c++) {

System.out.println(fib_nuevo); proximo = fib_anterior + fib_nuevo; fib_anterior = fib_nuevo;
fib_nuevo = proximo;
}
}

}

