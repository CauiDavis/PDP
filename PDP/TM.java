package PDP;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TM{
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.setNome("francois");
        u1.setIdade(25);
        u1.setCampus("caxias");
        u1.setCurso("CC7");
        System.out.println(u1);
        File arquivo = new File ("arquivo.txt");
        try {
            arquivo.createNewFile();
            FileWriter fileWriter = new FileWriter(arquivo,false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Nome: " + u1.getNome());
            printWriter.println("Idade: " + u1.getIdade());
            printWriter.println("Campus: " + u1.getCampus());
            printWriter.println("Curso: " + u1.getCurso());
            printWriter.flush();
            printWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
