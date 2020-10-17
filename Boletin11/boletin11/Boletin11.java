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
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public  static  final  void main ( String [ ] args )  {
        ClasseA a = new ClasseA();
        ClasseA b = new ClasseA(20);
        ClasseA c = new ClasseA(20,40);
        System.out.println("El objeto _a: _ contiene:" + a.getPrimari() + "," + a.getSecundari());
        System.out.println("El objeto _B: _ contiene:" + b.getPrimari() + "," + b.getSecundari());
        System.out.println("El objeto _c: _ contiene:" + c.getPrimari() + "," + c.getSecundari());
    }

    }
