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
public class Adestrador extends Seleccion {

    private String idFederacion;

    public Adestrador() {
    }

    public Adestrador(String idFederacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void dirixirPartido() {
        System.out.println("Dirixe partido adestrador");
    }

    public void dirixirAdestramento() {
        System.out.println("Dirixe adestramento adestrador");
    }

    @Override
    public String toString() {
        return super.toString() + "idFederacion=" + idFederacion;
    }

}
