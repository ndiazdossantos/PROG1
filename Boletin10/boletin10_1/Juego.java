/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author noese
 */
public class Juego {
    public Juego(){
        
    }
    
    public void Operaciones(){
        int intentos;
        int numero;
        int respuesta;
        intentos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca nº de intentos posibles : "));
        numero = Integer.parseInt(JOptionPane.showInputDialog("Teclee numero de la solución, un numero entre 1 y 50:"));
        do{
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Introduzca respuesta : "));
            if(respuesta != numero){
                intentos--;
                if(respuesta<numero){
                    JOptionPane.showMessageDialog(null,"El numero es mayor","Estas cerca, pista activada",JOptionPane.WARNING_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null,"El numero es menor","Estas cerca, pista activada",JOptionPane.WARNING_MESSAGE);
            }
            } else{
                  JOptionPane.showMessageDialog(null,"Es la respuesta correcta");
                }
            } while(intentos>0 && respuesta != numero);
            JOptionPane.showMessageDialog(null,"Final del juego","NOTIFICACIoN",JOptionPane.WARNING_MESSAGE);
            }
        }

