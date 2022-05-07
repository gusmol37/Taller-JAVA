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
    
/*M�todos de la clase*/

    private static int menuPpal(){
    	System.out.println (" ");
    	System.out.println ("    ***********  C�lculo del �rea de figuras geom�tricas ***********");
    	System.out.println (" ");
    	System.out.println ("                  ***********  Bienvenido  ***********");
    	System.out.println (" ");
    	System.out.println (" �Sobre qu� figura va a hacer el c�lculo? Indique su opci�n.");
    	System.out.println (" ");
        System.out.println("1. Rect�ngulo");
        System.out.println("2. Tri�ngulo");
        System.out.println("3. Trapecio");
        return input.nextInt();
    }
    
    
   /*Ingreso de datos. C�lculo de �rea. Mensaje con resultado*/

    private static void menuCalculos(int opcion){
        switch (opcion){
            case 1:
            	System.out.println ("Indique los siguientes datos para calcular el �rea de un rect�ngulo:");
                System.out.println("Indique la altura del rect�ngulo (cm)");
                altura = input.nextDouble();
                System.out.println("Indique la base del rect�ngulo (cm)");
                base = input.nextDouble();
                area_rectangulo = base*altura;
                System.out.println("   /////// �rea del rect�ngulo = "+area_rectangulo+" cm2 ///////");
                break;
            case 2:
            	System.out.println ("Indique los siguientes datos para calcular el �rea de un tri�ngulo:");
                System.out.println("Indique la altura del tri�ngulo (cm)");
                altura = input.nextDouble();
                System.out.println("Indique la base del tri�ngulo (cm)");
                base = input.nextDouble();
                area_triangulo = base*altura/2;
                System.out.println("   /////// �rea del tri�ngulo = "+area_triangulo+" cm2 ///////");
                break;
            case 3:
                System.out.println("Indique los siguientes datos para calcular el �rea de un trapecio:");
                System.out.println("Indique la base superior del trapecio (cm)");
                base_mayor = input.nextDouble();
                System.out.println("Indique la base inferior del trapecio (cm)");
                base_menor = input.nextDouble();
                System.out.println("Indique la altura del trapecio (cm)");
                altura = input.nextDouble();
                area_trapecio = (base_mayor+base_menor)*altura/2;
                System.out.println("     /////// �rea del Trapecio = "+area_trapecio+ " cm2 ///////");
                break;
            default:
                System.out.println("Introduzca la opcion correcta entre el 1 y el 3");
        }
    }
}