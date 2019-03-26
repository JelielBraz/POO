public class Rica extends Pessoa {
    private double dinheiro;


    public Rica(String name, int age, double money) {
        super(name, age);
        this.dinheiro = money;
    }

    public void fazCompras(){
        System.out.println("O rico ta fazendo compras");
    }
}
