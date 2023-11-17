import java.util.Scanner;

public class CompraElectrodomestico1 {
	public static void main (String[] args) {
		

		Scanner lea = new Scanner(System.in);
		double precioBase;
		int libras;
		int kilometros;
		double precioConIVA;
		double costoEnvio;
		double totalPagar;
		

		System.out.println("Ingrese el precio del electrodomestico: ");
		precioBase = lea.nextDouble();
		System.out.println("Ingrese el peso en libras: ");
		libras = lea.nextInt();
		System.out.println("Ingrese la distancia al domicilio en Km: ");
		kilometros = lea.nextInt();
		System.out.println("");
		

		precioConIVA = 1.12 * precioBase;
		costoEnvio = 0.01 * libras * kilometros;
		totalPagar = precioConIVA + costoEnvio; 
		

		System.out.println("Total a pagar con IVA y entrega a domicilio: " +totalPagar+ " USD");

		lea.close();



	}
}