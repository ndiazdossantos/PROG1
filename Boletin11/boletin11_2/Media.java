/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_2;

/**
 *
 * @author noese
 */
public class Media {
  private String nom;
  private String autor;
  private int duradaSegons;
  
  public String getNom(){
      return nom;
  }
  public String getAutor(){
      return autor;
  }
  public int getDurada(){
      return duradaSegons;
  }
  public void setNom(String nom){
     this.nom=nom;
  }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuradaSegons(int duradaSegons) {
        this.duradaSegons = duradaSegons;
    }
  
  
  
}
