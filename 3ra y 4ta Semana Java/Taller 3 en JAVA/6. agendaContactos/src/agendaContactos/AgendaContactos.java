package agendaContactos;

/*Importar librería*/

import java.util.Scanner;

public class AgendaContactos {
	
/*Declaración de variables*/

    public static String nombContacto1,nombContacto2,nombContacto3, empresa1,empresa2,empresa3,numTelefono1,numTelefono2,numTelefono3;
    public static int menu1,menu2;
    public static Scanner lword = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);
    
/*Metodos de la Clase*/

    public static void main(String[] args){

        nombContacto1 =" ";
        nombContacto2 =" ";
        nombContacto3 =" ";
        empresa1 =" ";
        empresa2 =" ";
        empresa3 =" ";
        numTelefono1 = " ";
        numTelefono2 = " ";
        numTelefono3 = " ";

        do {
        	menu1 = capturaOpcionMenu();
            evaluarOpcionUsuario(menu1);
        }while (menu1 !=4);
    }

    
/*Menú principal y bienvenida*/
    
    public static int capturaOpcionMenu(){
    	
    	System.out.println(" ");
    	System.out.println("           ********** Agenda de Contactos ***********");
    	System.out.println(" ");
    	System.out.println("                     *** Bienvenido *** ");
    	System.out.println(" ");
        System.out.println("          ////////////// Menú Principal //////////////");
        System.out.println(" ");
        System.out.println("1. Indique 3 contactos");
        System.out.println("2. Busqueda de contacto");
        System.out.println("3. Borrar contacto");
        System.out.println("4. Salir");

        return input.nextInt();
    }

    /*Menú registro de usuario*/
    
    public static void evaluarOpcionUsuario(int menu1){

        switch (menu1){
            case 1:
                System.out.println(" ");
                System.out.println("Indique los siguientes datos del 1er. contacto:");
                System.out.println(" ");
                System.out.println("Nombre 1er contacto:");
                nombContacto1 = lword.nextLine();
                System.out.println("Número de teléfono 1er. contacto:");
                numTelefono1 = lword.nextLine();
                System.out.println("Empresa donde labora:");
                empresa1 = lword.nextLine();
                System.out.println(" ");
                System.out.println("Contacto 1 Registrado");
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("Nombre 2do contacto:");
                nombContacto2 = lword.nextLine();
                System.out.println("Número de teléfono 2do. contacto:");
                numTelefono2 = lword.nextLine();
                System.out.println("Empresa donde labora:");
                empresa2 = lword.nextLine();
                System.out.println(" ");
                System.out.println("Contacto 2 Registrado");
                System.out.println(" ");

                System.out.println("Ingrese los datos del 3er contacto");
                System.out.println(" ");
                System.out.println("Nombre 3er contacto:");
                nombContacto3 = lword.nextLine();
                System.out.println("Número de teléfono 3er. contacto:");
                numTelefono3 = lword.nextLine();
                System.out.println("Empresa donde labora:");
                empresa3 = lword.nextLine();
                System.out.println(" ");
                System.out.println("Contacto 3 Registrado");
                System.out.println(" ");
                System.out.println("Contactos registrados correctamente.");
                break;
            case 2:
                System.out.println(" ");
                if (nombContacto1 != " " || numTelefono1 != " " || empresa1 != " "){
                    System.out.println("Contacto 1: "+nombContacto1+" Telefono:"+numTelefono1+" Empresa: "+empresa1);
                }else{
                    System.out.println("Contacto 1 no registrado");
                }
                System.out.println(" ");
                if (nombContacto2 != " " || numTelefono2 != " " || empresa2 != " "){
                    System.out.println("Contacto 2: "+nombContacto2+" Telefono:"+numTelefono2+" Empresa: "+empresa2);
                }else{
                    System.out.println("Contacto 2 no registrado");
                }
                System.out.println(" ");
                if (nombContacto3 != " " || numTelefono3 != " " || empresa3 != " "){
                    System.out.println("Contacto 3: "+nombContacto3+" Telefono:"+numTelefono3+" Empresa: "+empresa3);
                }else{
                    System.out.println("Contacto 3 no registrado");
                }
                System.out.println(" ");
                break;
            case 3:
                System.out.println(" ");
                System.out.println("Indique el contacto que desea eliminar.");
                System.out.println(" ");
                System.out.println("1. Contacto 1");
                System.out.println("2. Contacto 2");
                System.out.println("3. Contacto 3");
                System.out.println(" ");
                menu2 = input.nextInt();
                System.out.println(" ");
                
/*Menú eliminación de usuario*/
                
                switch (menu2){
                    case 1:
                    	nombContacto1 = "";
                    	empresa1 = "";
                        numTelefono1 = "";
                        System.out.println("Contacto 1 Eliminado");
                        System.out.println(" ");
                        break;
                    case 2:
                    	nombContacto2 = "";
                    	empresa2 = "";
                        numTelefono2 = "";
                        System.out.println("Contacto 2 Eliminado");
                        System.out.println(" ");
                        break;
                    case 3:
                    	nombContacto3 = "";
                    	empresa3 = "";
                        numTelefono3 = "";
                        System.out.println("Contacto 3 Eliminado");
                        System.out.println(" ");
                      
                        break;
                }
                break;
            case 4:
            	System.out.println(" ");
                System.out.println("         ¡Gracias por preferirnos!");
                System.out.println("               ¡Hasta luego!");
                System.out.println(" ");
                break;
        }
    }
}