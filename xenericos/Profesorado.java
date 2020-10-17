
package xenericos;

public class Profesorado extends Persoa {
    
    String modulo;

    public Profesorado(String modulo) {
        this.modulo = modulo;
    }

    public Profesorado(String modulo, String nome, int edade) {
        super(nome, edade);
        this.modulo = modulo;
    }

    public String getModulo() {
        return modulo;
    }

    @Override
    public String toString() {
        return super.toString()+ "modulo=" + modulo + '}';
    }
    public void Saudar(){
       super.Saudar();
        System.out.println("saudo do profesorado");
    }
    
    
}
