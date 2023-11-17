package aptitudsufragar1;

import java.util.Scanner;

public class AptitudSufragar1 {
    public static void main(String[] args) {
        // Declaracion de variables
           Scanner sc = new Scanner(System.in);  
           int anioActual, anioNacimiento, edad;
        // Ingreso de Datos
        System.out.println("Ingrese el año actual: ");
        anioActual = sc.nextInt();
        System.out.println("Ingrese su año de nacimiento: ");
        anioNacimiento = sc.nextInt();
        // Calcular edad
        edad = anioActual-anioNacimiento;
        // Determinar aptitud para sufragar
        if (edad < 16) {
            System.out.println("No puede votar");
        } else if (edad == 16) {
            System.out.println("Puede votar opcionalmente");
        } else if (edad == 17) {
            System.out.println("Puede votar opcionalmente");
        } else if (edad >= 18) {
            System.out.println("El voto es obligatorio");
        } else if (edad <= 64) {
            System.out.println("El voto es obligatorio");
        } 
        if (anioNacimiento > anioActual) {
            System.out.println("El año actual no puede ser anterior al año de nacimiento.");
        }
    } 
    
}