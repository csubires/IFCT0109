package tema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int ingresos;

        System.out.print("Dime tus ingresos: ");
        ingresos = sc.nextInt();

        if (ingresos < 1500) {
            System.out.println("Salario mínimo");
        } else if (ingresos>15 && ingresos<3000){
            System.out.println("Salario medio");
        }else {
        	 System.out.println("Salario alto");
        }

        sc.close();
	}

}
