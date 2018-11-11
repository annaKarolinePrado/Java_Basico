
package Dados;

import Model.Locacao;
import java.util.LinkedList;

abstract public class DadosLocacao {
    private static LinkedList<Locacao> listaLocacao = new LinkedList<>();
    private static int periodo;

    public DadosLocacao (){
        
    }
    public static LinkedList<Locacao> getLocacao(){
        return listaLocacao;
    }
    
    public static int getPeriodo() {
        return periodo;
    }

    public static void setPeriodo(int periodo) {
        DadosLocacao.periodo = periodo;
    }
}
