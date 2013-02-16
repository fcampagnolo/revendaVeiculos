package entidades;

import java.util.HashSet;
import java.util.Set;

public class Vendedor implements java.io.Serializable {
    
    private Integer idVendedor;
    private String login;
    private String senha;
    private String nome;
    private String telefone;
    private Boolean adm;
    private String email;
    private Set compras = new HashSet(0);

    public Vendedor() {}

    public Vendedor(String login, String senha, String nome, String telefone) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public Vendedor(String login, String senha, String nome, String telefone, Boolean adm, String email, Set compras) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.telefone = telefone;
        this.adm = adm;
        this.email = email;
        this.compras = compras;
    }
    
    public Integer getIdVendedor() {
        return this.idVendedor;
    }
    
    public void setIdVendedor(Integer idVendedor) {
        this.idVendedor = idVendedor;
    }
    
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public Boolean getAdm() {
        return this.adm;
    }
    
    public void setAdm(Boolean adm) {
        this.adm = adm;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Set getCompras() {
        return this.compras;
    }
    
    public void setCompras(Set compras) {
        this.compras = compras;
    }
}