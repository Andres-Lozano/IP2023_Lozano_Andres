public class ConversionesDeTipo1 {
	public static void main(String[] args) {
		int x = 2;
		byte y = 5;
		short z = 3;
		float resultado;

		resultado = (float) y / x * z;

		System.out.println("Dados x = 2 ; y = 5 ; z = 3");
		System.out.println("\nEl resultado de ( y / x * z )es " + resultado);
		
	}
}