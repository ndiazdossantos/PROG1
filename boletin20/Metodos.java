/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

/**
 *
 * @author noese
 */
public class Metodos {
    String autor;
    String titulo;
    String ISBN;
    float prezo;
    int numeroDeUnidades;

    public Metodos() {
    }
    
    

    public Metodos(String autor, String titulo, String ISBN, float prezo, int numeroDeUnidades) {
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.numeroDeUnidades = numeroDeUnidades;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getNumeroDeUnidades() {
        return numeroDeUnidades;
    }

    public void setNumeroDeUnidades(int numeroDeUnidades) {
        this.numeroDeUnidades = numeroDeUnidades;
    }

    @Override
    public String toString() {
        return "Libreria{" + "autor=" + autor + ", titulo=" + titulo + ", ISBN=" + ISBN + ", prezo=" + prezo + ", numeroDeUnidades=" + numeroDeUnidades + '}';
    }
    
    
}
