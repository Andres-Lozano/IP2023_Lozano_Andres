import java.util.Scanner; 
public class DiasMes1 {
	public static void main(String[] args) {
	// Declaracion de variables
	Scanner scanner = new Scanner(System.in); 
	
	int n_Mes;
	
	// Ingreso de Datos
	
	System.out.print("Ingrese el número de un mes (1 a 12): "); 
	numeroMes = scanner.nextInt();
	
	// Mostrar la cantidad de días que tiene el mes
	
	switch (n_Mes) {
	case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
		System.out.println("El mes tiene 31 días.");
		break;
		case 4: case 6: case 9: case 11: 
	System.out.println("El mes tiene 30 días."); break;
		case 2:
		System.out.println("El mes tiene 28 días."); break;
		default:
		System.out.println("Número de mes incorrecto."); break;
		}
	}
}
	
