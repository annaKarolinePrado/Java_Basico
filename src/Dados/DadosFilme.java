
package Dados;

import Model.Filme;
import java.util.LinkedList;

public class DadosFilme {
    private static LinkedList<Filme> listaFilme = new LinkedList<>();
    
    public DadosFilme(){
        
    }
    
    public static LinkedList<Filme> getFilme(){
        return listaFilme;
    }
}
