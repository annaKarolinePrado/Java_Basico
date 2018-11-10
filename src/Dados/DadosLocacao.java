
package Dados;

import Model.Locacao;
import java.util.LinkedList;

public class DadosLocacao {
    private static LinkedList<Locacao> listaLocacao = new LinkedList<>();
    
    public DadosLocacao (){
        
    }
    public static LinkedList<Locacao> getLocacao(){
        return listaLocacao;
    }
}
