package capitalPais;

	/*Importar libreria*/

import java.util.Scanner;

	/*Inicio de la clase*/

public class CapitalPais {

	/*Declaración de variables*/
	
	private static String pais;
	private static String capital;

	/*Método de la clase*/
	
	public static void main (String[] arg) {

	/*Solicitud y captura de datos. Impresión de resultado.*/
		
		Scanner String = new Scanner(System.in);
		
		System.out.println("Por favor, indique el nombre de la ciudad capital de un pais:");
		capital = String.nextLine();
		
		System.out.println("Por favor, indique el nombre del país al cual, corresponde la capital antes señalada:");
		pais = String.nextLine();
				
		System.out.println("La ciudad "+capital+", "+"es la capital del pais "+pais+"." );
		
	}

}
