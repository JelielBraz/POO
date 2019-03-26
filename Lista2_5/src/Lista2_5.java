public class Lista2_5 {
    public static void main(String[] args) {
        Gato negao = new Gato("Negão", "gato");
        Cachorro baby = new Cachorro("Baby", "baleia");

        baby.latir();
        baby.caminhar();
        negao.miar();
        negao.caminhar();
    }
}
