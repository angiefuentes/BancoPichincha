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
public abstract class Cliente {
    
    private String numCuenta;
    private String nombre;
    private String apellido;
    

    public Cliente() {
    }

    public Cliente(String numCuenta, String nombre, String apellido) {
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    
    
    @Override
           
     public String toString() {
         return "Cliente{" + "numCuenta=" + numCuenta + ", "
                 + "nombre=" + nombre +", "
                 + "apellido="+ apellido+ '}';
         
     }
    
}
