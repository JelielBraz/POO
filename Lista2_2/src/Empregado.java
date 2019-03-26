public class Empregado {
    private int codigo;
    private String nome;
    private String email;
    private double salario;


    public Empregado(int cod, String non, String mail, double sal){
        this.codigo = cod;
        this.nome = non;
        this.email = mail;
        this.salario = sal;
    }

    public double getSalario(){
        return this.salario;
    }

    public void aumento_salarial(int percentual){
        this.salario = this.salario + (this.salario * (double) (percentual/100));
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
