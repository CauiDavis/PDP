package FACTORYMETHOD;

public class moto extends veiculos{
    public moto(String marca, Integer ano, String modelo){
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
    }
    @Override
    public String veiculo() {
        return "MOTO:marca-" + marca + ",ano-" + ano + ",modelo-" + modelo;
    }
    
}
