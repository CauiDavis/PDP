package PDP;

public class Usuario {
    private String Nome;
    private Integer Idade;
    private String Campus;
    private String Curso;

    public Usuario(){
    }
    public Usuario (String Nome, Integer Idade, String Campus, String Curso) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Campus = Campus;
        this.Curso = Curso;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public void setIdade(Integer Idade) {
        this.Idade = Idade;
    }
    public void setCampus(String Campus) {
        this.Campus = Campus;
    }
    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    public String getNome() {
        return Nome;
    }
    public Integer getIdade() {
        return Idade;
    }
    public String getCampus() {
        return Campus;
    }
    public String getCurso() {
        return Curso;
    }
    @Override
    public String toString(){
        return "\nNome: "+ Nome + "\nidade: "+ Idade + "\nCampus: "+ Campus + "\nCurso: "+ Curso;
    }
    
}
