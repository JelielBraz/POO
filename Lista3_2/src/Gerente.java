public class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome, salario);
    }


    @Override
    public void aumentaSalario() {
        double salario = getSalario();
        salario = salario + (salario * 0.2);
        setSalario(salario);
    }
}
