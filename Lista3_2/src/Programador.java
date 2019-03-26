public class Programador extends Funcionario{
    public Programador(String nome, double salario){
        super(nome, salario);
    }


    @Override
    public void aumentaSalario() {
        double salario = getSalario();
        salario = salario + (salario * 0.2);
        setSalario(salario);
    }
}
