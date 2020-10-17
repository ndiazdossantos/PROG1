/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa7;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author noese
 */
public class Tarefa7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Barco>listaBarco=new ArrayList<>();
        
        Yate yt= new Yate(21,2000,80,42,"Spagne");
        Deportivas dp = new Deportivas(2000,35,20,"CrowFun");
        Veleros vl = new Veleros(5,45,15,"Tuis tas loca");
        
        yt.calcularPrezo();
        dp.calcularPrezo();
        vl.calcularPrezo();
        
        listaBarco.add(yt);
        listaBarco.add(dp);
        listaBarco.add(vl);
        
        for(Barco l:listaBarco){
            JOptionPane.showMessageDialog(null,l);
        }
        
        //SI QUEREMOS MOSTRARLO CON UN SOUT DIRECTAMENTE SIN LA PESTAÑA EMERGENTE
        
        
       /* System.out.println(yt.toString());
        System.out.println(dp.toString());
        System.out.println(vl.toString());
        */
    }
        
    
}
