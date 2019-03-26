public class Assistente extends Funcionario {
    private String matricula;

    public Assistente(String name, String end, String tel, String mail, String mat) {
        super(name, end, tel, mail);
        this.matricula = mat;
    }

    public String getMatricula(){
        return this.matricula;
    }
}
