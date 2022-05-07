package misPadresSon;

	/*Importar libreria*/

import java.util.Scanner;

	/*Inicio de la clase*/

public class MisPadresSon {

	/*Declaración de variables*/
	
	private static String nombres_hijo;
	private static String apellidos_hijo;
	private static String nombres_madre;
	private static String apellidos_madre;
	private static String nombres_padre;
	private static String apellidos_padre;

	/*Método de la clase*/
	
public static void main (String[] arg) {

	/*Solicitud y captura de datos. Impresión de resultado.*/
		
		Scanner String = new Scanner(System.in);
		
		System.out.println("Indique sus nombres:");
		nombres_hijo = String.nextLine();		
		System.out.println("Indique sus apellidos:");
		apellidos_hijo = String.nextLine();
		
		System.out.println("Indique los nombres de su madre:");
		nombres_madre = String.nextLine();		
		System.out.println("Indique los apellidos de su madre:");
		apellidos_madre = String.nextLine();
		
		System.out.println("Indique los nombres de su padre:");
		nombres_padre = String.nextLine();		
		System.out.println("Indique los apellidos de su padre:");
		apellidos_padre = String.nextLine();
		
		System.out.println("Yo, "+ nombres_hijo+" "+apellidos_hijo+ " soy hijo de "+nombres_madre+ " "+ apellidos_madre+ " y "+nombres_padre+" "+apellidos_padre);
		
   }	

}
