package entidades;

public class Moto implements java.io.Serializable {
    
    private int idMoto;
    private Veiculo veiculo;
    private String caracteristicasMoto;

    public Moto() {}
    
    public Moto(int idMoto, Veiculo veiculo) {
        this.idMoto = idMoto;
        this.veiculo = veiculo;
    }
    
    public Moto(int idMoto, Veiculo veiculo, String caracteristicasMoto) {
        this.idMoto = idMoto;
        this.veiculo = veiculo;
        this.caracteristicasMoto = caracteristicasMoto;
    }
    
    public int getIdMoto() {
        return this.idMoto;
    }
    
    public void setIdMoto(int idMoto) {
        this.idMoto = idMoto;
    }
    
    public Veiculo getVeiculo() {
        return this.veiculo;
    }
    
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public String getCaracteristicasMoto() {
        return this.caracteristicasMoto;
    }
    
    public void setCaracteristicasMoto(String caracteristicasMoto) {
        this.caracteristicasMoto = caracteristicasMoto;
    }
}