
package Model;

abstract public class Padrao implements java.io.Serializable{
    private int id;
    private String nome;
    //Construtor
    public Padrao(){
        this.setId(0);
        this.setNome("default");
    }
    public Padrao(int id, String nome){
        this.setId(id);
        this.setNome(nome);
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome.trim().isEmpty()?"DEFAULT":nome.toUpperCase();
    }

    @Override
    public String toString() {
        return  nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
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
        final Padrao other = (Padrao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }   
}












