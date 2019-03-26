public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String name, double Sala) {
        this.nome = name;
        this.salario = Sala;
    }

    public abstract void aumentaSalario();

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

}