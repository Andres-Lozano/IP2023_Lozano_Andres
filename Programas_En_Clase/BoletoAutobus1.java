import java.util.Scanner; 
public class BoletoAutobus1 {
	public static void main (String[] args) {
	// Declaracion de variables
	Scanner lea = new Scanner(System.in); 
	int km;
	float precioBase_Km;
	String dia;
	float descuentoDistancia;
	float descuentoDia;
	float total;
	precioBase_Km = (float) 0.05; 
	descuentoDistancia = (float) 0.15; 
	descuentoDia = (float) 0.05;
	// Ingreso de Datos
	System.out.println("Ingrese la distancia en km: "); 
		km = lea.nextInt();
	System.out.println("Ingrese si es día laborable (L) o día festivo (F): "); 
		dia = lea.next();
	// Calcular precio total 
	
	total = km * precioBase_Km; 
	if (km > 80) {
		total = total - (total * descuentoDistancia);
	}
	if (dia.equals("L")) {
		total = total - (total * descuentoDia);
	}
		System.out.println("El precio del boleto es: " + total);
}
