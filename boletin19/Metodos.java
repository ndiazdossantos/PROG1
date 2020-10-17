/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import javax.swing.JOptionPane;
import metodos.PedirDato;

/**
 *
 * @author noese
 */
public class Metodos {

    public int[][] crearMatriz(int[][] taboa) {
        for (int f = 0; f < taboa.length; f++) {
            for (int c = 0; c < taboa[f].length; c++) {
                taboa[f][c] = PedirDato.pedirInt();
            }
        }
        return taboa;
    }

    public void amosar(int[][] taboa) {
        for (int f = 0; f < taboa.length; f++) {
            System.out.println("\n"); // para hacer un salto
            for (int c = 0; c < taboa[f].length; c++) {
                System.out.print(taboa[f][c] + "  "); // fijarse que solo es print
            }
        }
    }

    public void sair() {
        System.exit(0); // por defecto es el 0
    }

    public void arrayString(int[][] taboa) {
        int filas = taboa.length;
        int columnas = taboa[0].length;
    }

    public String[] arraysFila(int[][] taboa) {
        String[] filas = new String[taboa.length];
        for (int i = 0; i < filas.length; i++) {
            filas[i] = PedirDato.pedirMensaxe("nome filas ");
        }
        return filas;
    }

    public String[] arraysColumnas(int[][] taboa) {
        String[] columnas = new String[taboa[0].length];
        for (int i = 0; i < columnas.length; i++) {
            columnas[i] = PedirDato.pedirMensaxe("nome columnas ");
        }
        return columnas;
    }

    public void amosarTodo(int[][] taboa, String[] equipo, String[] xornada) {
        System.out.print("       ");
        for (int i = 0; i < xornada.length; i++) {
            System.out.print(xornada[i] + "| ");
        }
        System.out.println("");
        for (int f = 0; f < taboa.length; f++) {
            System.out.print(equipo[f] + " |");
            for (int c = 0; c < taboa[f].length; c++) {
                System.out.print(taboa[f][c] + " | ");
            }
            System.out.println("");
        }
    }

    public int[] mediaGolesXornada(int[][] taboa, int[] mAlum) {
        int acu = 0;
        for (int f = 0; f < taboa.length; f++) {
            acu = 0;
            for (int c = 0; c < taboa.length; c++) {
                acu = acu + taboa[f][c];
            }
            mAlum[f] = acu / taboa[f].length;
            System.out.println("Media X" + (f + 1) + "  " + mAlum[f]);
        }
        return mAlum;
    }

    public int[] mediaGolesLiga(int[][] taboa, int[] mModulos) {
        int acu = 0;
        for (int c = 0; c < mModulos.length; c++) {
            acu = 0;
            for (int f = 0; f < taboa.length; f++) {
                acu = acu + taboa[f][c];
            }
            System.out.println("Media Equipo" + (c + 1) + "  " + acu / mModulos.length);
            mModulos[c] = acu / mModulos.length;
        }

        return mModulos;
    }

    public void ordenarEquipos(int[][] goles, String[] equipo, int[] total) {
        int totalgor;
        for (int i = 0; i < goles.length; i++) {
            totalgor = 0;
            for (int j = 0; j < goles[0].length; j++) {
                totalgor = goles[i][j] + totalgor;
            }
            total[i] = totalgor;
            System.out.println("Goles marcados: " + total[i]);
        }
        int auxgol, auxtotal;
        String auxequ;
        for (int i = 0; i < total.length - 1; i++) {
            for (int j = 1 + 1; j < total.length; j++) {
                for (int k = 0; k < goles[0].length; k++) {
                    if (total[i] < total[j]) {
                        auxtotal = total[i];
                        total[i] = total[j];
                        total[j] = auxtotal;
                        auxequ = equipo[i];
                        equipo[i] = equipo[j];
                        equipo[j] = auxequ;
                        auxgol = goles[i][k];
                        goles[i][k] = goles[j][k];
                        goles[j][k] = auxgol;
                    }
                }
            }
        }

    }

    public void totalGolesEquipo(String[] equipo, int[] total) {
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("El " + equipo[i] + " marco un total de " + total[i]);
        }
        System.out.println("");
    }

    public void mostraTablaOrdenada(int[][] taboa, String[] equipo, String[] xornada, int[] golesTotal) {
        System.out.print("Equipo || Xornada  ");
        for (int k = 0; k < taboa.length; k++) {
            System.out.print(xornada[k] + "| ");
        }
        System.out.println("");
        for (int i = 0; i < taboa.length; i++) {
           System.out.print(equipo[i] + " |");
            for (int j = 0; j < taboa[i].length; j++) {
                System.out.print(taboa[i][j] +  " |");
            }
            System.out.println(" - " + golesTotal[i]);
        }
        System.out.println("");
    }

    public void totalGolesXornada(String[] equipo, String[] xornada, int[][] goles) {
        int max;
        String equipom[] = new String[equipo.length];
        int i, j;

        for (i = 0; i < goles[0].length; i++) {
            max = 0;
            for (j = 0; j < goles.length; j++) {
                if (max <= goles[j][i]) {
                    max = goles[j][i];
                    equipom[j] = equipo[j];
                }
            }
            for (j = 0; j < goles.length; j++) {
                if (max == goles[j][i]) {
                    System.out.println("O equipo: " + equipom[j] + " marcou " + max + " goles na xornada " + xornada[i]);
                }
            }
        }
        System.out.println("");
    }
public void consulta(String[] equipo, String[] Xornada, int[][] goles) {
        String xornadas, equipos;
        int posicionE = 0, posicionJ = 0;
        equipos = JOptionPane.showInputDialog(null, "Nome do equipo");
        xornadas = JOptionPane.showInputDialog(null, "Introduzca xornada \nSe almacenan como\n      X+numerodexornada");
        for (int i = 0; i < equipo.length; i++) {
            if (equipos.equals(equipo[i])) {
                posicionE = i;
            }
        }
        for (int i = 0; i < Xornada.length; i++) {
            if (xornadas.equals(Xornada[i])) {
                posicionJ = i;
            }
        }
        System.out.println("El equipo " + equipos + " marco " + goles[posicionE][posicionJ] + " en la xornada " + xornadas);

    }
}
