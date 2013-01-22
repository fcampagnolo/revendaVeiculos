package entidades;
// Generated 17/01/2013 12:55:44 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idCliente;
     private String nome;
     private String email;
     private String endereco;
     private String telefone;
     private Set compras = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(String nome) {
        this.nome = nome;
    }
    public Cliente(String nome, String email, String endereco, String telefone, Set compras) {
       this.nome = nome;
       this.email = email;
       this.endereco = endereco;
       this.telefone = telefone;
       this.compras = compras;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Set getCompras() {
        return this.compras;
    }
    
    public void setCompras(Set compras) {
        this.compras = compras;
    }




}

