/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_4;

/**
 *
 * @author noese
 */
public class NumeroComplejo {
    public static final NumeroComplejo CERO = new NumeroComplejo(0.0,0.0);
    private double real;
    private double imaginario;
    
    public NumeroComplejo(double real,double imaaginario){
        this.real = real;
        this.imaginario = imaginario;
    }
    public double getReal(){
        return real;
    }
    public double getImaginario(){
        return imaginario;
    }
    public NumeroComplejo add (NumeroComplejo c){
        NumeroComplejo resultado = new NumeroComplejo(this.real+c.getReal(),this.imaginario+c.getImaginario());
        return resultado;
    }
    public String toString(){
        String resultado = this.real+"";
        if(this.imaginario>=0.0)
            resultado+="+"+this.imaginario+" y ";
            else resultado += this.imaginario+" y ";
            return resultado;
    }
}
