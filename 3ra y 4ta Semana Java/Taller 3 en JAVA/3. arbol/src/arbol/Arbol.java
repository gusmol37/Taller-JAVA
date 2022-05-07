package arbol;

public class Arbol{

    public static void main(String args[]) {
    	
    	/*Declaración de variables*/

        int h;
        int i;
        int j;
        i = 11;
        
        /*Ciclo Do-While*/

        do {
            h = 0;
            j = 0;
            do {
                System.out.print(" ");
                h = h+1;
            } while (h!=i);
            do {
                System.out.print("*");
                j = j+1;
            } while (j!=12-i);
            j = 0;
            if (i!=11) {
                do {
                    System.out.print("*");
                    j = j+1;
                } while (j!=11-i);
            }
            System.out.println("");
            i = i-1;
        } while (i!=0);
        i = 10;
        do {
            h = 0;
            j = 0;
            do {
                System.out.print(" ");
                h = h+1;
            } while (h!=i);
            do {
                System.out.print("*");
                j = j+1;
            } while (j!=12-i);
            j = 0;
            if (i!=11) {
                do {
                    System.out.print("*");
                    j = j+1;
                } while (j!=11-i);
            }
            System.out.println("");
            i = i-1;
        } while (i!=9);
        i = 10;
        do {
            h = 0;
            j = 0;
            do {
                System.out.print(" ");
                h = h+1;
            } while (h!=i);
            do {
                System.out.print("*");
                j = j+1;
            } while (j!=12-i);
            j = 0;
            if (i!=11) {
                do {
                    System.out.print("*");
                    j = j+1;
                } while (j!=11-i);
            }
            System.out.println("");
            i = i-1;
        } while (i!=7);
    }
}