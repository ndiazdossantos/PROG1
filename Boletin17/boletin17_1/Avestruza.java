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
public class Avestruza extends Aves implements IPodeCaminar{

    @Override
    public void camiñar() {
        System.out.println("La avestruza solo puede caminar");
    }
    
}
