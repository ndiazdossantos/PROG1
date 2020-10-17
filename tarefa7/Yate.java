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
public class Yate extends Barco {
    
    private int numeroCamarotes, cv;
    private float precio;
    
    public Yate(){
    }

    public Yate(int numeroCamarotes, int cv, float eslora, int dias, String matricula) {
        super(eslora, dias, matricula);
        this.numeroCamarotes = numeroCamarotes;
        this.cv = cv;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public void calcularPrezo() {
     precio=10*super.getEslora()*super.getDias()+2*cv+25*numeroCamarotes;
        
        
    }

    @Override
    public String toString() {
        return "Yate " + " precio: " + precio;
    }
    
    
    
    
    
    
}
