import java.util.Scanner;
public class Venta1{
	public static void main(String[] args) {

		float articulo1;
		float articulo2;
		float articulo3;
		double valorPaga;
		

		Scanner scanner = new Scanner(System.in);

		System.out.println("COMPRA DE ARTICULOS");
		System.out.println("===================");

		System.out.println("\nInserte el precio del aritoiculo 1: ");
		articulo1 = scanner.nextFloat();
		System.out.println("Inserte el precio del ariticulo 2: ");
		articulo2 = scanner.nextFloat();
		System.out.println("Inserte el precio del ariticulo 3: ");
		articulo3 = scanner.nextFloat();

		valorPaga = (articulo1 + articulo2 + articulo3) + (articulo1 + articulo2 + articulo3) * 0.12; 

		System.out.println("\nEL TOTAL A PAGAR MAS EL IVA ES DE: " + valorPaga);

		scanner.close();
		
	}
}
