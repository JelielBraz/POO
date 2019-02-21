public class CEspecial extends CCorrente {
    private
        double limite;

    public CEspecial(int num, double sal, String cli, double lim){
        super(num, sal, cli);
        this.limite = lim;
    }

    @Override
    public void debitar(float val) {
        if (val > (this.saldo + this.limite)){
            System.out.println("Saldo insuficiente");
        }else{
            this.saldo = this.saldo - val;
        }
    }
}
