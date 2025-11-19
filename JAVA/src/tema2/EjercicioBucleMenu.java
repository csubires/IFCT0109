package tema2;

import java.util.Scanner;

public class EjercicioBucleMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean verdadfalso = false;

        System.out.println("¿Quieres jugar? (S/N)");

        while (!verdadfalso) {

            String opcion = sc.next().toUpperCase();

            if (opcion.equals("S")) {
                verdadfalso = true;
                System.out.println("Has elegido Jugar");
            } else {
                System.out.println("Has elegido otra opción");
            }
        }

        sc.close();
    }
}
