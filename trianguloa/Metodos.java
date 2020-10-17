/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianguloa;

/**
 *
 * @author noese
 */
public class Metodos {
    private float base;
    private float altura;
    private static int valor;
    
    public Metodos(){
        
    }

    public Metodos(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Metodos{" + "base=" + base + ", altura=" + altura + '}';
        // o eliminando lo que no nos interesa return "base=" + base + ", altura=" + altura;
    }
    public void amosar(){
        System.out.println(toString());
    }
    public void amosar2(){
        System.out.println(valor); // un metodo no estatico puede acceder tanto a elementos estáticos como no estáticos
    }
    public static void amosar3(){
        System.out.println(base); // podemos comprobar que desde un método estático no podemos acceder a variables no estáticas
    }
    public static void amosar4(){
        System.out.println(valor); // podemos comprobar que si se puede realmente acceder únicamente a estáticos
    }
    public static void amosar5(){
        System.out.println(toString()); // nuevamente vemos que no se puede acceder a los no estáticos
    }
}
