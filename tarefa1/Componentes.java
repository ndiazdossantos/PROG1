/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa1;

import javax.swing.*;

/**
 *
 * @author noese
 */
public class Componentes {
    
    JFrame marco;
    JPanel panel;
    JButton boton,boton2;
    JLabel etiqueta,etiqueta2;
    JTextField texto,texto2;
    JTextArea area;
    
    public Componentes(){
        
        marco = new JFrame( " COMPONENTES ");
        panel = new JPanel();
        etiqueta = new JLabel();
        etiqueta2 = new JLabel();
        texto = new JTextField();
        texto2 = new JTextField();
        boton = new JButton(" LIMPAR ");
        boton2 = new JButton(" PREMER ");
        area = new JTextArea(" AREA DE TEXTO ");
        
        marco.setSize(800,500);
        panel.setSize(800,500);
        etiqueta.setText(" NOME ");
        texto.setSize(200,200);
        texto.setText("    ");
        etiqueta2.setText(" PASSWORD ");
        texto2.setSize(200,200);
        texto2.setText("    ");
        area.setSize(200,500);
         
        panel.add(etiqueta);
        panel.add(texto);
        panel.add(etiqueta2);
        panel.add(texto2);
        panel.add(area);
        panel.add(boton);
        panel.add(boton2);
        marco.add(panel);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
    
    
    
}
