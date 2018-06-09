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
public class CuentaCorriente extends Cliente{
    
    private double saldo; 

    public CuentaCorriente() {
    }

    public CuentaCorriente(String numCuenta, String nombre, String apellido) {
        super(numCuenta, nombre, apellido);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    

   

   
    
    
    
    
}
