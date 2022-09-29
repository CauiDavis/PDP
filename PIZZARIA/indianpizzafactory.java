package PIZZARIA;

public class indianpizzafactory extends pizzafactory implements nonveganpizza,vegapizza{
    public void preparar(){
        System.out.println("PIZZARIA");
    }
    @Override
    public String pizzavegana() {
        return hanpizza();
    }

    @Override
    public String pizzanaovegana() {
       return deluxveggiepizza();
    }

    @Override
    public String deluxveggiepizza() {
        return "preparando deluxveggiepizza";
    }
    @Override
    public String chickenpizzaaditora() {
        return null;
    }
    @Override
    public String hanpizza() {
        return "preparando hanpizza";
    }
    @Override
    public String mexicamvegpizza() {
        return null;
    }  
}
