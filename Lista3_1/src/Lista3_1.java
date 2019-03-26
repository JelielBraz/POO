public class Lista3_1 {
    public static void main(String[] args){
        Cliente cli1 = new Cliente("Jeliel", "111.111.111-00");
        Cliente cli2 = new Cliente("Evelyn", "222.222.222-00");
        Cliente cli3 = new Cliente("José", "333.333.333-00");
        Cliente cli4 = new Cliente("João", "444.444.444-00");
        Cliente cli5 = new Cliente("Carol", "555.555.555-00");

        CCorrente conta1 = new CCorrente(1, 1000, cli1);

        CCorrente conta2 = new CCorrente(2, 2000, cli2);
        CCorrente conta3 = new CPoupanca(3, 1000, cli2, 100);

        CCorrente conta4 = new CEspecial(4, 1000, cli3, 5000);
        CCorrente conta5 = new CInvestimento(5, 1000, cli3, 15, 24);

        CCorrente conta6 = new CInvestimento(6, 1000, cli4, 15, 48);

        System.out.println(CCorrente.toString());

    }
}
