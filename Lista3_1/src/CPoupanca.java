public class CPoupanca extends CCorrente {
    private
        double saldominimo;

    public CPoupanca(int num, double sal, Cliente cli, double salmin) {
        super(num, sal, cli);
        this.saldominimo = salmin;
    }


    @Override
    public void debitar(double valor){
        if ((valor > this.saldo) || (saldominimo > (this.saldo - valor))){
            System.out.println("saldo insuficiente para realizar essa operação");
        }else{
            this.saldo = saldo - valor;
        }
    }

    public void atualizar_saldo(){
        this.saldo = (float) (this.saldo + (this.saldominimo * 0.02));
        this.saldominimo = this.saldo;

    }

    public double get_saldominimo(){
        return saldominimo;
    }
}
