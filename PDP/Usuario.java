package PDP;

abstract class Usuario {
    protected String Nome;
    protected Integer Idade;
    protected String Campus;
    protected String Curso;
    
    public Usuario(){
    }
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
