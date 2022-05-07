package datosMascota;

	/*Importar libreria*/

import java.util.Scanner;

	/*Inicio de la clase*/

public class DatosMascota {

	/*Declaración de variables*/
	
	private static String nombre_mascota;
	private static String edad_mascota;	
	private static String tipo_mascota;
	private static String nombres_dueno;
	private static String apellidos_dueno;

	/*Método de la clase*/
	
	public static void main(String[] args) {

	/*Solicitud y captura de datos. Impresión de resultado.*/

		Scanner String = new Scanner(System.in);
		
		System.out.println("Indique el nombre de su mascota:");
		nombre_mascota = String.nextLine();	
		
		System.out.println("Indique la edad de su mascota:");
		edad_mascota = String.nextLine();
		
		System.out.println("Indique el tipo de mascota:");
		tipo_mascota = String.nextLine();
		
		System.out.println("Indique nombres del dueño:");
		nombres_dueno = String.nextLine();
		
		System.out.println("Indique apellidos del dueño:");
		apellidos_dueno = String.nextLine();

		System.out.println(nombre_mascota+ " es un(a) "+tipo_mascota+", el cual, tiene "+edad_mascota+" años de edad y "+nombres_dueno+" "+apellidos_dueno+ " es actualmente su dueño(a).");
	}

}
