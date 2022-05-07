package alquilerPeliculas;

import java.util.Scanner;

public class AlquilerPeliculas {

    public static String peli_seleccion;
    public static String direccion;
    public static String nombre_peli;
    public static String obsev_peli;
    public static int opcion,opcion2,opcion3,opcion4;
    public static Scanner String = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        opcion = opcionMenuPrincipal();
        menu_ppal(opcion);
    }

    public static int opcionMenuPrincipal(){
    	System.out.println(" ");
        System.out.println("******* Club de Alquiler de Películas Suba *******");
        System.out.println(" ");
        System.out.println("            ******* Bienvenido *******");
        System.out.println(" ");
        System.out.println(" ///  Elija su opción:  ///");
        System.out.println(" ");
        System.out.println("1. Consultar Películas Disponibles");
        System.out.println("2. Alquile su Película");
        System.out.println("3. Recibir Película");
        System.out.println("4. Devolder Película");
        return input.nextInt();
    }

    public static void menu_ppal(int opcion){
        
    	switch (opcion){

            case 1:
                System.out.println("1. Matrix Resurrección");
                System.out.println("2. Sonic 2");
                System.out.println("3. Operation Overlord");
                
                switch (opcion2){
                case 1:
                    System.out.println("Indique el nombre de su película para generar el pedido");
                    peli_seleccion = String.nextLine();
                    System.out.println("Ha seleccionado: "+peli_seleccion);
                    break;
                case 2:
                    System.out.println("Ingrese la direccion para el envio");
                    direccion = String.nextLine();
                    System.out.println("El pedido sera enviado a esta direccion "+direccion);
                    break;
                }
          
                
                    
              case 2:
                    System.out.println("Confirme su selección:");
                    System.out.println("1. Matrix Resurrección");
                    System.out.println("2. Sonic 2");
                    System.out.println("3. Operation Overlord");
                    System.out.println("Coloque el número de la película");
                    opcion2 = input.nextInt();
                    System.out.println("Indique forma de entrega:");
                    System.out.println("1. En la tienda.");
                    System.out.println("2. Enviar a una direccion");
                    opcion3 = input.nextInt();
                    switch (opcion3){
                        case 1:
                            System.out.println("Ingrese un nombre para retirar el pedido");
                            nombre_peli = String.nextLine();
                            System.out.println("Su solicitud puede ser retirada a nombre de "+nombre_peli);
                            break;
                        case 2:
                            System.out.println("Ingrese la direccion para el envio");
                            direccion = String.nextLine();
                            System.out.println("El pedido sera enviado a la direccion: "+direccion);
                            break;
                            
                           
            case 3:
                System.out.println("Indique su selección:");
                System.out.println("1. Matrix Resurrección");
                System.out.println("2. Sonic 2");
                System.out.println("3. Operation Overlord");
                System.out.println("Indique su número de opción:");
                opcion3= input.nextInt();
                System.out.println("Como quieres que sea el retiro");
                System.out.println("1. Retirar en el local");
                System.out.println("2. Enviar a una direccion");
                opcion3 = input.nextInt();
                
                switch (opcion){
                    case 1:
                        System.out.println("Ingrese un nombre para retirar el pedido");
                        peli_seleccion = String.nextLine();
                        System.out.println("Su pedido esta listo para retirar bajo el nombre de "+peli_seleccion);
                        break;
                    case 2:
                        System.out.println("Ingrese la direccion para el envio");
                        direccion = String.nextLine();
                        System.out.println("El pedido sera enviado a esta direccion "+direccion);
                        break;
                }
                break;
            case 4:
                System.out.println("Ingrese el nombre de la pelicula que desea devolver");
                nombre_peli = String.nextLine();
                System.out.println("La pelicula "+nombre_peli+" Tuvo algun daño o novedad");
                System.out.println("1. Informar sobre daño o novedad");
                System.out.println("2. No hay nada que informar");
                opcion4 = input.nextInt();
                switch (opcion4){
                    case 1:
                        System.out.println("Cual es el daño o novedad presentada?");
                        obsev_peli = String.nextLine();
                        System.out.println("Muchas gracias por la informacion brindada, tendremos mas cuidado la proxima vez");
                        break;
                    case 2:
                        System.out.println("Esperamos que hayas disfrutado la pelicula");
                        break;
                }
                break;
        }
    }
}
    
}