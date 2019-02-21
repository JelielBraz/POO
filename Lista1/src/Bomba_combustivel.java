public class Bomba_combustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public Bomba_combustivel(String tipo, double valor, double qtd){
        this.tipoCombustivel = tipo;
        this.quantidadeCombustivel = qtd;
        this.valorLitro = valor;
    }

    public String abastecerValor(double dinheiro){
        double litros;
        litros =  dinheiro/this.valorLitro;

        if (retirarQuantidadeCombustivel(litros)){
            return ("Abastecimento concluido, você abasteceu: " + litros + " litros");
        }else{
            return ("Não pode ocorrer o abastecimento, quantidade de combustivel insuficiente para realizar está ação.");
        }
    }

    public String abastecerLitro(double litros){
        double valor;
        valor = valorLitro * litros;
        if (retirarQuantidadeCombustivel(litros)){
            return ("Abastecimento concluido, você abasteceu: R$" + valor);
        }else{
            return ("Não pode ocorrer o abastecimento, quantidade de combustivel insuficiente para realizar está ação.");
        }
    }

    public void alteraValor(double novo_valor){
        this.valorLitro = novo_valor;
    }

    public void alterarCombustivel(String combustivel){
        this.tipoCombustivel = combustivel;
    }

    public void adiconarQuantidadeCombustivel(double qtd){
        this.quantidadeCombustivel = this.quantidadeCombustivel + qtd;
    }

    private boolean retirarQuantidadeCombustivel(double qtd){
        if (qtd > this.quantidadeCombustivel) {
            return false;
        }else {
            this.quantidadeCombustivel = this.quantidadeCombustivel - qtd;
            return true;
        }
    }
}
