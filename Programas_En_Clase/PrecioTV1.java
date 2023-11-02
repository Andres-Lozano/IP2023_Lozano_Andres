public class PrecioTV1 {
	public static void main(String[] args) {
		short presioTV = 837;
		float iva; 
		float precioTotal;

		iva = presioTV * (float) 0.12;

		precioTotal = iva + presioTV ;

		System.out.println("El precio del Televisor es: " + precioTotal);

		
	}
}