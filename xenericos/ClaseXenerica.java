
package xenericos;

public class ClaseXenerica <T>{
    
    private T dato;
    
    public ClaseXenerica(){
        dato = null;
    }
    public void setDato(T valor){
        dato = valor;
    }
    public T getDato(){
        return dato;
    }
    
}
