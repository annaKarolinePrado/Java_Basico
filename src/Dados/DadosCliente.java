
package Dados;

import Model.Cliente;
import java.util.LinkedList;

public class DadosCliente {
    private static LinkedList<Cliente> listaCliente = new LinkedList<>();
    
    public DadosCliente(){
        
    }
    
    public static LinkedList<Cliente> getCliente(){
        return listaCliente;
    }
}
