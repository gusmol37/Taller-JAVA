package escaleraIzquierda;

/*Importar librer�a*/

import java.util.Scanner;

public class EscaleraIzquierda {

/*Declaraci�n de variables*/

    public static String espacios,asteriscos;
    public static int cant_filas, contador, i;
    public static Scanner input = new Scanner(System.in);

/*M�todos de la clase*/

    public static void main(String[] args) {
        contador = 0;
        i = 0;
        System.out.println(" ");
        System.out.println("ATENCI�N --> Escriba el n�mero 10 para generar la escalera");
        cant_filas = input.nextInt();
        filas(cant_filas);
    }
    public static void filas(int cant_filas){
        while (contador <= cant_filas){
            espacios = " ";
            asteriscos = "*";
            i = 0;
            while (i < cant_filas - contador){
                espacios = espacios + " ";
                i = i + 1;
            }
            i = 0;
            while ( i < contador){
                asteriscos = asteriscos +  "*";
                i = i + 1;
            }
            System.out.println(espacios+asteriscos);
            contador = contador + 1;
        }
        
     }
}