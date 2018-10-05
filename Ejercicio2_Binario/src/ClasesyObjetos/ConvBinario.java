
package ClasesyObjetos;


public class ConvBinario {
    public void BinarioaDecimal(int numero){
    
        if(numero <2){
            System.out.print(numero);
        } else{
        BinarioaDecimal(numero/2);
            System.out.print(numero%2);
        }
    
    }
    
    
    
}
