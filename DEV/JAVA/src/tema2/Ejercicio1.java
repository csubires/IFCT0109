<<<<<<< HEAD
package tema2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.print("¿Qúe tabla quieres? ");
				int numero = Integer.parseInt(sc.nextLine());
				int i = 1;
				
				System.out.println("Con do while");
				do {
					System.out.println(numero + " x " + i + " = " + (numero * i));
					i++;
				} while (i <= 10);
				
				System.out.println("Con for");
				for (int j = 1; j <= 10; j++)
					System.out.println(numero + " x " + j + " = " + (numero * j));
				
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
=======
package tema2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.print("¿Qúe tabla quieres? ");
				int numero = Integer.parseInt(sc.nextLine());
				int i = 1;
				
				System.out.println("Con do while");
				do {
					System.out.println(numero + " x " + i + " = " + (numero * i));
					i++;
				} while (i <= 10);
				
				System.out.println("Con for");
				for (int j = 1; j <= 10; j++)
					System.out.println(numero + " x " + j + " = " + (numero * j));
				
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
>>>>>>> 827a9c3cd4859a769374b2da9587e2b8a1376cea
