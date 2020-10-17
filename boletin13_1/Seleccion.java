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
public class Seleccion {

    private int id;
    private String nome;
    private String apelido;
    private int edade;

    public Seleccion() {
    }

    public Seleccion(int id, String nome, String apelido, int edade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public int getEdade() {
        return edade;
    }

    public void viaxar() {
        System.out.println("viaxa a seleccion");
    }

    public void concentrarse() {
        System.out.println("concentrase a selección");
    }

    @Override
    public String toString() {
        return "id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", edade=" + edade;
    }

}
