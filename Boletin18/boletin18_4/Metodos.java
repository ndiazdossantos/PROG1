/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_4;

import javax.swing.JOptionPane;

/**
 *
 * @author noese
 */
public class Metodos {
    
    public void letraDni(int[] numero, char[] letra) {
        int dni;
        dni = Integer.parseInt(JOptionPane.showInputDialog("Introduce el DNI a comprobar"));
        int resto = dni % 23; // dividirlo entre 23 y almacenamos el resto
        for (int i = 0; i < numero.length; i++) {
            if (resto == numero[i]) {
                JOptionPane.showMessageDialog(null, "La letra es: " + letra[i]);
            }
        }

    }

}