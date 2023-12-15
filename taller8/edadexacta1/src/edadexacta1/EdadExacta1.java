package edadexacta1;
import java.util.Scanner; public class EdadExacta1 {
public static void main(String[] args) {

//Variables
Scanner lea = new Scanner(System.in); 
int anualidad_actual;
int anualidad_nacimiento,dia_actual,dia_nacimiento,mes_actual,mes_nacim iento,anualidad,dia,mes,mes_1,anualidad_1;
//Ingreso de datos
System.out.print("Ingrese el año actual: "); 
anualidad_actual = lea.nextInt(); 
System.out.print("Ingrese el mes actual: "); 
mes_actual = lea.nextInt(); 
System.out.print("Ingrese el dia actual: "); 
dia_actual = lea.nextInt();

System.out.print("Ingrese el año de su nacimiento: "); 
anualidad_nacimiento = lea.nextInt(); 
System.out.print("Ingrese el mes de su nacimiento: "); 
    int mes_nacimiento = lea.nextInt(); 
System.out.print("Ingrese el dia de su nacimiento: "); 
dia_nacimiento = lea.nextInt();

if (anualidad_actual < anualidad_nacimiento ){ 
    System.out.print("Datos de entrada incorrectos ");
}else {
    int mes_1 = 12 - mes_nacimiento + mes_actual; 
    int anualidad_1 = anualidad_actual - anualidad_nacimiento; 
    int dia = 30 - dia_nacimiento + dia_actual;
if (mes_nacimiento > mes_actual && dia > 1) { 
        int mes = mes_1 - 1;
        int anualidad = anualidad_1 - 1;
System.out.print("Su edad exacta es "+anualidad+" años con "+mes+" meses y "+dia+" dias");
}
if (dia > 1 && mes_nacimiento < mes_actual && !(dia > 30)) { 
    mes_1 = 12 - mes_nacimiento;
        int mes = mes_1 -1;
anualidad = anualidad_1;
System.out.print("Su edad exacta es "+anualidad+" años con "+mes+" meses y "+dia+" dias");
}

if (dia > 30) {

dia = 30 - dia_nacimiento - dia_actual; mes_1 = 12 - mes_nacimiento;
        int mes = mes_1 -1; 
        int anualidad = anualidad_1;
System.out.print("Su edad exacta es "+anualidad+" años con "+mes+" meses y "+dia+" dias");
}

}
}
}
