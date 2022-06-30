import java.util.*;


public class TM{
    public class usuario {
        public String Nome;
        public Integer Idade;
        public String Campus;
        public String Curso;
    
        public usuario (String Nome, Integer Idade, String Campus, String Curso) {
            this.Nome = Nome;
            this.Idade = Idade;
            this.Campus = Campus;
            this.Curso = Curso;
        }
    }
    
    public static void main(String[] args) {
        usuario u1 = new usuario();
    }
}
