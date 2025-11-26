<<<<<<< HEAD
package tema2;

import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce el importe: ");
	        double importe = sc.nextDouble();
	        System.out.print("Introduce las unidades: ");
	        int unidades = sc.nextInt();
	        double total = importe * unidades;

	        double descuento = 0;
	        if (total > 1000)
	            descuento = total * 0.10;
	       
	        double totalConDescuento = total - descuento;
	        System.out.print("Introduce el IVA (4, 7 o 21): ");
	        int iva = sc.nextInt();
	        double cantidadIVA;

	        if (iva == 4 || iva == 7 || iva == 21) {
	            cantidadIVA = (double)totalConDescuento * (double)(iva / 100.00);
	        } else {
	            System.out.println("IVA no válido, se aplicará 21% por defecto.");
	            cantidadIVA = totalConDescuento * 0.21;
	            iva = 21;
	        }
	        double totalPagar = totalConDescuento + cantidadIVA;
	        System.out.println("\n--- RESULTADO ---");
	        System.out.println("Importe unitario: " + importe);
	        System.out.println("Unidades: " + unidades);
	        System.out.println("Total sin descuento: " + total);
	        System.out.println("Descuento aplicado: " + descuento);
	        System.out.println("Total con descuento: " + totalConDescuento);
	        System.out.println("IVA (" + iva + "%): " + cantidadIVA);
	        System.out.println("Total a pagar: " + totalPagar);
	        sc.close();
	}
}

/*
Reto 3:************************************

Al ejercicio anterior le aplicamos diferentes tipos de descuentos:

=======
package tema2;

import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce el importe: ");
	        double importe = sc.nextDouble();
	        System.out.print("Introduce las unidades: ");
	        int unidades = sc.nextInt();
	        double total = importe * unidades;

	        double descuento = 0;
	        if (total > 1000)
	            descuento = total * 0.10;
	       
	        double totalConDescuento = total - descuento;
	        System.out.print("Introduce el IVA (4, 7 o 21): ");
	        int iva = sc.nextInt();
	        double cantidadIVA;

	        if (iva == 4 || iva == 7 || iva == 21) {
	            cantidadIVA = (double)totalConDescuento * (double)(iva / 100.00);
	        } else {
	            System.out.println("IVA no válido, se aplicará 21% por defecto.");
	            cantidadIVA = totalConDescuento * 0.21;
	            iva = 21;
	        }
	        double totalPagar = totalConDescuento + cantidadIVA;
	        System.out.println("\n--- RESULTADO ---");
	        System.out.println("Importe unitario: " + importe);
	        System.out.println("Unidades: " + unidades);
	        System.out.println("Total sin descuento: " + total);
	        System.out.println("Descuento aplicado: " + descuento);
	        System.out.println("Total con descuento: " + totalConDescuento);
	        System.out.println("IVA (" + iva + "%): " + cantidadIVA);
	        System.out.println("Total a pagar: " + totalPagar);
	        sc.close();
	}
}

/*
Reto 3:************************************

Al ejercicio anterior le aplicamos diferentes tipos de descuentos:

>>>>>>> 827a9c3cd4859a769374b2da9587e2b8a1376cea
*/