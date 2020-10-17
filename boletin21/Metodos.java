/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

/**
 *
 * @author noese
 */
public class Metodos {
    String titulo;
    String autor;
    float prezo;
    int numeroDeUnidades;

    public Metodos() {
    }

    public Metodos(String titulo, String autor, float prezo, int numeroDeUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.prezo = prezo;
        this.numeroDeUnidades = numeroDeUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
        return "Metodos{" + "titulo=" + titulo + ", autor=" + autor + ", prezo=" + prezo + ", numeroDeUnidades=" + numeroDeUnidades + '}';
    }

   
    
}
