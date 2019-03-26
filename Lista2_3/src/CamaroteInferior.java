public class CamaroteInferior extends Vip{
    private String localzacao;

    public CamaroteInferior(double val, double adi, String loc) {
        super(val, adi);
        this.localzacao = loc;
    }

    public String getLocalzacao() {
        return localzacao;
    }


}
