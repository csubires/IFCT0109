package tema2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notas;

        System.out.println("Dime tu nota: ");
        notas = sc.nextInt();

        if (notas > 0 && notas < 5) {
            System.out.println("Suspendido");
        } else {
            System.out.println("Aprobado");
        }

        sc.close();
	}

}
