package bancoFiel;

import java.util.Scanner;

public class BancoFiel {

    public static String titularCuenta;
    public static int opcion, opcion2, opcion3, dinero, retiro, deposito, identificacion;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        dinero = 350000;
        titularCuenta = " Carlos Pérez ";

        identificacion = capturarIdentificacionDelTitular();
        opcion = capturarOpcionMenuPrincipal();
        evaluarOpcionMenuPrincipal(opcion);

    }

    private static int capturarIdentificacionDelTitular() {
        System.out.println("Bienvenido a la aplicacion del banco Su Banco Fiel");
        System.out.println("Ingrese el numero del titular de la cuenta");
        return input.nextInt();
    }

    private static int capturarOpcionMenuPrincipal() {
        System.out.println("Seleccione que accion quiere realizar");
        System.out.println("1. Realizar ingreso");
        System.out.println("2. Retiro");
        System.out.println("3. Consultas de valor");
        return input.nextInt();
    }

    private static void evaluarOpcionMenuPrincipal(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Buenas " + titularCuenta + "Cual es la cantidad que desea depositar?");
                deposito = input.nextInt();

                System.out.println("El deposito es de: " + deposito + " Correcto?");
                System.out.println("1. Si");
                System.out.println("2. No");
                opcion2 = input.nextInt();

                switch (opcion2) {
                    case 1:
                        System.out.println("El deposito fue hecho con exito");
                        System.out.println("Su saldo es de: " + (dinero + deposito));
                        break;
                    case 2:
                        System.out.println("Vuelve a realizar la transaccion y verifique los datos");
                        break;
                    default:
                        System.out.println("Introduzca la opcion correcta entre el 1 y el 2");
                }
                break;
            case 2:
                System.out.println("Buenas " + titularCuenta + "Cual es la cantidad que desea retirar?");
                retiro = input.nextInt();

                System.out.println("El retiro es de: " + retiro + " Correcto?");
                System.out.println("1. Si");
                System.out.println("2. No");
                opcion3 = input.nextInt();

                switch (opcion3) {
                    case 1:
                        System.out.println("Retire el dinero del cajero");
                        System.out.println("El retiro fue hecho con exito");
                        System.out.println("Su saldo es de: " + (dinero - retiro));
                        break;
                    case 2:
                        System.out.println("Vuelve a realizar la transaccion y verifique los datos");
                        break;
                    default:
                        System.out.println("Introduzca la opcion correcta entre el 1 y el 2");
                }
                break;
            case 3:
                System.out.println("Buenas " + titularCuenta + " ,su numero de cuenta es:" + identificacion + " y su saldo es de " + dinero);
                break;
            default:
                System.out.println("Introduzca la opcion correcta entre el 1 y el 3");
        }
    }
}