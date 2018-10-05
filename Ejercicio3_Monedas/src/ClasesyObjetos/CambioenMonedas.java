
package ClasesyObjetos;


public class CambioenMonedas {
    
    int monedas[] = new int [8];
    
    public void Dinero(int cambio){
    if(cambio - 200 >=0){
    monedas[7]++;
    Dinero(cambio- 200);
    } else if(cambio - 100 >= 0){
    monedas[6]++;
    Dinero(cambio - 100);
    } else if(cambio - 50 >= 0){
    monedas[5]++;
    Dinero(cambio - 50);
    }else if(cambio - 20 >= 0){
    monedas[4]++;
    Dinero(cambio - 20);
    }else if(cambio - 10 >= 0){
    monedas[3]++;
    Dinero(cambio - 10);
    }else if(cambio - 5 >= 0){
    monedas[2]++;
    Dinero(cambio - 5);
    }else if(cambio - 2 >= 0){
    monedas[1]++;
    Dinero(cambio - 2);
    }else if(cambio -1 >= 0){
    monedas[0]++;
    Dinero(cambio - 1);
    }
  }
    
    public void imprimirResultados(int cambio){
    
      Dinero(cambio);
      if(monedas[7]>0)System.out.println(monedas[7] + " Billetes de 200");
      if(monedas[6]>0)System.out.println(monedas[6] + " Billetes de 100");
      if(monedas[5]>0)System.out.println(monedas[5] + " Billetes de 50");
      if(monedas[4]>0)System.out.println(monedas[4] + " Billetes de 20");
      if(monedas[3]>0)System.out.println(monedas[3] + " Monedas de 10");
      if(monedas[2]>0)System.out.println(monedas[2] + " Monedas de 5");
      if(monedas[1]>0)System.out.println(monedas[1] + " Monedas de 2");
      if(monedas[0]>0)System.out.println(monedas[0] + " Monedas de 1");
     }
    }
    
  
