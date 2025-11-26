<<<<<<< HEAD
package Tema3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] numeros = {3, 7, 10, 5, 2};
        Scanner c = new Scanner(System.in);

        System.out.print("Introduce el número a buscar: ");
        int buscado = c.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++)
            if (numeros[i] == buscado)
                encontrado = true;
        if (encontrado)
        	System.out.println("Encontrado");
        else
        		System.out.println("no Encontrado");
        c.close();
    }

}
=======
package Tema3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] numeros = {3, 7, 10, 5, 2};
        Scanner c = new Scanner(System.in);

        System.out.print("Introduce el número a buscar: ");
        int buscado = c.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++)
            if (numeros[i] == buscado)
                encontrado = true;
        if (encontrado)
        	System.out.println("Encontrado");
        else
        		System.out.println("no Encontrado");
        c.close();
    }

}
>>>>>>> 827a9c3cd4859a769374b2da9587e2b8a1376cea
