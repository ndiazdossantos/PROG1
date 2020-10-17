/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa9;

import java.util.ArrayList;

/**
 *
 * @author noese
 */
public class XefeZona extends Empregado {
    
  private String despacho="ten despacho";   
private ArrayList<String> listaVendedores;
private Coche coche;
private Secretario secretario;

    public XefeZona(ArrayList<String> listaVendedores, Coche coche, Secretario secretario, String nome, String apelidos, String DNI, String direccion, int antiguedad, String telf) {
        super(nome, apelidos, DNI, direccion, antiguedad, telf);
        this.listaVendedores = listaVendedores;
        this.coche = coche;
        this.secretario = secretario;
    }

    

    public XefeZona() {
    super();
    }

    @Override
    public String imprimir() {
        return "XefeDeZona " + "despacho=" + despacho + ", listaVendedores=" + listaVendedores + ", coche=" + coche + super.imprimir();
    }

    public void darDeAlta(ArrayList<String> listaVendedores,String vendedor){
    listaVendedores.add(vendedor);
    }

    public void darDeBaixa(ArrayList<String> listaVendedores,String vendedor){
        
        for (int i = 0; i < listaVendedores.size(); i++) {
        if (listaVendedores.get(i).equals(vendedor)){
        listaVendedores.remove(i);
        }
        }
    }

    @Override
    public void incrementarSalario() {
    int salario = (int) super.getSalario();
        super.setSalario((int)(salario*1.2));
    }
   
}
