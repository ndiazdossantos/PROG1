/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_1;

/**
 *
 * @author noese
 */
public class Felino extends Mamifero implements IPodeNadar {

    @Override
    public void nadar() {
        System.out.println("Los felinos pueden nadar");
    }
    
}
