package tablasMultiplicacion;

/*Importar librería*/

import java.util.Scanner;

public class TablasMultiplicacion {
	
/*Declaración de variables*/
	
    public static int numeroConsulta;
    public static Scanner String = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);

/*Métodos de la clase*/
        
    public static void main(String[] args) {
    	numeroConsulta = ingresaNumTabla();
        ingresaNumMultipli(numeroConsulta);
    }
    public static int ingresaNumTabla(){
    	System.out.println(" ");
    	System.out.println("           ********** Tablas de Multiplicar ***********");
    	System.out.println(" ");
    	System.out.println("                        *** Bienvenidos *** ");
    	System.out.println(" ");
        System.out.println("Indique el número de la tabla que desea consultar:");
        return input.nextInt();
    }
    public static void ingresaNumMultipli(int numTabla){
        for (int i =0 ; i <= 10; i++) {
            System.out.println(numTabla + " * " + i + " = " + (numTabla* i));
        }
    }
}