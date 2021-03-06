package entidades;

import java.util.HashSet;
import java.util.Set;

public class Veiculo implements java.io.Serializable {
    
    private Integer idVeiculo;
    private String placa;
    private String modelo;
    private String marca;
    private String cor;
    private String status;
    private Double valor;
    private String combustivel;
    private Integer km;
    private String tipo;
    private Set motos = new HashSet(0);
    private Set carros = new HashSet(0);
    private Set compras = new HashSet(0);

    public Veiculo() {}

    public Veiculo(String placa, String modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }
    
    public Veiculo(String placa, String modelo, String marca, String cor, String status, Double valor, String combustivel, Integer km, String tipo, Set motos, Set carros, Set compras) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.status = status;
        this.valor = valor;
        this.combustivel = combustivel;
        this.km = km;
        this.tipo = tipo;
        this.motos = motos;
        this.carros = carros;
        this.compras = compras;
    }
    
    public Integer getIdVeiculo() {
        return this.idVeiculo;
    }
    
    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }
    
    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public Double getValor() {
        return this.valor;
    }
    
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public String getCombustivel() {
        return this.combustivel;
    }
    
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    
    public Integer getKm() {
        return this.km;
    }
    
    public void setKm(Integer km) {
        this.km = km;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Set getMotos() {
        return this.motos;
    }
    
    public void setMotos(Set motos) {
        this.motos = motos;
    }
    
    public Set getCarros() {
        return this.carros;
    }
    
    public void setCarros(Set carros) {
        this.carros = carros;
    }
    
    public Set getCompras() {
        return this.compras;
    }
    
    public void setCompras(Set compras) {
        this.compras = compras;
    }
}