/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13_1;

/**
 *
 * @author noese
 */
public class Xogador extends Seleccion {

    private int dorsal;
    private String demarcacion;

    public Xogador() {
    }

    public Xogador(int dorsal, String demarcacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void xogarPartido() {
        System.out.println("Xoga partido xogadores");
    }

    public void entrenar() {
        System.out.println("Entrenando xogadores");
    }

    @Override
    public void viaxar() {
        System.out.println("viaxan os xogadores");
    }

    @Override
    public String toString() {
        return super.toString() + "dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }

}
