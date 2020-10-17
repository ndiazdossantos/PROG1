/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Persoal {

    private int telefono;
    private String correo;

    public Persoal() {
    }

    public Persoal(int telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void pedirPersoal() {
        Scanner a = new Scanner(System.in);
        System.out.println("Introduce número de teléfono");
        telefono = a.nextInt();
        System.out.println("Introduce el correo");
        correo = a.next();

    }

    @Override
    public String toString() {
        return "Persoal{" + "telefono=" + telefono + ", correo=" + correo + '}';
    }

}
