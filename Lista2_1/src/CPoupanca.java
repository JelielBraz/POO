public class CPoupanca extends CCorrente {
    private
        double saldominimo;

    public CPoupanca(int num, double sal, String cli, double salmin) {
        super(num, sal, cli);
        this.saldominimo = salmin;
    }

    @Override
    public void debitar(double valor){

    }

    public double getSaldominimo(){
        return saldominimo;
    }
}
