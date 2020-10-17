
package xenericos;

public class ArrayXenerico <T>{
  
   
    public<T> int longo(T[]arrai){
        if(arrai.length ==0) {
            return 0;
        } else {
            return arrai.length;
        }
        
        
    }
    
    public int tam(Object[]a){
        return a.length;
    }
    
    
    
    
    
    
}
