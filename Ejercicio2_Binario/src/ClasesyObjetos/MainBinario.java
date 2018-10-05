
package ClasesyObjetos;

import java.util.Scanner;

public class MainBinario {
    
    public static void main(String [] args){
    
    Scanner entrada = new Scanner (System.in);
    ConvBinario BaD = new ConvBinario(); 
        int numero;
        
        System.out.print("Ingrese el numero decimal: ");
                numero = entrada.nextInt();
                BaD.BinarioaDecimal(numero);
    }
    
    
}
