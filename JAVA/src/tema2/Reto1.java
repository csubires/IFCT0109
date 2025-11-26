<<<<<<< HEAD
package tema2;

import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el importe: ");
        double importe = sc.nextDouble();
        System.out.print("Introduce las unidades: ");
        int unidades = sc.nextInt();
        double total = importe * unidades;
        System.out.print("Introduce el IVA (4, 7 o 21): ");
        int iva = sc.nextInt();
        double cantidadIVA;

        if (iva == 4 || iva == 7 || iva == 21) {
        	cantidadIVA = (double)total * (double)(iva / 100.00);
        } else {
            System.out.println("IVA no válido, se aplicará 21% por defecto.");
            cantidadIVA = total * 0.21;
        }

        double totalPagar = total + cantidadIVA;
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Importe: " + importe);
        System.out.println("Unidades: " + unidades);
        System.out.println("Total: " + total);
        System.out.println("IVA aplicado (" + iva + "%): " + cantidadIVA);
        System.out.println("Total a pagar: " + totalPagar);

        sc.close();
	}

}

/*
Por scanner me pida el importe, las unidades,
me hará un total, y me pedirá un iva
4%,7% o 21%, según el iva que me pida me calculará dicho iva, para ellos usaremos
una condicional. me deberá aparecer por pantalla, importe, unidades, total, iva y el total a pagar que será
la suma de total+iva
*/

=======
package tema2;

import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el importe: ");
        double importe = sc.nextDouble();
        System.out.print("Introduce las unidades: ");
        int unidades = sc.nextInt();
        double total = importe * unidades;
        System.out.print("Introduce el IVA (4, 7 o 21): ");
        int iva = sc.nextInt();
        double cantidadIVA;

        if (iva == 4 || iva == 7 || iva == 21) {
        	cantidadIVA = (double)total * (double)(iva / 100.00);
        } else {
            System.out.println("IVA no válido, se aplicará 21% por defecto.");
            cantidadIVA = total * 0.21;
        }

        double totalPagar = total + cantidadIVA;
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Importe: " + importe);
        System.out.println("Unidades: " + unidades);
        System.out.println("Total: " + total);
        System.out.println("IVA aplicado (" + iva + "%): " + cantidadIVA);
        System.out.println("Total a pagar: " + totalPagar);

        sc.close();
	}

}

/*
Por scanner me pida el importe, las unidades,
me hará un total, y me pedirá un iva
4%,7% o 21%, según el iva que me pida me calculará dicho iva, para ellos usaremos
una condicional. me deberá aparecer por pantalla, importe, unidades, total, iva y el total a pagar que será
la suma de total+iva
*/

>>>>>>> 827a9c3cd4859a769374b2da9587e2b8a1376cea
