/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

/**
 *
 * @author noese
 */
public class Conta {
    private String nomeCliente;
    private String numeroConta;
    private float tipoInterese;
    private float saldo;

    public Conta() {
    }

    public Conta(String nomeCliente, String numeroConta, float tipoInterese, float saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.tipoInterese = tipoInterese;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public float getTipoInterese() {
        return tipoInterese;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTipoInterese(float tipoInterese) {
        this.tipoInterese = tipoInterese;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void ingreso(float dinero){
        if(dinero>0)
            saldo+=dinero;
        else
            System.out.println("La cantidad debe ser positiva ");
    }
    public void reintegro(float dinero){
        if(dinero>0)
            saldo-=(dinero);
        else
            System.out.println("La cantidad debe ser positiva ");
    }
     
    public void transferencia(Conta destinatario,float cantidad){
        if (cantidad>0){
            reintegro(cantidad);
            destinatario.setSaldo(destinatario.getSaldo()+ cantidad);
        }
        else
            System.out.println("La cantidad debe ser positiva ");
            
        }
    
    public void amosar(){
        System.out.println("El nombre del cliente es : "+nomeCliente+"\n El numero de cuenta es : "+numeroConta+"\n El tipo de interés es : "+tipoInterese+"\n El saldo es "+ saldo);
    }
  
}
