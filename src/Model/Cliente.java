
package Model;

public class Cliente extends Padrao {
    private String cpf;
    private String data_nasc;
    private String telefone;
    private String email;
    private String endereco;
    
    public Cliente(){
        
    }
    
    public Cliente(int id, String nome, String cpf, String data_nasc, String telefone, String email, String endereco){
        super(id, nome);
        this.setCpf(cpf);
        this.setData_nasc(data_nasc);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setEndereco(endereco);
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getData_nasc(){
        return data_nasc;
    }
    
    public void setData_nasc(String data_nasc){
        this.data_nasc = data_nasc;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}













