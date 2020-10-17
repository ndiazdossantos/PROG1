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
public class Boletin20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Metodos>lista= new ArrayList();
        Libros obx1=new Libros();
        int opcion;        
         do{
            opcion= Integer.parseInt(JOptionPane.showInputDialog("*** MENU ***<<<\n1-->Engadir Libros \n2---> Vender Libro\n3--> Amosar Todo\n4--> Consultar Libro\n5--> Sair"));
            switch(opcion){                
                case 1:lista.add(obx1.engadirLibro());
                break;
                case 2:obx1.vender(lista);
                break;
                case 3:obx1.amosarLibros(lista);
                break;
                case 4:obx1.consultarLibro(lista);
                break;
                case 5:;
                break;
                
            }
        }while(opcion!=5);
    }
    
}
    
   
