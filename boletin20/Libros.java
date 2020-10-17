/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author noese
 */
public class Libros implements Comparable {
    
    public Metodos engadirLibro(){
        String autor=JOptionPane.showInputDialog("Introduce autor");
        String titulo=JOptionPane.showInputDialog("Introduce titulo: ");
        String ISBN=JOptionPane.showInputDialog("Introduce ISBN: ");
        float prezo=Float.parseFloat(JOptionPane.showInputDialog("Introduce Prezo: ")); //non é válido , hai que castearlo a float
        int numeroDeUnidades=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de unidades: ")); // como no caso anterior hai que castearlo pero a int
        
        //creamos o obxecto que posteriormente devolveremos no return
        
        Metodos libro = new Metodos(autor,titulo,ISBN,prezo,numeroDeUnidades); // manter o orde anterior
        return libro;
    }
    
    public void vender(ArrayList<Metodos>lista){
        String libro=JOptionPane.showInputDialog("Libro a dar de baja");
        int a=0;
        for(Metodos u:lista){
            a++;
            if(libro.equals(u.ISBN))
                lista.remove(a);
                
        }
    }
    // mostrar os libros que temos de maneira ordeada
    public void amosarLibros(ArrayList<Metodos>lista){
        for(Metodos x:lista){
            System.out.println(x);
        }
    }
    //dara de baixa cando as unidades sexan 0
    public void darDeBaixaAuto(ArrayList<Metodos>lista){
        int a = 0;
        for(Metodos y:lista){
            a++;
            if(y.numeroDeUnidades<0)
                lista.remove(y);
        }
    }
    //consultar libro determinado, para elo seleccionaremos o seu identificador ISBN
    public void consultarLibro(ArrayList<Metodos>lista){
        String isbn=JOptionPane.showInputDialog("Introduce ISBN: ");
        for(Metodos x:lista){
            if(isbn.equals(x.ISBN))
                System.out.println("Datos recopilados: "+isbn+" y "+x);
        }
    }   
               
    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
