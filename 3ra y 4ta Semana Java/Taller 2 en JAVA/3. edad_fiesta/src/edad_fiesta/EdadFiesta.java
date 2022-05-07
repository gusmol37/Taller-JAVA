package edad_fiesta;

	/*importar libreria*/

import java.util.Scanner;

public class EdadFiesta {
	
	/*Declaración de variables*/
	
	public static int edad;
    public static String nombre_apellidos;
    public static Scanner String = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);
    
    /*M�todos de la clase*/

    public static void main(String[] args) {
    	nombre_apellidos = ingresa_nombre();
        edad = ingresa_edad();
        dato_usuario(edad);
    }

    public static String ingresa_nombre(){
        System.out.println("Por favor, indique su nombre completo.");
        return String.nextLine();
    }

    public static int ingresa_edad(){
        System.out.println("Por favor, indique su edad.");
        return input.nextInt();
    }

    public static void dato_usuario(int edad){
        if (edad >= 18) {
            System.out.println(nombre_apellidos + ", usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
        }
        
        else{
            System.out.println(nombre_apellidos+", usted es menor de edad, por lo tanto no puede entrar a la fiesta. Por favor, devu�lvase para su casa.");
        }
    }

}
