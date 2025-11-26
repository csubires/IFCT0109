<<<<<<< HEAD
package Tema3;

public class Ejercicio4 {
	public static void main(String[] args) {
		String texto;
		String [] array1= {"Eva","Ana", "Cristina", "Pablo", "Maria", "Isabel"}; 
		String [] array2= new String[6]; 
	
		array2[0]="España";
		array2[1]="Francia";
		array2[2]="Estados Unidos";
		array2[3]="Italia";
		array2[4]="Irlanda";
		array2[5]="Rep.Checa";
		mostrarArray("Array1 Nombres",array1);	
		mostrarArray("Array2 Paises",array2);
	}
	public static void mostrarArray(String texto,String [] array) {
		System.out.println(texto+"******");
		for (String array1:array) {
			System.out.println(" Array "+array1);
			}
		
		
	} 

}
=======
package Tema3;

public class Ejercicio4 {
	public static void main(String[] args) {
		String texto;
		String [] array1= {"Eva","Ana", "Cristina", "Pablo", "Maria", "Isabel"}; 
		String [] array2= new String[6]; 
	
		array2[0]="España";
		array2[1]="Francia";
		array2[2]="Estados Unidos";
		array2[3]="Italia";
		array2[4]="Irlanda";
		array2[5]="Rep.Checa";
		mostrarArray("Array1 Nombres",array1);	
		mostrarArray("Array2 Paises",array2);
	}
	public static void mostrarArray(String texto,String [] array) {
		System.out.println(texto+"******");
		for (String array1:array) {
			System.out.println(" Array "+array1);
			}
		
		
	} 

}
>>>>>>> 827a9c3cd4859a769374b2da9587e2b8a1376cea
