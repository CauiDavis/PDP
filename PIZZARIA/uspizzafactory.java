package PIZZARIA;

public class uspizzafactory extends pizzafactory implements nonveganpizza,vegapizza{
    @Override
    public String pizzavegana() {
        return mexicamvegpizza();
    }
    @Override
    public String pizzanaovegana() {
        return chickenpizzaaditora();
    }

    @Override
    public String deluxveggiepizza() {
        return null;
    }
    @Override
    public String chickenpizzaaditora() {
        return "preparando chickenpizzaaditora";
    }
    @Override
    public String hanpizza() {
        return null;
    }
    @Override
    public String mexicamvegpizza() {
        return "preparando mexicamvegpizza";
    }
}
