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
public class Empregado {
    
    private String nome;
    private String apelidos;
    private String DNI;
    private String direccion;
    private int antiguedad;
    private String telf;
    private Empregado supervisor;
    private float salario;
    public Empregado() {
    }

    public Empregado(String nome, String apelidos, String DNI, String direccion, int antiguedad, String telf) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.antiguedad = antiguedad;
        this.telf = telf;
        this.supervisor=supervisor;
        this.salario=salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    

    public String imprimir() {
        return "Empregado{" + "nome=" + nome + ", apelidos=" + apelidos + ", DNI=" + DNI + ", direccion=" + direccion + ", antiguedad=" + antiguedad + ", telf=" + telf + '}';
    }
    
    public void incrementarSalario(){
       
    }
    
   
}

