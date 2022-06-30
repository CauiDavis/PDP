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
    @Override
    public String toString(){
        return "\nNome: "+ Nome + "\nidade: "+ Idade + "\nCampus: "+ Campus + "\nCurso: "+ Curso;
    }
}
