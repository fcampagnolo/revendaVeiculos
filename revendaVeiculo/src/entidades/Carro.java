package entidades;
// Generated 23/01/2013 14:28:34 by Hibernate Tools 3.2.1.GA



/**
 * Carro generated by hbm2java
 */
public class Carro  implements java.io.Serializable {


     private int idCarro;
     private Veiculo veiculo;
     private String caracteristicasCarro;

    public Carro() {
    }

	
    public Carro(int idCarro, Veiculo veiculo) {
        this.idCarro = idCarro;
        this.veiculo = veiculo;
    }
    public Carro(int idCarro, Veiculo veiculo, String caracteristicasCarro) {
       this.idCarro = idCarro;
       this.veiculo = veiculo;
       this.caracteristicasCarro = caracteristicasCarro;
    }
   
    public int getIdCarro() {
        return this.idCarro;
    }
    
    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }
    public Veiculo getVeiculo() {
        return this.veiculo;
    }
    
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public String getCaracteristicasCarro() {
        return this.caracteristicasCarro;
    }
    
    public void setCaracteristicasCarro(String caracteristicasCarro) {
        this.caracteristicasCarro = caracteristicasCarro;
    }




}


