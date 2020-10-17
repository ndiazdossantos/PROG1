/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_2;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Boletin18_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Metodos obx1 = new Metodos();
       obx1.crearArrays();
       // introducimos los nombres ya creados en metodos
       obx1.insertarNombres();
       obx1.amosArrays();
       obx1.notaMaior();
       //para mostrar un alumno concreto introducimos un String
       System.out.println("\n ENCONTRAR UN ALUMNO EN CONCRETO: ");
       obx1.buscarAlumno("Xabier");
       // para mostrar unicamente los aprobados
        System.out.println("\n APROBADOS : ");
       obx1.mostrarAprobados();
       // para ordenar en orden creciente
       System.out.println("\n Ordenar en orden creciente : ");
       obx1.ordenar();
      // buscar alumno por teclado
      Scanner sc = new Scanner(System.in);
      String nombre;
        System.out.println("\n Introduce nombre de alumno que deseas saber la nota: ");
      nombre=sc.next();
      obx1.buscarAlumno(nombre);
    }
    
    
}
