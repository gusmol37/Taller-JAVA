package vector1;

/*Importar librería*/

import java.util.Scanner;

public class Vector1{

    public static Scanner input = new Scanner(System.in);

/*Método de la clase. Carga de arreglo*/
    
    public static void main(String[] args){
        
        	System.out.println(" ");
        	System.out.println("     *********** Carga del Arreglo Vector1 ***********");
            System.out.println(" ");
            System.out.println("                ******* Bienvenido *******");
            System.out.println(" ");
            System.out.println("Por favor, indique valores para cada una de las posiciones del arreglo Vector1");
            int[] num = new int[5];
            for (int i=0; i<5; i++){
            num[i] = input.nextInt();
        }
        System.out.println(" ");
        for (int i=0;i<5;i++){
            System.out.println("["+i+"] "+num[i]);
        }
    }
}