/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularnota1eva;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Notas {
    private float teorico1;
    private float teorico2;
    private float boletins;
   
    
    public Notas(){
        
    }

    public Notas(float teorico1, float teorico2, float boletins) {
        this.teorico1 = teorico1;
        this.teorico2 = teorico2;
        this.boletins = boletins;
    }

    public float getTeorico1() {
        return teorico1;
    }

    public float getTeorico2() {
        return teorico2;
    }

    public float getBoletins() {
        return boletins;
    }

    public void setTeorico1(float teorico1) {
        this.teorico1 = teorico1;
    }

    public void setTeorico2(float teorico2) {
        this.teorico2 = teorico2;
    }

    public void setBoletins(float boletins) {
        this.boletins = boletins;
    }
    
    public void notaMediaTeorico(float notamedia){
        notamedia=(float) ((((teorico1+teorico2)/2))*0.4);
    }
    
   public void darDato(){
   Scanner sc = new Scanner(System.in);
       System.out.println("Introduce nota teorico 1 : ");
       teorico1=sc.nextFloat();
       System.out.println("Introduce nota teorico 2 : ");
       teorico2=sc.nextFloat();
       System.out.println("Introduce Boletines : ");
       boletins=sc.nextFloat();
       
   }
   
   public void calcularNota(){
       darDato();
       notaMediaTeorico();
       
      
   }
}
