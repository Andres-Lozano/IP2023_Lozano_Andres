package sueldomasalto1; import java.util.Scanner;
public class SueldoMasAlto1 {
public static void main(String[] args) {

Scanner la = new Scanner(System.in); int n, n1;

System.out.print("Cuantos sueldos de empleados va a ingresar: "); n = la.nextInt();

int [] l= new int[n]; String [] p= new String[n];

n1 = 0;

for (int c=0; c < n ;c++){

System.out.print("Ingrese el nombre del "+(c+1)+" empleado: "); la.nextLine();
p[c]= la.nextLine();

System.out.print("Ingrese el sueldo del "+(c+1)+" empleado: "); l[c]= la.nextInt();
if (l[c]> n1){

n1=l[c];
}
}
System.out.println("El sueldo mayor es: "+n1); System.out.println("Los empleados que los ganan son: ");

for (int c=0; c < n ;c++){ if (l[c] == n1){

System.out.println(p[c]);

}

}

}

}
