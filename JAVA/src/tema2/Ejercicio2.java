package tema2;

import java.util.Scanner;

public class Ejercicio2 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int edad;

	        System.out.println("Dime tu edad:");
	        edad = sc.nextInt();

	        if (edad < 18) {
	            System.out.println("menor de edad");
	        } else if (edad<=67) {
	        	 System.out.println("Trabajador activo");
	        }   
	        else {
	            System.out.println("A vivir la vida");
	        }

	        sc.close();
	    }
}
