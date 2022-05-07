package numerosPrimos;

public class NumerosPrimos {
	
	/*Declaración de variables*/

    public static int contador,contador2,i,num[],primo;
    
    /*Métodos de la clase*/

    public static void main(String args[]) {

        num = new int[1000];

        for (i=1;i<999;i++){
            num[i]= i;
        }
        contador2=0;
        while (contador2<1){
        	System.out.println(" ");
        	System.out.println(" ");
            System.out.print("Números primos: ");
            for (i=1;i<999;i++){
                contador = 0;
                primo = 1;
                while (primo <= i){
                    if (i % primo == 0){
                        contador = contador + 1;
                    }
                    primo = primo + 1;
                }
                if (contador == 2){
                    System.out.print(num[i]+" ,");
                }
            }
            contador2=contador2+1;
        }
    }
}