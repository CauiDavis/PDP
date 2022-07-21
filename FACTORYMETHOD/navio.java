package FACTORYMETHOD;

public class navio extends veiculos{
    public navio(String marca, Integer ano, String modelo){
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
    }
    @Override
    public String veiculo() {
        return "NAVIO:marca-" + marca + ",ano-" + ano + ",modelo-" + modelo;
    }
    
}
