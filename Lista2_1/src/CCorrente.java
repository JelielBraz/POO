public abstract class CCorrente {
    private
        int numero;
        double saldo;
        String cliente;

    public CCorrente(int num, double sal, String cli) {
        this.numero = num;
        this.saldo = sal;
        this.cliente = cli;
    }

    public void creditar(float valor){
        this.saldo = this.saldo + valor;
    }

    public void debitar(float valor){
        if (valor > saldo){
            System.out.println("Valor insuficiente");
        }else{
            this.saldo = this.saldo - valor;
        }
    }

    public double get_saldo(){
        return this.saldo;
    }

    public abstract void debitar(double valor);
}
