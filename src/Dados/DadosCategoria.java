
package Dados;

import Model.Categoria;
import java.util.LinkedList;

abstract public class DadosCategoria {
    private static LinkedList<Categoria> listaCategoria = new LinkedList<>();
    
    public DadosCategoria(){
        
    }
           
    public static LinkedList<Categoria> getCategoria(){
        return listaCategoria;
    }
}
