package appAreaGeometria;

/*Importar libreria*/

import java.util.Scanner;

public class AppAreaGeometria {
	
	/*Declaracion de variables*/

    public static double base,altura,area_rectangulo,area_triangulo,area_trapecio,base_mayor,base_menor ;
    public static int opcion;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        opcion = menuPpal();
        menuCalculos(opcion);

    }
    
/*Métodos de la clase*/

    private static int menuPpal(){
    	System.out.println (" ");
    	System.out.println ("    ***********  Cálculo del área de figuras geométricas ***********");
    	System.out.println (" ");
    	System.out.println ("                  ***********  Bienvenido  ***********");
    	System.out.println (" ");
    	System.out.println (" ¿Sobre qué figura va a hacer el cálculo? Indique su opción.");
    	System.out.println (" ");
        System.out.println("1. Rectángulo");
        System.out.println("2. Triángulo");
        System.out.println("3. Trapecio");
        return input.nextInt();
    }
    
    
   /*Ingreso de datos. Cálculo de área. Mensaje con resultado*/

    private static void menuCalculos(int opcion){
        switch (opcion){
            case 1:
            	System.out.println ("Indique los siguientes datos para calcular el área de un rectángulo:");
                System.out.println("Indique la altura del rectángulo (cm)");
                altura = input.nextDouble();
                System.out.println("Indique la base del rectángulo (cm)");
                base = input.nextDouble();
                area_rectangulo = base*altura;
                System.out.println("   /////// Área del rectángulo = "+area_rectangulo+" cm2 ///////");
                break;
            case 2:
            	System.out.println ("Indique los siguientes datos para calcular el área de un triángulo:");
                System.out.println("Indique la altura del triángulo (cm)");
                altura = input.nextDouble();
                System.out.println("Indique la base del triángulo (cm)");
                base = input.nextDouble();
                area_triangulo = base*altura/2;
                System.out.println("   /////// Área del triángulo = "+area_triangulo+" cm2 ///////");
                break;
            case 3:
                System.out.println("Indique los siguientes datos para calcular el área de un trapecio:");
                System.out.println("Indique la base superior del trapecio (cm)");
                base_mayor = input.nextDouble();
                System.out.println("Indique la base inferior del trapecio (cm)");
                base_menor = input.nextDouble();
                System.out.println("Indique la altura del trapecio (cm)");
                altura = input.nextDouble();
                area_trapecio = (base_mayor+base_menor)*altura/2;
                System.out.println("     /////// Área del Trapecio = "+area_trapecio+ " cm2 ///////");
                break;
            default:
                System.out.println("Introduzca la opcion correcta entre el 1 y el 3");
        }
    }
}