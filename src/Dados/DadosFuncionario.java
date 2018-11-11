
package Dados;

import Model.Funcionario;
import java.util.LinkedList;

abstract public class DadosFuncionario {
    
    private static LinkedList<Funcionario> listaFuncionarios = new LinkedList<>();
    
    public DadosFuncionario(){
        
    }    
    public static LinkedList<Funcionario> getFuncionario(){
        return listaFuncionarios;
    }
}
