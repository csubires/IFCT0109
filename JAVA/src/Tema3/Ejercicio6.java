<<<<<<< HEAD
package Tema3;

public class Ejercicio6 {
	public static void main(String[] args) {
		String texto;
		String [] [] array1= new String [3][2];
			
		array1[0][0]="España";
		array1[1][0]="Italia";
		array1[2][0]="Francia";
		array1[0][1]="Madrid";
		array1[1][1]="Roma";
		array1[2][1]="Paris";
			
		mostrarArray(array1);
		mostrarArray2(array1);
				
	}
	public static void mostrarArray(String[][] array1) {
	
		for (int a=0;a<array1.length;a++) {
			System.out.print(" pais: "+array1[a][0]);
			System.out.println(" capital: "+array1[a][1]);
			}	
	}
	
	public static void mostrarArray2(String[][] array1) {
		System.out.println(" length del array 1: "+array1.length);
		for (int a=0;a<array1.length;a++) {
			
			for (int b=0;b<array1[a].length;b++) {
				System.out.println(" array1[a]. lenght "+array1[a].length );
				System.out.println(" fila "+a+ " columna "+b+": "+array1[a][b]);
				
			}
		
			
		}	
	}

}
=======
package Tema3;

public class Ejercicio6 {
	public static void main(String[] args) {
		String texto;
		String [] [] array1= new String [3][2];
			
		array1[0][0]="España";
		array1[1][0]="Italia";
		array1[2][0]="Francia";
		array1[0][1]="Madrid";
		array1[1][1]="Roma";
		array1[2][1]="Paris";
			
		mostrarArray(array1);
		mostrarArray2(array1);
				
	}
	public static void mostrarArray(String[][] array1) {
	
		for (int a=0;a<array1.length;a++) {
			System.out.print(" pais: "+array1[a][0]);
			System.out.println(" capital: "+array1[a][1]);
			}	
	}
	
	public static void mostrarArray2(String[][] array1) {
		System.out.println(" length del array 1: "+array1.length);
		for (int a=0;a<array1.length;a++) {
			
			for (int b=0;b<array1[a].length;b++) {
				System.out.println(" array1[a]. lenght "+array1[a].length );
				System.out.println(" fila "+a+ " columna "+b+": "+array1[a][b]);
				
			}
		
			
		}	
	}

}
>>>>>>> 827a9c3cd4859a769374b2da9587e2b8a1376cea
