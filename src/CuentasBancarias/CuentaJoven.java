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
public class CuentaJoven  extends Cliente{
    private double Saldo;

    public CuentaJoven() {
    }

    public CuentaJoven(String numCuenta, String nombre, String apellido) {
        super(numCuenta, nombre, apellido);
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    
    
    
    
    
    
}
