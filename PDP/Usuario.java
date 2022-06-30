package PDP;

public class Usuario {
    private String Nome;
    private Integer Idade;
    private String Campus;
    private String Curso;

    public Usuario (String Nome, Integer Idade, String Campus, String Curso) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Campus = Campus;
        this.Curso = Curso;
    }
    public String armazenar(){
        return "Nome:"+ this.Nome + "idade:"+ this.Idade + "Campus:"+ this.Campus + "Curso:"+ this.Curso;
    }
}
