/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_3;

/**
 *
 * @author noese
 */
public class Meses {
    private int dia;
    private int mes;
    private int any;
    
    public Meses(int dia,int mes,int any){
        if (comprobarDia(dia) == true){
        this.dia=dia;  
    }
        else dia=1;
        if (mes < 13 && dia > 0) {
            this.mes=mes;
        }
        else mes=1;
        this.any=any;
    }
    
    public Meses(){
        dia = 6;
        mes = 5;
        any = 1998;
    }
    
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAny(){
        return any;
    }
    public void setDia(int dia){
        if(comprobarDia(dia) == true){
        this.dia=dia;
    }
    }
    public void setMes(int mes){
        if(mes<13 && mes>0)
        this.mes=mes;
    }
    public void setAny(int any){
        this.any=any;
    }
    
    
public boolean comprobarDia(int dia) {
    if((((dia < 32 && dia > 0) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 )) || ((dia < 31 && dia > 0)&& (mes == 4 || mes == 6 || mes == 9 || mes == 11))
            || ((dia < 29 && dia > 0) && (mes == 2)) || (dia < 30 && dia < 0) && (mes == 2) &&((any % 100 != 0 && any % 4 == 0) || (any % 400 == 0)))){
        return true;
    } else {
        return false;
    }
}   

    
}
