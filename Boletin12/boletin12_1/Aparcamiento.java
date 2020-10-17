/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_1;

import javax.swing.JOptionPane;

/**
 *
 * @author noese
 */
/*public class Aparcamiento {
    private int numeroCoches=60;
    private int numeroPlazas=150;
    private float horaEntrada;
    private float horaSalida;
    private float horas;
    private String matricula;
    private double precio;
    private double dineroIntroducido;
    private double cambio;
    
    public Aparcamiento(){
        
    }
    
    public void aparcar(){
        if(numeroPlazas == 0){
       JOptionPane.showMessageDialog(null, "Completo");
                    }
        else{
       JOptionPane.showInputDialog(null, "Plazas Disponibles");
       matricula=JOptionPane.showInternalInputDialog(null, "Introduzca la Matricula");
       numeroPlazas--;
       numeroCoches++;
       horaEntrada=System.currentTimeMillis() / 1000 / 60 / 60;
       
        }
    }
    public void salir(){
        if(numeroPlazas == 150){
            JOptionPane.showInputDialog(null, "No hay coches en el garaje");
        }
        else {
            horaSalida= System.currentTimeMillis() / 1000 / 60 / 60;
            if (horaSalida - horaEntrada <3 ){
                precio=1.5;
            }
            else{
                horas=(horaSalida-horaEntrada)-3;
                Math.floor(horas);
                precio=1.5 + (0.2*horas);
            }
            dineroIntroducido=Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el dinero para pagar"));
            while(dineroIntroducido<precio){
                JOptionPane.showMessageDialog(null,"El dinero introducido es insuficiente" );
                dineroIntroducido=dineroIntroducido + Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca mas dinero"));
                        }
            
            cambio=dineroIntroducido-precio;
            JOptionPane.showMessageDialog(null, "Recibo Matricula Coche" + matricula + "\nTiempo" + (horaSalida-horaEntrada));
            numeroPlazas++;
            numeroCoches--;
        }
    }
    public void proceso(){
        int eleccion;
        String[] opciones = {"Aparcar", "Retirar" , "Salir"};
        eleccion=JOptionPane.showOptionDialog(null,"Que desea hacer?",null,JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,null);
        while(eleccion <=1){
            if(eleccion <=1){
                switch(eleccion){
                    case 0:
                        aparcar();
                        eleccion = JOptionPane.showOptionDialog(null, "Que deseas hacer?",null,JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,null);
                break;
                    case 1:
                        salir();
                        eleccion=JOptionPane.showOptionDialog(null,"Que deseas hacer?",null,JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,null);
                        break;
                }
            }
                    
            
                    
            
        }
    }
}
*/
    public class Aparcamiento {
    private int numeroCoches, numeroPlazas = 5;
    private long horaEntrada, horaSalida, horas;
    private String matricula;
    private double precio, cantidadIntroducida, cambio;

    public Aparcamiento() {
    }

    public void aparcar() {
        if (numeroPlazas == 0) {
            JOptionPane.showMessageDialog(null, "COMPLETO");
        } else {
            JOptionPane.showMessageDialog(null, "PLAZAS DISPONIBLES");
            matricula = JOptionPane.showInputDialog(null, "INTRODUZCA MATRICULA");
            numeroPlazas--;
            numeroCoches++;
            horaEntrada = System.currentTimeMillis() / 1000 / 60 / 60;
        }
    }

    public void retirar() {
        if (numeroPlazas == 5) {
            JOptionPane.showMessageDialog(null, "NO HAY COCHES A RETIRAR");
        } else {
            horaSalida = System.currentTimeMillis() / 1000 / 60 / 60;
            if (horaSalida - horaEntrada < 3) {
                precio = 1.5;
            } else {
                horas = (horaSalida - horaEntrada) - 3;
                Math.floor(horas);
                precio = 1.5 + (0.2 * horas);
            }
            cantidadIntroducida = Double.parseDouble(JOptionPane.showInputDialog(null, "INTRODUZCA PAGO"));
            while (cantidadIntroducida < precio) {
                JOptionPane.showMessageDialog(null, "PAGO INSUFICIENTE");
                cantidadIntroducida = cantidadIntroducida + Double.parseDouble(JOptionPane.showInputDialog(null, "INTRODUZCA PAGO"));
            }
            cambio = cantidadIntroducida - precio;
            JOptionPane.showMessageDialog(null, "FACTURA\nMATRICULA COCHE: " + matricula + "\nTIEMPO: " + (horaSalida - horaEntrada) + "\nPRECIO: " + precio + "\nDINERO RECIBIDO: " + cantidadIntroducida + "\nDINERO DEVUELTO: " + cambio);
            numeroPlazas++;
            numeroCoches--;
        }
    }

    public void programa() {
        int eleccion;
        String[] opciones = {"APARCAR", "RETIRAR", "SALIR"};
        eleccion = JOptionPane.showOptionDialog(null, "QUE ACCIÓN DESEA HACER?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, null);
        while (eleccion <= 1) {
            if (eleccion <= 1) {
                switch (eleccion) {
                    case 0:
                        aparcar();
                        eleccion = JOptionPane.showOptionDialog(null, "QUE ACCIÓN DESEA HACER?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, null);
                        break;
                    case 1:
                        retirar();
                        eleccion = JOptionPane.showOptionDialog(null, "QUE ACCIÓN DESEA HACER?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, null);
                        break;
                }
            }
        }
    }
    }