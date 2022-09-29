package TEMPLATEMETHOD;

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

    public void templatemethod(){
        armazenar();
    }

    public abstract void armazenar();
}
