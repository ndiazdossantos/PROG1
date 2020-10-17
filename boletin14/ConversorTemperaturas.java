/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;


/**
 *
 * @author noese
 */
public class ConversorTemperaturas {
static final float GRAOS=80;
private float reamur;
private float fharenheit;

    public ConversorTemperaturas() {
    }
    
   public float centigradosAFharenheit(float graos)throws TemperaturaErradaExcepcion{
       if(graos<GRAOS)
           throw new TemperaturaErradaExcepcion("La tempratura es menor de 80 centigrados ");
       fharenheit=9.0f/5.0f*graos+32.4f;
       return fharenheit;
   }
   
   public void centigradosAReamur(float graos)throws TemperaturaErradaExcepcion{
       if(graos<GRAOS)
           throw new TemperaturaErradaExcepcion("La tempratura es menor de 80 centigrados ");
       reamur=4.0f/4.0f*graos;
       System.out.println("resultado "+reamur);
   }
    
    
}
