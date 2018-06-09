/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentasBancarias;

/**
 *
 * @author user
 */
public  class CuentaAhorro extends Cliente {
    
    private double Saldo;
    private double interes;

    public CuentaAhorro() {
       
    }        

    public CuentaAhorro(String numCuenta, String nombre, String apellido) {
        super(numCuenta, nombre, apellido);
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    
     
    


   
    
     
    
    
    
}
