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
public class Veleros extends Barco {
    
    private int numeroMastiles;
    private float precio;

    public Veleros() {
    }

   

    public Veleros(int numeroMastiles, float eslora, int dias, String matricula) {
        super(eslora, dias, matricula);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public void calcularPrezo() {
    precio = 10*super.getEslora()*super.getDias()+8*numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero" + " precio: " + precio;
    }
    
    
    
    
}
