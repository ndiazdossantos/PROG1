/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import datos.Persoal;
import java.util.Scanner;
import notaprimertrimestre.NotaMedia;

/**
 *
 * @author noese
 */
public class Academica {

    public static int numReferencia = 2020;
    private String nome;
    private int nota;
    private Persoal alumno;

    public Academica() {
        Academica.numReferencia=numReferencia;
        numReferencia++;
        
    }

    public Academica(String nome, int nota, Persoal alumno) {
        this.nome = nome;
        this.nota = nota;
        this.alumno = alumno;
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public Persoal getAlumno() {
        return alumno;
    }

    public static void setNumReferencia(int numReferencia) {
        numReferencia = numReferencia + 1;
        Academica.numReferencia = numReferencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setAlumno(Persoal alumno) {
        this.alumno = alumno;
    }

    public void darDatos() {
        Scanner b = new Scanner(System.in);
        System.out.println("Introduce Nome");
        nome = b.next();
        NotaMedia nota1 = new NotaMedia();
        nota1.programa();
        Persoal c = new Persoal();
        c.pedirPersoal();
        System.out.println("Nombre : " + nome + "\nNumero referencia: " + Academica.numReferencia);
        System.out.println(nota1.toString());
        System.out.println(c.toString());
    }

    @Override
    public String toString() {
        return "Academica{" + "nome=" + nome + ", nota=" + nota + ", alumno=" + alumno + '}';
    }

}
