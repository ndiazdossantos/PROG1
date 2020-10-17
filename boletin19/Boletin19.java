/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import javax.swing.JOptionPane;

/**
 *
 * @author noese
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[20][36];
        int[]mediaGolesXornada=new int[20];
        int[]mediaGolesEquipo=new int[36];
        String[]equipo={"Barcelona","R. Madrid","Villarreal","R. Sociedad","Getafe","Valencia","Betis","Osasuna","Levante","Granada","Alavés","Athletic","Atlético","Eibar","Mallorca","Celta","Espanyol","Valladolid","Leganés"};
            String[]xornada={"X1","X2","X3","X4","X5","X6","X7","X8","X9","X10","X11","X12","X13","X14","X15","X16","X17","X18","X19","X20","X21","X22","X23","X24","X25","26","27","28","X29","X30","X31","X32","X33","X34","X35","X36"};
        int opcion;
        Metodos obx1 = new Metodos();
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("*** MENU ***<<<\n1--> Crear Matriz \n2---> Amosar\n3--> Amosar Todo\n4--> Media Goles Xornada\n5--> Media Goles Equipo\n6--> Ordenar\n7--> Mostrar Tabla Ordenada\n8--> Buscar total de goles en la Jornada\n9-->Consultas por equipo e xornada indicando o n° de goles.\n10--> Sair\n11-->Teclea Opcion\n"));
            switch(opcion){
                case 1: matriz = obx1.crearMatriz(matriz);
                break;
                case 2: obx1.amosar(matriz);
                break;
                case 3: obx1.amosarTodo(matriz, equipo, xornada);
                break;
                case 4: mediaGolesXornada=obx1.mediaGolesXornada(matriz, mediaGolesXornada);
                break;
                case 5: mediaGolesEquipo=obx1.mediaGolesLiga(matriz, mediaGolesEquipo);
                break;
                case 6: obx1.ordenarEquipos(matriz, equipo, mediaGolesEquipo);
                break;
                case 7: obx1.mostraTablaOrdenada(matriz, equipo, xornada, mediaGolesXornada);
                break;
                case 8: obx1.totalGolesEquipo(equipo, mediaGolesEquipo);
                break;
                case 9: obx1.totalGolesXornada(equipo, xornada, matriz);
                break;
                case 10: obx1.consulta(equipo, xornada, matriz);
                break;
                case 11: obx1.sair();
            }
        }while(opcion<12);
    }
    
}
