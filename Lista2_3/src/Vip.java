public class Vip extends Ingresso {
    private
        double adicional;


    public Vip(double val, double adi) {
        super(val);
        this.adicional = adi;
    }

    @Override
    public double getValor(){
        double valor = this.getValor();
        return valor + adicional;
    }
}
