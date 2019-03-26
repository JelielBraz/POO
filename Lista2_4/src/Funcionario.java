public class Funcionario {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public Funcionario(String name, String end, String tel, String mail){
        this.nome = name;
        this.endereco = end;
        this.telefone = tel;
        this.email = mail;
    }

    public String getNome() {
        return nome;
    }
}
