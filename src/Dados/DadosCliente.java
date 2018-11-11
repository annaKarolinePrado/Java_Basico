
package Dados;

import Model.Cliente;
import java.util.LinkedList;

abstract public class DadosCliente {
    private static LinkedList<Cliente> listaCliente = new LinkedList<>();
    
    public DadosCliente(){
        
    }
    
    public static LinkedList<Cliente> getCliente(){
        return listaCliente;
    }
}
