/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

/**
 *
 * @author noese
 */
public class ClasseA {

    private int valorPrimari;
    private int valorSecundari;

    public ClasseA() {
        valorPrimari = 5;
        valorSecundari = 10;
    }

    public ClasseA(int vp) {
        valorPrimari = vp;
        valorSecundari = 10;
    }

    public ClasseA(int vp, int vs) {
        valorPrimari = vp;
        valorSecundari = vs;
    }

    public int getPrimari() {
        return valorPrimari;
    }

    public int getSecundari() {
        return valorSecundari;
    }
}
