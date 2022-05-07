package drogueriaMiSalud;


	/*importar libreria*/

import java.util.Scanner;

public class DrogueriaMiSalud {
	
	/*DeclaraciÃ³n de variables*/

    public static String artic_devuelto, cant_grageas,cant_blister;
    public static int opcion,opcion2,opcion3;
    public static Scanner String = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);

    /*Métodos de la clase*/
    
    public static void main(String[] args) {
        opcion = menuPpal();
        opcionPpal (opcion);
    }

    public static int menuPpal(){

    	System.out.println(" ");
        System.out.println("******* Bienvenido a Droguería Mi Salud *******");
        System.out.println(" ");        
        System.out.println("Indique su opción:");
        System.out.println(" "); 
        System.out.println("1. Comprar producto");
        System.out.println("2. Devoluciones");
        return input.nextInt();

    }

    public static void opcionPpal(int opcion){
        switch (opcion){
            case 1:
            	System.out.println(" "); 
                System.out.println("Seleccione el producto que quiera comprar");
                System.out.println(" "); 
                System.out.println("1. Acetaminofén 500 mg");
                System.out.println("2. Ampicilina 500 mg");
                System.out.println("3. Dipirona 20 mg");
                System.out.println("Indique el número de su opción:");
                opcion2 = input.nextInt();
                switch (opcion2) {
                    case 1:
                        System.out.println("Precios y Características:");
                        System.out.println(" "); 
                        System.out.println(" * Acetaminofen 500 mg");
                        System.out.println(" * Presentación: grageas");
                        System.out.println("1. La gragea vale 500 centavos");
                        System.out.println("2. El blister vale  $ 3500");
                        System.out.println(" "); 
                        System.out.println("Por favor, indique su opción de compra: 1 o 2.");
                        opcion3 = input.nextInt();
                        switch (opcion3){
                            case 1:
                                System.out.println("Cuántas grageas desea comprar?");
                                cant_grageas = String.nextLine();
                                System.out.println("Puede retirar su compra en el área de entrega.");
                                break;
                            case 2:
                                System.out.println("Cuantos blisters quiere comprar?");
                                cant_blister = String.nextLine();
                                System.out.println("Puede retirar su compra en el área de entrega.");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Precios y Características:");
                        System.out.println(" "); 
                        System.out.println(" * Ampicilina 500 mg");
                        System.out.println(" * Presentación: cápsulas");
                        System.out.println("1. La cápsula vale 500 centavos");
                        System.out.println("2. El blister vale  $ 4500");
                        System.out.println(" "); 
                        System.out.println("Por favor, indique su opción de compra: 1 o 2.");
                        opcion3 = input.nextInt();
                        switch (opcion3){
                            case 1:
                                System.out.println("Cuántas cápsulas desea comprar?");
                                cant_grageas = String.nextLine();
                                System.out.println("Puede retirar su compra en el área de entrega.");
                                break;
                            case 2:
                                System.out.println("Cuantos blisters quiere comprar?");
                                cant_blister = String.nextLine();
                                System.out.println("Puede retirar su compra en el área de entrega.");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Precios y Características:");
                        System.out.println(" "); 
                        System.out.println(" * Dipirona 20 mg");
                        System.out.println(" * Presentación: grageas");
                        System.out.println("1. La gragea vale 900 centavos");
                        System.out.println("2. El blister vale  $ 8000");
                        System.out.println(" "); 
                        System.out.println("Por favor, indique su opción de compra: 1 o 2.");
                        opcion3 = input.nextInt();
                        switch (opcion3){
                            case 1:
                                System.out.println("Cuantas grageas quiere comprar?");
                                cant_grageas = String.nextLine();
                                System.out.println("Puede retirar su compra en el área de entrega.");
                                break;
                            case 2:
                                System.out.println("Cuantos blisters quieres comprar?");
                                cant_blister = String.nextLine();
                                System.out.println("Puede retirar su compra en el área de entrega.");
                                break;
                        }
                        break;
                }
                break;
            case 2:
                System.out.println("Indique el artículo que desea devolver:");
                artic_devuelto = String.next();
                System.out.println("Acerquese a la farmacia con el "+artic_devuelto);
                break;
        }
    }
}