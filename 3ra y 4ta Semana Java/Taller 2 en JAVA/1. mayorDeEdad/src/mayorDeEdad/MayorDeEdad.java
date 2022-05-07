package mayorDeEdad;

	/*importar libreria*/

import java.util.Scanner;

public class MayorDeEdad {

    public static int edad;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        edad = dato_edad();
        valida_edad(edad);
    }

    public static int dato_edad(){
        System.out.println("Indique su edad:");
        return input.nextInt();
    }

    public  static void valida_edad(int edad){
        if (edad >= 18){
            System.out.println("Usted es mayor de edad");
        }
    }
}