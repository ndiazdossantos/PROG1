/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

/**
 *
 * @author noese
 */
public class Circulo {
    private double radio;
    private final double PI=3.14;
    
    public Circulo(){
        
    }
    public Circulo(double r){
        radio=r;
    }
    public void setRadio(double r){
        radio=r;
    }
    public double calcularArea(){
        return PI*Math.pow(radio, 2);
    }
    public double calcularLonxitude(){
        return 2*PI*radio;
    }
}
