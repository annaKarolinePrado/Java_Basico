
package Model;

public class Filme extends Padrao {
    private String descricao;
    private String data_lanc;
    private int quantidade;
    private Categoria categoria;
    
    public Filme(int id, String nome, String descricao, String data_lanc, int quantidade, Categoria categoria){
        super (id, nome);
        this.setDescricao(descricao);
        this.setData_lanc(data_lanc);
        this.setQuantidade(quantidade);
        this.setCategoria(categoria);
    }
    
    public String getDescricao(){
        return descricao;
    }    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getData_lanc(){
        return data_lanc;
    }
    public void setData_lanc(String data_lanc){
        this.data_lanc = data_lanc;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public Categoria getCategoria(){
        return categoria;
    }
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }
}
