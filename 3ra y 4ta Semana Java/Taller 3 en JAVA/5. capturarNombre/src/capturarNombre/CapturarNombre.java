package capturarNombre;

/*Importar librería*/

import java.util.Scanner;

public class CapturarNombre{
	
/*Declaración de variables*/

    public static String ingresaNombre;
    public static int opcion;
    public static Scanner String = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);
    
/*Métodos de la clase*/

    public static void main(String[] args){
        do {
            opcion = menuOpcion();
            usuarioOpcion(opcion);
        }while (opcion!=3);
    }

/*Menú principal y Bienvenida*/

    public static int menuOpcion(){
    	System.out.println(" ");
    	System.out.println("           ********** Captura de Nombre ***********");
    	System.out.println(" ");
    	System.out.println("                     *** Bienvenido *** ");
    	System.out.println(" ");
        System.out.println("Menú de usuario");
        System.out.println(" ");
        System.out.println("1. Captura nombre");
        System.out.println("2. Saludar persona");
        System.out.println("3. Salir del sistema");
        return input.nextInt();
    }

/*Captura de datos*/
    
    public static void usuarioOpcion(int opcion){
            switch (opcion){
                case 1:
                    System.out.println("Por favor, indique su nombre:");
                    ingresaNombre = String.nextLine();
                    break;
                case 2:
                    System.out.print("¡¡¡ Hola "+ingresaNombre+" !!!");
                    break;
                case 3:
                	System.out.println(" ");
                    System.out.println("         ¡Gracias por preferirnos!");
                    System.out.println("               ¡Hasta luego!");
                    System.out.println(" ");
                    break;
            }
    }
}