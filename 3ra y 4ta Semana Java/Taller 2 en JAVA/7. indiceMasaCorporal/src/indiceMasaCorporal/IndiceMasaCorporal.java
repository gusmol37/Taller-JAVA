package indiceMasaCorporal;

/*Importar libreria*/

import java.util.Scanner;

public class IndiceMasaCorporal {

/*Declaracion de variables*/
	
    public static String nombre_usuario;
    public static int peso_usuario, opcion;
    public static double estatura;
    public static double imc;
    public static Scanner String = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        opcion = datosPersonales();
        ingresaDatosPersonales(opcion);
    }
    
/*Métodos de la clase*/

    public static int datosPersonales(){
    	
    	/*Menú Principal y captura de datos*/
    	
    	System.out.println(" ");
    	System.out.println(" ******* Secretaría de Salud Municipal ******* ");
    	System.out.println(" ");
    	System.out.println("             *** Bienvenido ***");    	
    	System.out.println(" ");
    	System.out.println("Obtenga su Indice de Masa Corporal. Por favor, indique los siguientes datos:");
    	System.out.println(" ");
    	System.out.println("Indique su nombre completo:");
        nombre_usuario = String.nextLine(); 
        System.out.println("Indique su estatura en mts. Ejemplo: 1,75");
        estatura = input.nextDouble();
        System.out.println("Indique su peso en Kgs:");
        peso_usuario = input.nextInt();
        System.out.println(nombre_usuario+", usted pesa: "+peso_usuario+" Kgs y mide: "+estatura+" mts. Es correcta la información?");
        System.out.println("1. Si");
        System.out.println("2. No");
        return input.nextInt();
    }
    
    /*Bloque If y cálculo de IMC con mensaje al usuario*/

    public static void ingresaDatosPersonales(int opcion){
        switch (opcion){
            case 1:
                imc = peso_usuario/(estatura*estatura);
                System.out.println("Su Indice de Masa Corporal es de:"+imc);
                if (imc <= 18.5){
                    System.out.println("Esta en un apeso bajo.");
                }else if(imc >= 18.6 && imc <= 24.9){
                    System.out.println("Su peso es normal.");
                }else if(imc >= 25 && imc <= 29.9){
                    System.out.println("Tiene sobrepeso");
                }else if(imc >= 30){
                    System.out.println("Tiene obesidad");
                }
            break;
            case 2:
            	
                System.out.println(nombre_usuario+" Reinicie la app y luego indique sus datos nuevamente.");
            break;
            default:
                System.out.println("Reinicie la app e indique sus datos correctamente");
        }
    }
}