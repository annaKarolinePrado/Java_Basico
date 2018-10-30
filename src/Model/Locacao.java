
package Model;

public class Locacao  {
    private int id;
    private String data_locacao;
    private String data_entrega;
    private String status;
    private double valor;
    private Funcionarios funcionario;
    private Cliente cliente;
    
    public Locacao(int id, String data_locacao, String data_entrega, String status, double valor, Funcionarios funcionarios, Cliente cliente){
        
        this.setId(id);
        this.setData_locacao(data_locacao);
        this.setData_entrega(data_entrega);
        this.setStatus(status);
        this.setValor(valor);
        this.setFuncionario(funcionario);
        this.setCliente(cliente);
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
    
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public Funcionarios getFuncionario(){
        return funcionario;
    }
    public void setFuncionario(Funcionarios funcionario){
        this.funcionario = funcionario;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
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
