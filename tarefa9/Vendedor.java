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
public class Vendedor extends Empregado {
   
    private Coche coche;
    private String telfMovil;
    private String areaVentas;
    private ArrayList<String>listaClientes;
    private int comision;

    public Vendedor(){
        super();
    }
    
    public Vendedor(Coche coche, String telfMovil, String areaVentas, ArrayList<String> listaClientes, int comision, String nome, String apelidos, String DNI, String direccion, int antiguedad, String telf) {
        super(nome, apelidos, DNI, direccion, antiguedad, telf);
        this.coche = coche;
        this.telfMovil = telfMovil;
        this.areaVentas = areaVentas;
        this.listaClientes = listaClientes;
        this.comision = comision;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public String getTelfMovil() {
        return telfMovil;
    }

    public void setTelfMovil(String telfMovil) {
        this.telfMovil = telfMovil;
    }

    public String getAreaVentas() {
        return areaVentas;
    }

    public void setAreaVentas(String areaVentas) {
        this.areaVentas = areaVentas;
    }

    public ArrayList<String> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<String> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
    
    public void darAlta(ArrayList<String>listaClientes,String cliente){
        listaClientes.add(cliente);
    }
    
    public void darBaixa(ArrayList<String>listaClientes,String cliente){
        
       for(int i=0; 1< listaClientes.size(); i++){
        if(listaClientes.get(i).equals(cliente)){
            listaClientes.remove(i);
        }
    }
    }

    @Override
    public void incrementarSalario() {
        int salario = (int) super.getSalario();
        super.setSalario((int) (salario*1.10)); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
