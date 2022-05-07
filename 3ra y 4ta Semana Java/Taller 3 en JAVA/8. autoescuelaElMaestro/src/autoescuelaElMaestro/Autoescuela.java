package autoescuelaElMaestro;

/*Importar librería*/

import java.util.Scanner;

public class Autoescuela {
	
	/*Declaración de variables*/

    public static String alumno1, alumno2,alumno3,alumno4,alumno5,alumno6,alumno7,alumno8;
    public static int opcion1,opcion2, nota1,nota2,nota3,nota4,nota5,nota6,nota7,nota8;
    public static Scanner lword = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
    	
    /*Inicialización de variables*/

    	alumno1 = "Alumno no registrado";
    	alumno2 = "Alumno no registrado";
    	alumno3 = "Alumno no registrado";
    	alumno4 = "Alumno no registrado";
    	alumno5 = "Alumno no registrado";
    	alumno6 = "Alumno no registrado";
    	alumno7 = "Alumno no registrado";
    	alumno8 = "Alumno no registrado";
        nota1 = 0;
        nota2 = 0;
        nota3 = 0;
        nota4 = 0;
        nota5 = 0;
        nota6 = 0;
        nota7 = 0;
        nota8 = 0;

        do {
            opcion1 = menuPpal();
            menuUsuario(opcion1);
        }while (opcion1 !=3);
    }

    public static int menuPpal(){
    	
    	/*Menú principal*/
    	
    	 System.out.println(" ");
         System.out.println("*********** Escuela Automovilística El Maestro ***********");
         System.out.println(" ");
         System.out.println("                ******* Bienvenido *******");
         System.out.println(" ");
         System.out.println(" ");
         System.out.println("                       Menú Principal ");
         System.out.println(" ");  
         System.out.println("                //// Indique su opción  ////");
         System.out.println(" ");
         System.out.println("1. Registrar nuevo alumno");
         System.out.println("2. Consulta de usuario y datos de la prueba");
         System.out.println("3. Salir");
         System.out.println(" ");

        return input.nextInt();
    }

    /*Métodos de clase*/
    
    public static void menuUsuario(int opcion){
    	
    /*Menú registro alumnos*/
    	
        switch (opcion){
            case 1:

                System.out.println(" ");
                System.out.println("Indique datos Estudiante 1");
                System.out.println("Nombre del estudiante:");
                alumno1 = lword.nextLine();
                System.out.println("Indique nota obtenida:");
                nota1 = input.nextInt();
                System.out.println(" ");

                System.out.println("Indique datos Estudiante 2");
                System.out.println("Nombre del estudiante:");
                alumno2 = lword.nextLine();
                System.out.println("Indique nota obtenida:");
                nota2 = input.nextInt();
                System.out.println(" ");

                System.out.println("Indique datos Estudiante 3");
                System.out.println("Nombre del estudiante:?");
                alumno3 = lword.nextLine();
                System.out.println("Indique nota obtenida:");
                nota3 = input.nextInt();
                System.out.println(" ");

                System.out.println("Indique datos Estudiante 4");
                System.out.println("Nombre del estudiante:");
                alumno4 = lword.nextLine();
                System.out.println("Indique nota obtenida:");
                nota4 = input.nextInt();
                System.out.println(" ");

                System.out.println("Indique datos Estudiante 5");
                System.out.println("Nombre del estudiante:?");
                alumno5 = lword.nextLine();
                System.out.println("Indique nota obtenida:");
                nota5 = input.nextInt();
                System.out.println(" ");

                System.out.println("Indique datos Estudiante 6");
                System.out.println("Nombre del estudiante:");
                alumno6 = lword.nextLine();
                System.out.println("Indique nota obtenida:");
                nota6 = input.nextInt();
                System.out.println(" ");

                System.out.println("Indique datos Estudiante 7");
                System.out.println("Nombre del estudiante:");
                alumno7 = lword.nextLine();
                System.out.println("Indique nota obtenida:");
                nota7 = input.nextInt();
                System.out.println(" ");

                System.out.println("Indique datos Estudiante 8");
                System.out.println("Nombre del estudiante:");
                alumno8 = lword.nextLine();
                System.out.println("Indique nota obtenida:");
                nota8 = input.nextInt();
                System.out.println(" ");

               break;
               
               /*Menú cnsulta de estudiantes*/
               
            case 2:

                System.out.println(" ");
                System.out.println("Consultar notas por estudiante");
                System.out.println("1. "+alumno1);
                System.out.println("2. "+alumno2);
                System.out.println("3. "+alumno3);
                System.out.println("4. "+alumno4);
                System.out.println("5. "+alumno5);
                System.out.println("6. "+alumno6);
                System.out.println("7. "+alumno7);
                System.out.println("8. "+alumno8);

                opcion2 = input.nextInt();

                switch (opcion2){
                    case 1:
                        if (alumno1.equals("")) {
                            System.out.println(" ");
                            System.out.println("Estudiante no registrado");
                            System.out.println(" ");
                        }else{
                            System.out.println(" ");
                            if (nota1 >= 3){
                                System.out.println("Estudiante Aprobado");
                            }else{
                                System.out.println("Estudiante Reprobado");
                            }
                        }
                        break;
                    case 2:
                        if (alumno2.equals("")) {
                            System.out.println(" ");
                            System.out.println("Estudiante no registrado");
                            System.out.println(" ");
                        }else{
                            System.out.println(" ");
                            if (nota2 >= 3){
                                System.out.println("Estudiante Aprobado");
                            }else{
                                System.out.println("Estudiante Reprobado");
                            }
                        }
                        break;
                    case 3:
                        if (alumno3.equals("")) {
                            System.out.println(" ");
                            System.out.println("Estudiante no registrado");
                            System.out.println(" ");
                        }else{
                            System.out.println(" ");
                            if (nota3 >= 3){
                                System.out.println("Estudiante Aprobado");
                            }else{
                                System.out.println("Estudiante Reprobado");
                            }
                        }
                        break;
                    case 4:
                        if (alumno4.equals("")) {
                            System.out.println(" ");
                            System.out.println("Estudiante no registrado");
                            System.out.println(" ");
                        }else{
                            System.out.println(" ");
                            if (nota4 >= 3){
                                System.out.println("Estudiante Aprobado");
                            }else{
                                System.out.println("Estudiante Reprobado");
                            }
                        }
                        break;
                    case 5:
                        if (alumno5.equals("")) {
                            System.out.println(" ");
                            System.out.println("Estudiante no registrado");
                            System.out.println(" ");
                        }else{
                            System.out.println(" ");
                            if (nota5 >= 3){
                                System.out.println("Estudiante Aprobado");
                            }else{
                                System.out.println("Estudiante Reprobado");
                            }
                        }
                        break;
                    case 6:
                        if (alumno6.equals("")) {
                            System.out.println(" ");
                            System.out.println("Estudiante no registrado");
                            System.out.println(" ");
                        }else{
                            System.out.println(" ");
                            if (nota6 >= 3){
                                System.out.println("Estudiante Aprobado");
                            }else{
                                System.out.println("Estudiante Reprobado");
                            }
                        }
                        break;
                    case 7:
                        if (alumno7.equals("")) {
                            System.out.println(" ");
                            System.out.println("Estudiante no registrado");
                            System.out.println(" ");
                        }else{
                            System.out.println(" ");
                            if (nota7 >= 3){
                                System.out.println("Estudiante Aprobado");
                            }else{
                                System.out.println("Estudiante Reprobado");
                            }
                        }
                    case 8:
                        if (alumno8.equals("")) {
                            System.out.println(" ");
                            System.out.println("Estudiante no registrado");
                            System.out.println(" ");
                        }else{
                            System.out.println(" ");
                            if (nota8 >= 3){
                                System.out.println("Estudiante Aprobado");
                            }else{
                                System.out.println("Estudiante Reprobado");
                            }
                        }
                        break;
                }
                break;
            case 3:
                System.out.println("            ******* Gracias por preferirnos *******");
                System.out.println("                      *** Hasta luego ***");
                break;
            default:
                System.out.println("Coloque una opcion entre la 1 y 3");
        }
    }
}