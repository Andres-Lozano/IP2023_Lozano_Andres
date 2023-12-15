
package venta3;

/**
 *
 * @author wilso
 */
public class Venta3 {
    public static void main(String[] args) {
        short cant1,cant2,cant3;
        String nombre1,nombre2,nombre3;
        float precio1,precio2,precio3,subtotal,iva,total;
        
        cant1=4;
        nombre1="Televisor LG";
        precio1= (float)765.87;
        cant2=10;
        nombre2="Computadora ASUS";
        precio2=(float)2324.56;
        cant3=7;
        nombre3="Juego de sala";
        precio3=(float)655.99;
        subtotal=cant1*precio1+cant2*precio2+cant3*precio3;
        iva=(float)(subtotal*0.12);
        total= subtotal*iva;
        
        System.out.println("FACTURA DE COMPRA");
        System.out.println("==================\n");
        System.out.println("+----------------------------------------------------------------+");
        System.out.println("|Cantidad  | Items               | Precio Unitario  |Precio Total|");
        System.out.println("|----------------------------------------------------------------|");
        System.out.printf("| %8d | %-19s | %,16.2f | %,10.2f |%n",cant1,nombre1,precio1,cant1*precio1);
        System.out.printf("| %8d | %-19s | %,16.2f | %,10.2f |%n",cant2,nombre2,precio2,cant2*precio2);
        System.out.printf("| %8d | %-19s | %,16.2f | %,10.2f |%n",cant3,nombre3,precio3,cant3*precio3);
        System.out.println("+----------------------------------------------------------------+");
        System.out.printf("| %8n | %-19n | %,16.2n | %,10.2f |%n",", Subtotal",subtotal);
        System.out.printf("| %8n | %-19n | %,16.2n | %,10.2f |%n",", TOTAL",total);
         System.out.println("+----------------------------------------------------------------+");        
        
        
    }
    
    
}
