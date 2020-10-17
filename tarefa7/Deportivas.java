/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa7;

/**
 *
 * @author noese
 */
public class Deportivas extends Barco{
    
    private int cv;
    private float precio;
    public Deportivas() {
    }

    
    public Deportivas(int cv, float eslora, int dias, String matricula) {
        super(eslora, dias, matricula);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public void calcularPrezo() {
     precio=10*super.getEslora()*super.getDias()+2*cv;
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Deportivas" + " precio: " + precio;
    }

    

    
    
}
