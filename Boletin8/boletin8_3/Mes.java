/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_3;

/**
 *
 * @author noese
 */
public class Mes {
    private int mes;
    
    public Mes(){
        
    }
    
    public Mes(int mes){
        this.mes=mes;
    }
    public void setMes(int mes){
        this.mes=mes;
    }
    public int getMes(){
        return mes;
    }
   
    public void Dias(){
        switch(mes){
            case 1: System.out.println("31 dias");
                break;
            case 2: System.out.println("28 dias");
                break;
            case 3: System.out.println("31");
            break;
            case 4: System.out.println("30");
            break;
            case 5: System.out.println("31");
            break;
            case 6: System.out.println("30");
            break;
            case 7: System.out.println("31");
            break;
            case 8: System.out.println("31");
            break;
            case 9: System.out.println("30");
            break;
            case 10: System.out.println("31");
            break;
            case 11: System.out.println("30");
            break;
            case 12: System.out.println("31");
            break;
            
            
        }
    }
}
