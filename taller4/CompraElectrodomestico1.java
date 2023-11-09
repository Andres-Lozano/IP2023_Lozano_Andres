import java.util.Scanner;
public class CompraElectrodomestico1{
	public static void main(String[] args) {

		Scanner lea = new Scanner(System.in);

		float precioBase,precioIVA;
		int  pesoLb;
		float precioLb;
		int  distanciaKb;
		float envio;
		double total;
		
		System.out.println("FACTURACION DE ElCTRODOMESTICO");
		System.out.println("==============================");
		System.out.println("");

		System.out.print("Ingrese el precio del Electrodomestico: ");
		precioBase = lea.nextFloat();
		System.out.print("Ingrese el Peso en Libras: ");
		pesoLb = lea.nextInt();
		System.out.print("Ingrese la distacia del Domicilio: ");
		distanciaKb = lea.nextInt();


		precioIVA = (precioBase * 0.12) + precioBase;
		precioLb = pesoLb * 0.01;
		envio = distanciaKb * 0.01;

		total = precioIVA + precioLb + envio;

		System.out.println("Total a pagar con IVA y entrega a Domicilio: " + total + "USD");


		lea.close();










		
	}
}