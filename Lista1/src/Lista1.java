public class Lista1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Exercício 1 - Classe bola");

        Bola bolinha = new Bola("vermelho", 20, "titanio");
        System.out.println(bolinha.mostrarCor());
        bolinha.trocarCor("verde");
        System.out.println(bolinha.mostrarCor());

        System.out.println("---------------------------");

        System.out.println("Exercício 2 - Classe quadrado");

        Quadrado quadradinho = new Quadrado(5);
        System.out.println("Atualmente o tamanho do lado é de: " + quadradinho.getTamLado());
        quadradinho.mudarTamLado(4);
        System.out.println("Atualmente o tamanho do lado é de: " + quadradinho.getTamLado());
        System.out.println("A área deste quadrado é de: " + quadradinho.getArea()
        );

        System.out.println("---------------------------");


        System.out.println("Exercício 3 - Classe Pessoa");

        Pessoa ze = new Pessoa("José da Silva", 53, 89, (float) 1.76);
        ze.Envelhecer();
        ze.crescer(0.2);
        ze.emagrecer(5.75);
        ze.engordar(27.3);
        System.out.println("A idade é de: " + ze.getIdade());
        System.out.println("O nome é:" + ze.getNome());
        System.out.println("A altura é: " + ze.getAltura());
        System.out.println("A altura é: " + ze.getPeso());

        System.out.println("---------------------------");


        System.out.println("Exercício 4 - Classe TV");
        TV televisao = new TV(5, 25);
        System.out.println("O volume atual é de: " + televisao.getVolume());
        televisao.aumentarVolume();
        televisao.aumentarVolume();
        televisao.diminuirVolume();
        System.out.println("O volume atual é de: " + televisao.getVolume());
        System.out.println("O canal atual é: " + televisao.getCanal());
        televisao.mudarCanal(13);
        System.out.println("O canal atual é: " + televisao.getCanal());


        System.out.println("---------------------------");

        System.out.println("Exercício 5 - Bichinho Virtual");

        Bichinho_virtual tamagushi = new Bichinho_virtual("Jão", 95, 10, 0);

        System.out.println("O nome do tamagushi é: " + tamagushi.getNome());
        tamagushi.alterarNome("Alejandro");
        System.out.println("O nome do tamagushi é: " + tamagushi.getNome());

        System.out.println("A idade do tamagushi é: " + tamagushi.getIdade());
        tamagushi.alterarIdade();
        System.out.println("A idade do tamagushi é: " + tamagushi.getIdade());

        System.out.println("A porcentagem de doença do tamgushi é:" + tamagushi.getDoenca());
        tamagushi.alterarDoenca(45);
        System.out.println("A a porcentagem de doença do tamagushi é:" + tamagushi.getDoenca());

        System.out.println("A quantidade de fome do tamagushi é de: " + tamagushi.getFome());
        tamagushi.alterarFome(25);
        System.out.println("A quantidade de fome do tamagushi é de: " + tamagushi.getFome());

        System.out.println("O humor do tamagushi é de: " + tamagushi.humor());
        System.out.println("---------------------------");


        System.out.println("Exercício 6 - Bomba de Combustivel");
        Bomba_combustivel posto_java = new Bomba_combustivel("gasolina", 3.89, 2000);
        System.out.println(posto_java.abastecerLitro(25));
        System.out.println(posto_java.abastecerValor(50));
        posto_java.alteraValor(3.88);
        posto_java.adiconarQuantidadeCombustivel(5);
        System.out.println(posto_java.abastecerLitro(100000));
        System.out.println("---------------------------");

    }
}