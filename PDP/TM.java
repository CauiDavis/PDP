package PDP;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TM{
    public static void main(String[] args) {
        Usuario u1 = new TXT("francois",25,"caxias","CC7");
        Usuario u2 = new CSV("francois",25,"caxias","CC7");
        System.out.println(u1);
        u1.templatemethod();
        u2.templatemethod();
    }
}
