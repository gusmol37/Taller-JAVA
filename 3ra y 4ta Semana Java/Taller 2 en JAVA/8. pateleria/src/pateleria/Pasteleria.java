package pateleria;

import java.util.Scanner;

public class Pasteleria {
	
    public static String sabor,decoracion,cant_torta,porciones;
    public static int opcion1,opcion2,valor_torta;
    private static Scanner String = new Scanner(System.in);
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

    	opcion1 = opcionMenuPrincipal();
        menuPpal(opcion1);
    }
    
    public static int opcionMenuPrincipal(){   
    	
    	System.out.println(" ");    	
        System.out.println("*********** Pasteler�a Don Carlos ***********");
        System.out.println(" ");  
        System.out.println("         ******* Bienvenidos *******"); 
        System.out.println(" "); 
        System.out.println("Indique su opci�n:");
        System.out.println(" ");
        System.out.println("1. Registrar una venta");
        System.out.println("2. Tortas disponibles para venta");
        System.out.println("3. Total Ventas del dia");
        return input.nextInt();
    }

    public static void menuPpal(int opcion1) {
    	
        switch (opcion1) {
        
            case 1:
                System.out.println("Registrar una venta");
                System.out.println("Indique el sabor de la torta:");
                sabor = String.nextLine();
                System.out.println("Indique de cu�ntas porciones es la torta:");
                porciones = String.nextLine();
                System.out.println("Indique decoraci�n solicitada:");
                decoracion = String.nextLine();
                System.out.println("El cliente solicita una torta de: " + sabor + " de " + porciones + " porciones y con la siguiente decoracion: " + decoracion + ".1 Indique si es correcta la informaci�n:");
                System.out.println("1. Si");
                System.out.println("2. No");
                opcion2 = input.nextInt();
                switch (opcion2) {
                    case 1:
                        System.out.println("Se ha registrado correctamente el pedido.");
                        break;
                    case 2:
                        System.out.println("Vuelva al inicio y verifique los datos");
                        break;
                }
                break;
            case 2:
                System.out.println("Torta de Marqueza con sabor: Chocolate. Decoraci�n: blanco y/o amarillo. 30 porciones. Valor: $ 35000. Decoraci�n adicional: $ 2000");
                System.out.println("Torta de Maracuy� con sabor: Maracuy�. Decoraci�n: marr�n y/o rojo. 12 porciones. Valor: $ 12000. Decoraci�n adicional: $ 2000");
                System.out.println("Torta de Lulo con sabor: Lulo. Decoraci�n: verde y/o rojo. 20 porciones. Valor: $ 22000. Decoraci�n adicional: $ 2000");
                break;
            case 3:
                System.out.println("Ingrese tortas entregadas:");
                cant_torta = String.nextLine();
                System.out.println("Monto pagado del pedido:");
                valor_torta = input.nextInt();
                System.out.println("Se ingresa al control diario de ventas: " + cant_torta + " torta(s), que fue(ron) cobrada(s) por la cantidad de: $ " + valor_torta);
                default:
                System.out.println("Indique la opci�n correcta entre del 1 al 3");
        }
    }
}
