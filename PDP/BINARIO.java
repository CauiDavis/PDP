package PDP;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BINARIO extends Usuario{
    BINARIO(String Nome, Integer Idade, String Campus, String Curso){
        super( Nome, Idade, Campus, Curso);
    }
    @Override
    public void armazenar() {
        try {
            File arquivo = new File ("arquivobin.bin");
            arquivo.createNewFile();
            FileWriter fileWriter = new FileWriter(arquivo,false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Nome: " + Nome);
            printWriter.println("Idade: " + Idade);
            printWriter.println("Campus: " + Campus);
            printWriter.println("Curso: " + Curso);
            printWriter.flush();
            printWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
