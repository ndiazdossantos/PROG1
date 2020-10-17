/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa9;

/**
 *
 * @author noese
 */
public class Secretario extends Empregado {
    
private String numFax;
private boolean tenDespacho;

    public Secretario(String numFax, boolean tenDespacho) {
        this.numFax = numFax;
        this.tenDespacho = tenDespacho;
    }

    public Secretario(String numFax, boolean tenDespacho, String nome, String apelidos, String DNI, String direccion, int antiguedad, String telf) {
        super(nome, apelidos, DNI, direccion, antiguedad, telf);
        this.numFax = numFax;
        this.tenDespacho = tenDespacho;
    }

    public String getNumFax() {
        return numFax;
    }

    public void setNumFax(String numFax) {
        this.numFax = numFax;
    }

    public boolean isTenDespacho() {
        return tenDespacho;
    }

    public void setTenDespacho(boolean tenDespacho) {
        this.tenDespacho = tenDespacho;
    }

    @Override
    public String imprimir() {
        return "Secretario{" + "numFax=" + numFax + ", tenDespacho=" + tenDespacho + '}';
    }

    @Override
    public void incrementarSalario() {
        int salario = (int) super.getSalario();
        super.setSalario((int) (salario*1.05)); //To change body of generated methods, choose Tools | Templates.
    }

   



}
