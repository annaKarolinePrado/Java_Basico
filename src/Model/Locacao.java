
package Model;

public class Locacao  {
    private int id;
    private String data_locacao;
    private String data_entrega;
    private boolean status;
    private double valor;
    private Funcionario funcionario;
    private Cliente cliente;
    private Filme filme;

    
    
    public Locacao(){
        
    }
    
    public Locacao(int id, String data_locacao, String data_entrega, boolean status, double valor,
                    Funcionario funcionario, Cliente cliente, Filme filme){        
        this.setId(id);
        this.setData_locacao(data_locacao);
        this.setData_entrega(data_entrega);
        this.setStatus(status);
        this.setValor(valor);
        this.setFuncionario(funcionario);
        this.setCliente(cliente);
        this.setFilme(filme);
    }   
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getData_locacao(){
        return data_locacao;
    }
    public void setData_locacao(String data_locacao){
        this.data_locacao = data_locacao;
    }
    
    public String getData_entrega(){
        return data_entrega;
    }
    public void setData_entrega(String data_entrega){
       this.data_entrega = data_entrega;
    }
    
    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public Funcionario getFuncionario(){
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario){
        this.funcionario = funcionario;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Locacao other = (Locacao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
}
