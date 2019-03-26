import java.util.Date;

public class CInvestimento extends CCorrente{
    private
        int dia_investimento;
        int periodo;

    public CInvestimento(int num, double sal, Cliente cli, int dinv, int per){
        super(num, sal, cli);
        this.dia_investimento = dinv;
        this.periodo = per;
    }

    public void atualizar_saldo(){
        Date data = new Date();
        int dia = data.getDate();
        if (dia == this.dia_investimento){
            this.saldo = this.saldo + (this.saldo*0.003);
        }
    }

}
