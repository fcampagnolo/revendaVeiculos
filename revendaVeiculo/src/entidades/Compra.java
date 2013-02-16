package entidades;

import java.util.Date;

public class Compra implements java.io.Serializable {
    
    private Integer idCompra;
    private Vendedor vendedor;
    private Veiculo veiculo;
    private Cliente cliente;
    private Date data;
    private double total;

    public Compra() {}

    public Compra(Vendedor vendedor, Veiculo veiculo, Cliente cliente, Date data, double total) {
        this.vendedor = vendedor;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.data = data;
        this.total = total;
    }
    
    public Integer getIdCompra() {
        return this.idCompra;
    }
    
    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }
    
    public Vendedor getVendedor() {
        return this.vendedor;
    }
    
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public Veiculo getVeiculo() {
        return this.veiculo;
    }
    
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    
    public double getTotal() {
        return this.total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }
}