
package xenericos;

public class ClaseObject {
    
    private Object valor;
    
    public ClaseObject(){
        valor = null;        
    }
    public Object getClaseObject (){
        return valor;
    }
    
    public void setClaseObject(Object v){
        valor = v;
        System.out.println(valor);
    }
    public void amosar(Object a){
        System.out.println("//"+a);
    }
            
    
}
