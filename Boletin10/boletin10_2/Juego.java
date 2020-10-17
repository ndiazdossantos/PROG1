/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_2;

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
        int diferencia;
        intentos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca nº de intentos posibles : "));
        numero = (int) (Math.random()* ((50-1)+1))+1;
        
        do{
           respuesta = Integer.parseInt(JOptionPane.showInputDialog("Introduzca respuesta : "));
           diferencia= Math.abs(respuesta - numero);
           if(respuesta!=numero)
               intentos--;
            if(diferencia >= 20){
                JOptionPane.showMessageDialog(null,"Estás muy lejos","PISTA ACTIVADA",JOptionPane.WARNING_MESSAGE);
            } 
            else if(diferencia>=10){
                    JOptionPane.showMessageDialog(null,"Estás lejos","PISTA ACTIVADA",JOptionPane.WARNING_MESSAGE);
                }
            else if (diferencia >= 5) {
                    JOptionPane.showMessageDialog(null,"Estás cerca","PISTA ACTIVADA",JOptionPane.WARNING_MESSAGE);
            }
             else if (diferencia >= 0){
                  JOptionPane.showMessageDialog(null,"Es la respuesta correcta","ENHORABUENA PREMIO",JOptionPane.INFORMATION_MESSAGE);
                  break;
                }
            
            } while(intentos>0 && respuesta != numero);
            JOptionPane.showMessageDialog(null,"Final del juego","NOTIFICACIÓN",JOptionPane.WARNING_MESSAGE);
            }
        
// SOLUCIONAR CUANDO SE ACIERTA SIGUE CORRIENDO LOS INTENTOS NO FINALIZA
}
