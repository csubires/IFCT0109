<<<<<<< HEAD
package tema2;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeras {

    public static void jugar() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] palabras = {"PIEDRA", "PAPEL", "TIJERAS"};
        String[] icon = {"✊", "✋", "✂️"};
        int contadorMaquina = 0;
        int contadorJugador = 0;
        int contadorEmpates = 0;

        System.out.print("¿Cuántas rondas quieres jugar?: ");
        int jugadas = sc.nextInt();

        while (jugadas-- > 0) {
            int maquina = random.nextInt(3);
           
            System.out.print("\n\n-------------------------------------------------");
            System.out.print("\n 1 - PIEDRA ✊ \t 2 - PAPEL ✋ \t 3 - TIJERAS ✂️\n Introduce tu elección: ");
            int jugador = sc.nextInt();
            System.out.println();
            if (jugador < 1 || jugador > 3) {
                System.out.println("Elección no válida");
                jugadas++;
                continue;
            }

            jugador -= 1;
            if (jugador == maquina) {
                System.out.println("🤖 MAQUINA: " + palabras[maquina] + " " + icon[maquina] +
                        "   VS   " + icon[jugador] + " " + palabras[jugador] +
                        " :JUGADOR 🤠 \n→ \t\t   EMPATE!!");
                contadorEmpates++;
            } else if (jugador == 0 && maquina == 2) {
                System.out.println("🤖 MAQUINA: " + palabras[maquina] + " " + icon[maquina] +
                        "   VS   " + icon[jugador] + " " + palabras[jugador] +
                        " :JUGADOR 🤠 \n→ \t\t   HAS GANADO 🎉");
                contadorJugador++;
            } else if (jugador == 2 && maquina == 0) {
                System.out.println("🤖 MAQUINA: " + palabras[maquina] + " " + icon[maquina] +
                        "   VS   " + icon[jugador] + " " + palabras[jugador] +
                        " :JUGADOR 🤠 \n→ \t\t   HAS PERDIDO 🙁");
                contadorMaquina++;
            } else if (jugador > maquina) {
                System.out.println("🤖 MAQUINA: " + palabras[maquina] + " " + icon[maquina] +
                        "   VS   " + icon[jugador] + " " + palabras[jugador] +
                        " :JUGADOR 🤠 \n→ \t\t   HAS GANADO 🎉");
                contadorJugador++;
            } else {
                System.out.println("🤖 MAQUINA: " + palabras[maquina] + " " + icon[maquina] +
                        "   VS   " + icon[jugador] + " " + palabras[jugador] +
                        " :JUGADOR 🤠 \n→ \t\t   HAS PERDIDO 🙁");
                contadorMaquina++;
            }
            System.out.print("-------------------------------------------------");
        }

        System.out.print("\n\nRESULTADO FINAL: → \t   ");
        if (contadorJugador > contadorMaquina)
            System.out.println("🎉 ¡¡¡HAS GANADO!!! 🎉");
        else if (contadorJugador == contadorMaquina)
            System.out.println("🤖 ¡¡¡HAS EMPATADO!!! 🤠");
        else
            System.out.println("🙁 ¡HAS PERDIDO! 🙁");
        System.out.println("\t🤖 MAQUINA: " + contadorMaquina);
        System.out.println("\t🤠 JUGADOR: " + contadorJugador);
        System.out.println("\tEMPATES: " + contadorEmpates);
    }

    public static void main(String[] args) {
    	boolean salir = true;
        System.out.println("Indica la opción:");
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (salir) {
            System.out.print("\nOpción [ 1.Jugar   2.Salir ]: ");
            opcion = sc.nextInt();
            if (opcion == 1)
            	jugar();
            else if (opcion == 2)
            	salir = false;
            else
                System.out.println("\\nOpción no válida");
        }
        System.out.println("\n\tHAS SALIDO DEL PROGRAMA !!");
    }
}
=======
package tema2;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeras {

    public static void jugar() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] palabras = {"PIEDRA", "PAPEL", "TIJERAS"};
        String[] icon = {"✊", "✋", "✂️"};
        int contadorMaquina = 0;
        int contadorJugador = 0;
        int contadorEmpates = 0;

        System.out.print("¿Cuántas rondas quieres jugar?: ");
        int jugadas = sc.nextInt();

        while (jugadas-- > 0) {
            int maquina = random.nextInt(3);
           
            System.out.print("\n\n-------------------------------------------------");
            System.out.print("\n 1 - PIEDRA ✊ \t 2 - PAPEL ✋ \t 3 - TIJERAS ✂️\n Introduce tu elección: ");
            int jugador = sc.nextInt();
            System.out.println();
            if (jugador < 1 || jugador > 3) {
                System.out.println("Elección no válida");
                jugadas++;
                continue;
            }

            jugador -= 1;
            if (jugador == maquina) {
                System.out.println("🤖 MAQUINA: " + palabras[maquina] + " " + icon[maquina] +
                        "   VS   " + icon[jugador] + " " + palabras[jugador] +
                        " :JUGADOR 🤠 \n→ \t\t   EMPATE!!");
                contadorEmpates++;
            } else if (jugador == 0 && maquina == 2) {
                System.out.println("🤖 MAQUINA: " + palabras[maquina] + " " + icon[maquina] +
                        "   VS   " + icon[jugador] + " " + palabras[jugador] +
                        " :JUGADOR 🤠 \n→ \t\t   HAS GANADO 🎉");
                contadorJugador++;
            } else if (jugador == 2 && maquina == 0) {
                System.out.println("🤖 MAQUINA: " + palabras[maquina] + " " + icon[maquina] +
                        "   VS   " + icon[jugador] + " " + palabras[jugador] +
                        " :JUGADOR 🤠 \n→ \t\t   HAS PERDIDO 🙁");
                contadorMaquina++;
            } else if (jugador > maquina) {
                System.out.println("🤖 MAQUINA: " + palabras[maquina] + " " + icon[maquina] +
                        "   VS   " + icon[jugador] + " " + palabras[jugador] +
                        " :JUGADOR 🤠 \n→ \t\t   HAS GANADO 🎉");
                contadorJugador++;
            } else {
                System.out.println("🤖 MAQUINA: " + palabras[maquina] + " " + icon[maquina] +
                        "   VS   " + icon[jugador] + " " + palabras[jugador] +
                        " :JUGADOR 🤠 \n→ \t\t   HAS PERDIDO 🙁");
                contadorMaquina++;
            }
            System.out.print("-------------------------------------------------");
        }

        System.out.print("\n\nRESULTADO FINAL: → \t   ");
        if (contadorJugador > contadorMaquina)
            System.out.println("🎉 ¡¡¡HAS GANADO!!! 🎉");
        else if (contadorJugador == contadorMaquina)
            System.out.println("🤖 ¡¡¡HAS EMPATADO!!! 🤠");
        else
            System.out.println("🙁 ¡HAS PERDIDO! 🙁");
        System.out.println("\t🤖 MAQUINA: " + contadorMaquina);
        System.out.println("\t🤠 JUGADOR: " + contadorJugador);
        System.out.println("\tEMPATES: " + contadorEmpates);
    }

    public static void main(String[] args) {
    	boolean salir = true;
        System.out.println("Indica la opción:");
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (salir) {
            System.out.print("\nOpción [ 1.Jugar   2.Salir ]: ");
            opcion = sc.nextInt();
            if (opcion == 1)
            	jugar();
            else if (opcion == 2)
            	salir = false;
            else
                System.out.println("\\nOpción no válida");
        }
        System.out.println("\n\tHAS SALIDO DEL PROGRAMA !!");
    }
}
>>>>>>> 827a9c3cd4859a769374b2da9587e2b8a1376cea
