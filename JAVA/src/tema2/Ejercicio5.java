package tema2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notas;

        System.out.println("Dime tu nota: ");
        notas = sc.nextInt();

        if (notas < 5) {
            System.out.println("Suspendido");
        } else {
            if (notas == 5) {
                System.out.println("Suficiente");
            } else {
                if (notas == 6) {
                    System.out.println("Bien");
                } else {
                    if (notas == 7 || notas == 8) {
                        System.out.println("Notable");
                    } else {
                        if (notas == 9 || notas == 10) {
                            System.out.println("Sobresaliente");
                        } else {
                            System.out.println("No válido");
                        }
                    }
                }
            }
        }
        sc.close();
	}

}
