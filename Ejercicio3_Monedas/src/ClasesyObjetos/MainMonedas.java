
package ClasesyObjetos;

import java.util.Scanner;

public class MainMonedas {
    
    public static void main(String [] args){
    
    Scanner entrada = new Scanner (System.in);
     CambioenMonedas CM = new CambioenMonedas();   
    
        System.out.print("El costo es $");
    int costo = entrada.nextInt();
        System.out.print("El pago será de $");
        int pago = entrada.nextInt();
        int cambio = pago - costo;
        
        CM.imprimirResultados(cambio);
        
    }
    
    
}
