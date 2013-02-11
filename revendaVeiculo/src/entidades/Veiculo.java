package entidades;
// Generated 23/01/2013 14:28:34 by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Veiculo generated by hbm2java
 */
public class Veiculo implements java.io.Serializable {
    
    private Integer idVeiculo;
    private Compra compra;
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private String status;
    private String valor;
    private String combustivel;
    private Integer km;
    private String tipo;
    private Set motos = new HashSet(0);
    private Set carros = new HashSet(0);

    public Veiculo() {}

    public Veiculo(Compra compra, String marca) {
        this.compra = compra;
        this.marca = marca;
    }
    
    public Veiculo(Compra compra, String marca, String cor, String valor, Integer km, String tipo, Set motos, Set carros) {
        this.compra = compra;
        this.marca = marca;
        this.cor = cor;
        this.valor = valor;
        this.km = km;
        this.tipo = tipo;
        this.motos = motos;
        this.carros = carros;
    }
   
    public Integer getIdVeiculo() {
        return idVeiculo;
    }
    
    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }
    
    public Compra getCompra() {
        return compra;
    }
    
    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getValor() {
        return valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public Integer getKm() {
        return km;
    }
    
    public void setKm(Integer km) {
        this.km = km;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Set getMotos() {
        return motos;
    }
    
    public void setMotos(Set motos) {
        this.motos = motos;
    }
    
    public Set getCarros() {
        return carros;
    }
    
    public void setCarros(Set carros) {
        this.carros = carros;
    }
}