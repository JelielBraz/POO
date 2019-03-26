public class Estagiario extends Empregado {
    private
        double descontos;


    public Estagiario(int cod, String non, String mail, double sal, double des) {
        super(cod, non, mail, sal);
        this.descontos = des;
    }

    @Override
    public void aumento_salarial(int percentual){
        this.salario = this.salario + this.salario*( (double) percentual/100 - this.descontos);
    }
}
