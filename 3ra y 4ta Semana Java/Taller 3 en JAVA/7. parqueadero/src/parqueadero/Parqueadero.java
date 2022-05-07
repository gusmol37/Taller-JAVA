package parqueadero;

/*Importar librería*/

import java.util.Scanner;

public class Parqueadero {
	
/*Declaración de variables*/

    public static String nombDueno1, nombDueno2, nombDueno3, nombDueno4, nombDueno5, telefDueno1, telefDueno2, telefDueno3, telefDueno4, telefDueno5, placas1, placas2,placas3, placas4, placas5, marcaVehic1, marcaVehic2, marcaVehic3, marcaVehic4, marcaVehic5;
    public static int opcion1,opcion2,opcion3,opcion4,opcion5;
    public static Scanner lword = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);
    
/*Metodos de la clase*/

    public static void main(String[] args){

    	nombDueno1 = "";
    	telefDueno1 = "";
    	placas1 = "";
    	marcaVehic1 = "";
        nombDueno2 = "";
        telefDueno2 = "";
        placas2 = "";
        marcaVehic2 = "";
        nombDueno3 = "";
        telefDueno3 = "";
        placas3 = "";
        marcaVehic3 = "";
        nombDueno4 = "";
        telefDueno4 = "";
        placas4 = "";
        marcaVehic4 = "";
        nombDueno5 = "";
        telefDueno5 = "";
        placas5 = "";
        marcaVehic5 = "";

        do {
            opcion1 = manuPpal();
            opcionesUsuario(opcion1);
        }while (opcion1 !=4);
    }

    public static int manuPpal(){
    	
/*Menú Principal*/

        System.out.println(" ");
        System.out.println("*********** Parqueadero El Guardian ***********");
        System.out.println(" ");
        System.out.println("          ******* Bienvenido *******");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("        Menú Principal ");
        System.out.println(" ");
        System.out.println("1. Registro de ingreso vehículo");
        System.out.println("2. Salida de vehículo");
        System.out.println("3. Consulta ingreso de vehículo");
        System.out.println("4. Salir");
        System.out.println(" ");

        return input.nextInt();
    }

    public static void opcionesUsuario(int opcion1){
        switch (opcion1){
            case 1:
                System.out.println(" ");
                System.out.println("Indique el número de puesto.");
                System.out.println(" ");
                System.out.println("1. Puesto 1");
                System.out.println("2. Puesto 2");
                System.out.println("3. Puesto 3");
                System.out.println("4. Puesto 4");
                System.out.println("5. Puesto 5");
                System.out.println(" ");
                opcion2 = input.nextInt();
                switch (opcion2){
                    case 1:
                        if (nombDueno1.equals("") || telefDueno1.equals("") || placas1.equals("") || marcaVehic1.equals("")){
                            System.out.println(" ");
                            System.out.println("Puesto libre");
                            System.out.println(" ");
                            System.out.println("Nombre del dueño:");
                            nombDueno1 = lword.nextLine();
                            System.out.println("Número de contacto:");
                            telefDueno1 = lword.nextLine();
                            System.out.println("Número de Placas:");
                            placas1 = lword.nextLine();
                            System.out.println("Marca del vehículo:");
                            marcaVehic1 = lword.nextLine();
                            System.out.println(" ");
                            System.out.println("Ingreso realizado exitosamente.");
                            System.out.println(" ");
                        }else {
                            System.out.println("Puesto ocupado");
                        }
                        break;
                    case 2:
                        if (nombDueno2.equals("") || telefDueno2.equals("") || placas2.equals("") || marcaVehic2.equals("")){
                            System.out.println(" ");
                            System.out.println("Puesto libre");
                            System.out.println(" ");
                            System.out.println("Nombre del dueño:");
                            nombDueno2 = lword.nextLine();
                            System.out.println("Número de contacto:");
                            telefDueno2 = lword.nextLine();
                            System.out.println("Número de Placas:");
                            placas2 = lword.nextLine();
                            System.out.println("Marca del vehículo:");
                            marcaVehic2 = lword.nextLine();
                            System.out.println(" ");
                            System.out.println("Ingreso realizado exitosamente.");
                            System.out.println(" ");
                        }else {
                            System.out.println("Puesto ocupado");
                        }
                        break;
                    case 3:
                        if (nombDueno3.equals("") || telefDueno3.equals("") || placas3.equals("") || marcaVehic3.equals("")){
                            System.out.println(" ");
                            System.out.println("Puesto libre");
                            System.out.println(" ");
                            System.out.println("Nombre del dueño:");
                            nombDueno3 = lword.nextLine();
                            System.out.println("Número de contacto:");
                            telefDueno3 = lword.nextLine();
                            System.out.println("Número de Placas:");
                            placas3 = lword.nextLine();
                            System.out.println("Marca del vehículo:");
                            marcaVehic3 = lword.nextLine();
                            System.out.println(" ");
                            System.out.println("Ingreso realizado exitosamente.");
                            System.out.println(" ");
                        }else {
                            System.out.println("Puesto ocupado");
                        }
                        break;
                    case 4:
                        if (nombDueno4.equals("") || telefDueno4.equals("") || placas4.equals("") || marcaVehic4.equals("")){
                            System.out.println(" ");
                            System.out.println("Puesto libre");
                            System.out.println(" ");
                            System.out.println("Nombre del dueño:");
                            nombDueno4 = lword.nextLine();
                            System.out.println("Número de contacto:");
                            telefDueno4 = lword.nextLine();
                            System.out.println("Número de Placas:");
                            placas4 = lword.nextLine();
                            System.out.println("Marca del vehículo:");
                            marcaVehic4 = lword.nextLine();
                            System.out.println(" ");
                            System.out.println("Ingreso realizado exitosamente.");
                            System.out.println(" ");
                        }else {
                        	System.out.println("Puesto ocupado");
                        }
                        break;
                    case 5:
                        if (nombDueno5.equals("") || telefDueno5.equals("") || placas5.equals("") || marcaVehic5.equals("")){
                            System.out.println(" ");
                            System.out.println("Puesto libre");;
                            System.out.println(" ");
                            System.out.println("Nombre del dueño:");
                            nombDueno5 = lword.nextLine();
                            System.out.println("Número de contacto:");
                            telefDueno5 = lword.nextLine();
                            System.out.println("Número de Placas:");
                            placas5 = lword.nextLine();
                            System.out.println("Marca del vehículo:");
                            marcaVehic5 = lword.nextLine();
                            System.out.println(" ");
                            System.out.println("Ingreso realizado exitosamente.");
                            System.out.println(" ");
                        }else {
                        	System.out.println("Puesto ocupado");
                        }
                        break;
                }
                break;
            case 2:
                System.out.println(" ");
                System.out.println("Para retirar su vehículo indique una opción:");
                System.out.println(" ");
                System.out.println("1. Puesto 1");
                System.out.println("2. Puesto 2");
                System.out.println("3. Puesto 3");
                System.out.println("4. Puesto 4");
                System.out.println("5. Puesto 5");
                System.out.println(" ");
                opcion3 = input.nextInt();
                switch (opcion3){
                    case 1:
                        if (nombDueno1.equals("") || telefDueno1.equals("") || placas1.equals("") || marcaVehic1.equals("")){
                            System.out.println("No hay vehículo registrado cone sos datos.");
                        }else {
                            System.out.println("El vehículo con los siguientes datos, está registrado en nuestro sistema:");
                            System.out.println(marcaVehic1+" "+placas1+" y su dueño es "+nombDueno1+" "+telefDueno1);
                            System.out.println(" ");
                            System.out.println("¿Quiere retirar su vehículo?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            System.out.println(" ");
                            opcion4 = input.nextInt();
                            switch (opcion4){
                                case 1:
                                	nombDueno1 = "";
                                	telefDueno1 = "";
                                	placas1 = "";
                                	marcaVehic1 = "";
                                    System.out.println("Por favor, diríjase a la taquilla de pago con su ticket.");
                                    System.out.println(" ");
                            }
                        }
                        break;
                    case 2:
                        if (nombDueno2.equals("") || telefDueno2.equals("") || placas2.equals("") || marcaVehic2.equals("")){
                        	System.out.println("No hay vehículo registrado con esos datos.");
                        }else {
                        	System.out.println("El vehículo con los siguientes datos, está registrado en nuestro sistema:");
                            System.out.println(marcaVehic2+" "+placas2+" y su dueño es "+nombDueno2+" "+telefDueno2);
                            System.out.println(" ");
                            System.out.println("¿Quiere retirar su vehículo?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            System.out.println(" ");
                            opcion4 = input.nextInt();
                            switch (opcion4){
                                case 1:
                                	nombDueno2 = "";
                                	telefDueno2 = "";
                                	placas2 = "";
                                	marcaVehic2 = "";
                                	System.out.println("Por favor, diríjase a la taquilla de pago con su ticket.");
                                    System.out.println(" ");
                            }
                        }
                        break;
                    case 3:
                        if (nombDueno3.equals("") || telefDueno3.equals("") || placas3.equals("") || marcaVehic3.equals("")){
                        	System.out.println("No hay vehículo registrado con esos datos.");
                        }else {
                        	System.out.println("El vehículo con los siguientes datos, está registrado en nuestro sistema:");
                            System.out.println(marcaVehic3+" "+placas3+" y su dueño es "+nombDueno3+" "+telefDueno3);
                            System.out.println(" ");
                            System.out.println("¿Quiere retirar su vehículo?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            System.out.println(" ");
                            opcion4 = input.nextInt();
                            switch (opcion4){
                                case 1:
                                	nombDueno3 = "";
                                	telefDueno3 = "";
                                	placas3 = "";
                                	marcaVehic3 = "";
                                	System.out.println("Por favor, diríjase a la taquilla de pago con su ticket.");
                                    System.out.println(" ");
                            }
                        }
                        break;
                    case 4:
                        if (nombDueno4.equals("") || telefDueno4.equals("") || placas4.equals("") || marcaVehic4.equals("")){
                        	System.out.println("No hay vehículo registrado con esos datos.");
                        }else {
                        	System.out.println("El vehículo con los siguientes datos, está registrado en nuestro sistema:");
                            System.out.println(marcaVehic4+" "+placas4+" y su dueño es "+nombDueno4+" "+telefDueno4);
                            System.out.println(" ");
                            System.out.println("¿Quiere retirar su vehículo?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            System.out.println(" ");
                            opcion4 = input.nextInt();
                            switch (opcion4){
                                case 1:
                                	nombDueno4 = "";
                                	telefDueno4 = "";
                                	placas4 = "";
                                	marcaVehic4 = "";
                                	System.out.println("Por favor, diríjase a la taquilla de pago con su ticket.");
                                    System.out.println(" ");
                            }
                        }
                        break;
                    case 5:
                        if (nombDueno5.equals("") || telefDueno5.equals("") || placas5.equals("") || marcaVehic5.equals("")){
                            System.out.println("No hay vehículo registrado con esos datos.");
                        }else {
                        	System.out.println("El vehículo con los siguientes datos, está registrado en nuestro sistema:");
                            System.out.println(marcaVehic5+" "+placas5+" y su dueño es "+nombDueno5+" "+telefDueno5);
                            System.out.println(" ");
                            System.out.println("¿Quiere retirar su vehículo?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            System.out.println(" ");
                            opcion4 = input.nextInt();
                            switch (opcion4){
                                case 1:
                                	nombDueno5 = "";
                                	telefDueno5 = "";
                                	placas5 = "";
                                	marcaVehic5 = "";
                                	System.out.println("Por favor, diríjase a la taquilla de pago con su ticket.");
                                    System.out.println(" ");
                            }
                        }
                        break;
                    }
                break;
            case 3:
                System.out.println("Indique el número puesto. ");
                System.out.println(" ");
                System.out.println("1. Puesto 1");
                System.out.println("2. Puesto 2");
                System.out.println("3. Puesto 3");
                System.out.println("4. Puesto 4");
                System.out.println("5. Puesto 5");
                System.out.println(" ");
                opcion5 = input.nextInt();
                switch (opcion5){
                    case 1:
                        if(marcaVehic1 != "" || placas1 != ""){
                            System.out.println(" ");
                            System.out.println("El vehículo con los siguientes datos se encuentra en nuestro sistema:");
                            System.out.println(marcaVehic1+" y su placa es "+placas1);
                        }else {
                            System.out.println(" ");
                            System.out.println("Puesto vacio");
                        }
                        break;
                case 2:
                        if(marcaVehic2 != "" || placas2 != ""){
                            System.out.println(" ");
                            System.out.println("El vehículo con los siguientes datos se encuentra en nuestro sistema:");
                            System.out.println(marcaVehic2+" y su placa es "+placas2);
                        }else {
                            System.out.println(" ");
                            System.out.println("Puesto vacio");
                        }
                        break;
                    case 3:
                        if(marcaVehic3 != "" || placas3 != ""){
                            System.out.println(" ");
                            System.out.println("El vehículo con los siguientes datos se encuentra en nuestro sistema:");
                            System.out.println(marcaVehic3+" y su placa es "+placas3);
                        }else {
                            System.out.println(" ");
                            System.out.println("Puesto vacio");
                        }
                        break;
                    case 4:
                        if(marcaVehic4 != "" || placas4 != ""){
                            System.out.println(" ");
                            System.out.println("El vehículo con los siguientes datos se encuentra en nuestro sistema:");
                            System.out.println(marcaVehic4+" y su placa es "+placas4);
                        }else {
                            System.out.println(" ");
                            System.out.println("Puesto vacio");
                        }
                        break;
                    case 5:
                        if(marcaVehic5 != "" || placas5 != ""){
                            System.out.println(" ");
                            System.out.println("El vehículo con los siguientes datos se encuentra en nuestro sustema:");
                            System.out.println(marcaVehic5+" y su placa es "+placas5);
                        }else {
                            System.out.println(" ");
                            System.out.println("Puesto vacio");
                        }
                        break;
                }
                break;
            case 4:
             
            
            	System.out.println(" ");
                System.out.println("         ¡Gracias por preferirnos!");
                System.out.println("               ¡Hasta luego!");
                System.out.println(" ");
                
                break;
            default:
        }
    }
}