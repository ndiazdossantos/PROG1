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
public class Masaxista extends Seleccion {

    private String titulacion;
    private int anosExperiencia;

    public Masaxista() {
    }

    public Masaxista(String titulacion, int anosExperiencia, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void darMasaxes() {
        System.out.println("O masaxista da masaxes");
    }

    @Override
    public String toString() {
        return super.toString() + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia;
    }

}
