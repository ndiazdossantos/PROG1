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
public class Metodos {
int aprobados;
int suspensos;
int media;
int maior;
String [] alumnos = new String[29];
    int[] notas = new int[29];
    

    public void crearArrays() {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 10 + 1);
        }
    }

    public void amosArrays() {
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
            if (notas[i] < 5) {
                System.out.println(notas[i] + " Esta suspenso");
                suspensos++;
            }else{
               System.out.println(notas[i]+" Esta aprobado");
            aprobados++;
            }
            }
        System.out.println("Hay "+aprobados+" aprobados y "+suspensos+" suspensos");
        System.out.println("La media es "+media/6);
        }
    public void notaMaior(){
      for(int i= 1;i<notas.length;i++){
          if(maior <notas[i]){
              maior=notas[i];
          }
      }
        System.out.println("La nota mayor es "+maior);
    }
    public void ordenar(){
        int aux;
        int aux2;
        String aux3;
        String aux4;
        for(int i=0;i<notas.length;i++){
        for(int j=0;j<notas.length;j++){
        if(notas[i]>notas[j]){
           aux=notas[i];
           aux2=notas[j];
           notas[i]=aux2;
           notas[j]=aux; 
           aux3=alumnos[i];
           aux4=alumnos[j];
          alumnos[i]=aux4;
          alumnos[j]=aux3;
        }
        }
        }
        for(int k=0;k<notas.length;k++)
          System.out.println(alumnos[k]+"  "+notas[k]);
        
    }
    public void insertarNombres(){
        String nom;
        alumnos[0]="Jose";
        alumnos[1]="Abelardo";
        alumnos[2]="Jose Luis";
        alumnos[3]="Daniel";
        alumnos[4]="Rubén";
        alumnos[5]="Pablo";
        alumnos[6]="Xabier";
        alumnos[7]="Noé";
        alumnos[8]="Adrián";
        alumnos[9]="Jaime";
        alumnos[10]="Guillermo";
        alumnos[11]="Alexandre";
        alumnos[12]="Carlos";
        alumnos[13]="Miguel";
        alumnos[14]="Victor";
        alumnos[15]="Adrián";
        alumnos[16]="Daniel";
        alumnos[17]="Iago";
        alumnos[18]="Geler";
        alumnos[19]="Samuel";
        alumnos[20]="Mauro";
        alumnos[21]="Xacobo";
        alumnos[22]="José";
        alumnos[23]="Iván";
        alumnos[24]="Leila";
        alumnos[25]="Samuel";
        alumnos[26]="Samuel Verde";
        alumnos[27]="Yago";
        alumnos[28]="Orlando";    
    }
    public void buscarAlumno(String nombre){
        for(int i=0;i<alumnos.length;i++){
            if(nombre.equals(alumnos[i])){
                System.out.println(nombre+"\t"+notas[i]);
            }
    }
    }
    public void mostrarAprobados(){
        int aprobado;
        for(int i=0;i<notas.length;i++){
            aprobado=notas[i];
            if(aprobado>=5)
                System.out.println(alumnos[i]+"   "+aprobado);
        }
            
    }
    public void elMenu(){
Scanner sc = new Scanner(System.in);
    System.out.println("1- Visualiza las notas de todos los alumnos \n"+
                       "2- Visualiza la mayor nota \n"+
                       "3- Visualiza la nota de un alumno en concreto alumno ( No funciona hacer manual ) \n" +
                       "4- Visualiza la nota de los alumnos aprobados \n" +
                       "5- Visualiza las notas de aprobados en orden creciente \n"+
                       "6-  Salir del programa  ");
int num = sc.nextInt();
switch (num){
    case 1:
        amosArrays();
        break;
    case 2:    
        notaMaior();
        break;
    case 3:
       // buscarAlumno();
        break;
    case 4:
        mostrarAprobados();
        break;
    case 5:
        ordenar();
        break;
    case 6:
        break;
        
    
}   
    
}
}

