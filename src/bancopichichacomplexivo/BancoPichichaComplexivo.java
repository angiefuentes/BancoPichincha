/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopichichacomplexivo;

import java.util.ArrayList;
import java.util.List;
import CuentasBancarias.Cliente;
import CuentasBancarias.CuentaAhorro;
import CuentasBancarias.CuentaCorriente;
import CuentasBancarias.CuentaJoven;


/**
 *
 * @author user
 */
public class BancoPichichaComplexivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaAhorro ca = new CuentaAhorro ("2206482169", "Angie" ,"Fuentes \n") {};
        
        CuentaCorriente cc = new CuentaCorriente ("2297546318"," Julio", "Chonillo \n");
        
        CuentaJoven cj = new CuentaJoven( "2209436872", "Romina","Narvaez \n");
        
        List<Cliente> listaCliente = new ArrayList<>();
        listaCliente.add(ca);
        
        listaCliente.add(cc);
        listaCliente.add(cj);
        
     
        System.out.print(listaCliente);
        
        
   
  
    }
    
}
