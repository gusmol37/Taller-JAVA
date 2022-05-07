package tallerMotos;

/*importar libreria*/

import java.util.Scanner;

public class TallerMotos {
	
	/*DeclaraciÃ³n de variables*/

    public static String tipo_moto, observacionesMoto, modelo_moto, trabajos_moto, repuestos;
    public static int opcion, opcion2,opcion3;
    public static Scanner String = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);
    
    /*Métodos de la clase*/

    public static void main(String[] args){

        opcion = menuPpal();
        opcMenuPpal(opcion);

    }
    
    /*Menú Principal*/

    public static int menuPpal(){
    	
    	System.out.println(" ");
        System.out.println("               *********** Taller de Motos El Maquinista ***********");
        System.out.println(" ");
        System.out.println("                            ******* Bienvenido *******");
        System.out.println(" ");
        System.out.println("1. Ingresar moto al sistema") ;
        System.out.println("2. Retirar moto del sistema") ;
        return input.nextInt();

    }

    public static void opcMenuPpal(int opcion){
    	
    	/*Ingreso de datos*/

        switch (opcion){
        
            case 1:
                System.out.println("Indique tipo demoto.");
                tipo_moto = String.nextLine();
                System.out.println("Observaciones iniciales por parte del cliente.");
                observacionesMoto = String.nextLine();
                System.out.println("Se ingresa una moto tipo: "+ tipo_moto+", indicando por parte del cliente las siguientes observaciones: "+observacionesMoto+". Por favor, confirme.");
                System.out.println("1.Sí");
                System.out.println("2.No");
                opcion2 = input.nextInt();
                switch (opcion2){
                
                    case 1:
                        System.out.println("Se ha registrado correctamente la moto.");
                        break;
                    case 2:
                        System.out.println("Reinicio de la app.");
                        break;
                    default:
                        System.out.println("Indique su opción. 1 o 2.");
                }
                break;
            case 2:
                System.out.println("Ingrese el modelo de la moto.");
                modelo_moto = String.nextLine();
                System.out.println("Quiere ingresar los trabajos realizados en la moto?");
                System.out.println("1.Sí");
                System.out.println("2.No");
                opcion3 = input.nextInt();
                
                switch (opcion3){
                
                    case 1:
                        System.out.println("Indique los trabajos realizados a la moto.");
                        trabajos_moto = String.nextLine();
                        System.out.println("Indique los repuestos y piezas reemplazadas en los trabajos.");
                        repuestos = String.nextLine();
                        System.out.println("En la moto, modelo: "+modelo_moto+", se realizaron los siguientes arreglos y trabajos de mantenimiento: "+trabajos_moto+". Se cambiaron los siguientes repuestos: " +repuestos+ ".");
                        break;
                    case 2:
                        System.out.println("No se específican los arreglos hechos a la moto.");
                    break;
                    default:
                    System.out.println("Coloque la opcion entre la 1 y 2");
            }
            break;
            
            default:
                System.out.println("Coloque la opcion entre la 1 y 2");
        }
    }
}