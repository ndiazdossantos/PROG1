/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_2;

/**
 *
 * @author noese
 */
public class Metodos {
int aprobados;
int suspensos;
int media;
int maior;
int aux;
    int[] notas = new int[6];

    public void crearArrays() {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 10 + 1);
        }
    }

    public void amosArrayAs() {
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
        for(int i=0;i<notas.length-1;i++){
        for(int j=i++;j<notas.length;j++){
        if(notas[i]>notas[j])
            aux=notas[i];
        notas[i]=notas[j];
        notas[j]=aux;
          
            System.out.println(aux);
        }
    }
    }
    }

