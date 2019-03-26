public class Chefe extends  Empregado{
    private
        double beneficio;

    public Chefe(int cod, String non, String mail, double sal, double bene) {
        super(cod, non, mail, sal);
        this.beneficio = bene;
    }

    @Override
    public void aumento_salarial(int percentual){
        double salario = getSalario();
        setSalario(salario + (salario * (((double) percentual / 100) + this.beneficio)));
    }
}
