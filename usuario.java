
public class usuario {
    private String Nome;
    private Integer Idade;
    private String Campus;
    private String Curso;

    public usuario (String Nome, Integer Idade, String Campus, String Curso) {
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
    public void setCampo(String Campus) {
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
    public String getCampo() {
        return Campus;
    }
    public String getCurso() {
        return Curso;
    }
}
