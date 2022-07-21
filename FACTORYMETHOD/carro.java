package FACTORYMETHOD;

public class carro extends veiculos{
    public carro (String marca, Integer ano, String modelo){
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
    }
    @Override
    public String veiculo() {
        return "CARRO:marca-" + marca + ",ano-" + ano + ",modelo-" + modelo;
    }
    
}
