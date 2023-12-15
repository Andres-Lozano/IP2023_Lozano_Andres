package listanumprimos1; import java.util.Scanner;
public class ListaNumPrimos1 {
public static void main(String[] args) {

Scanner lp = new Scanner(System.in); byte ele_mostrar;
byte encontrados; int num;
int c;
String esPrimo;

System.out.println("Ingrese la cantidad de primos a mostrar: "); ele_mostrar = lp.nextByte();
encontrados = 0;
num = 2;
while (encontrados < ele_mostrar){ esPrimo = "S";
c = num - 1; while (c >= 2) {
if (num % c == 0) { esPrimo = "N";
}
c = c - 1;
}
if (esPrimo.equals("S")) { System.out.println(num);
encontrados = (byte) (encontrados + 1);
}
num = num + 1;

}
}
}
