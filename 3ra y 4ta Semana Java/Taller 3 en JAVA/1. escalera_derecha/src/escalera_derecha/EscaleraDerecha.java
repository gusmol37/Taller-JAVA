package escalera_derecha;

public class EscaleraDerecha {
	
	/*Declaraci�n de variables*/
	
    public static int j, i;
    
    /*M�todo de la clase*/
    
    public static void main(String[] args) {

        for (i=10; i>0; i--){
            for (j=1; j<10-i+1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}