package PDP;

public class TM{
    public static void main(String[] args) {
        Usuario u1 = new TXT("francois",25,"caxias","CC7");
        Usuario u2 = new CSV("francois",25,"caxias","CC7");
        Usuario u3 = new PDF("francois",25,"caxias","CC7");
        Usuario u4 = new BINARIO("francois",25,"caxias","CC7");
        u1.templatemethod();
        u2.templatemethod();
        u3.templatemethod();
        u4.templatemethod();
    }
}
