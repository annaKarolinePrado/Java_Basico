
package Model;

public class Categoria extends Padrao {
    private String status;
    
    public Categoria(int id, String nome, String status){
        super(id, nome);
        this.setStatus(status);        
    }
    
    public String getStatus(){
        return status;
    }    
    public void setStatus(String status){
        this.status = status;
    } 
    
}
