/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author noese
 */
public class Conta {
    private String nomecliente;
    private String numeroconta;
    private double tipointerese;
    private double saldo;
    
    public Conta(){
        
    }
    
 public Conta(String nomec,String nuconta, double interes,double saldo){
     nomecliente=nomec;
     numeroconta=nuconta;
     tipointerese=interes;
     this.saldo=saldo;
     
 }   
 
 public void setNome(String nomec){
     nomecliente=nomec;
 }
    public void setNConta(String nuconta){
        numeroconta=nuconta;
    }
    public void setInteres(double interes){
        tipointerese=interes;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public String getNome(){
        return nomecliente;
    }
   public String getConta(){
       return numeroconta;
   }
   // metodo para mostrar los datos introducidos
   public void getDatos(){
       System.out.println("Nombre="+nomecliente+"\nConta="+numeroconta+"\nInterese="+tipointerese+"\nSaldo="+saldo);
   }
   public double getInteres(){
       return tipointerese;
   }
   public double getSaldo(){
       return saldo;
   }
   
   public void ingreso(double ingreso){
       saldo+=ingreso;
   }
   public void reintegro(double reintegro){
       saldo-=reintegro;
   }
   public void transferencia(Conta destino,double cantidad){
       reintegro(cantidad);
       destino.ingreso(cantidad);
   }
}
