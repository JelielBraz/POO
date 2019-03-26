public class Lista2_4 {
    public static void main(String[] args) {
        Administrativo ze = new Administrativo("josé", "rua da contabilidade, 171", "98745632", "jose@example.com", "0171", "dia");
        Tecnico jao = new Tecnico("João", "rua da tecnologia 0101", "12345678", "joao@example.com", "01010111", 50);
        System.out.println(ze.getMatricula());
        System.out.println(ze.getNome());
        System.out.println(jao.getMatricula());
        System.out.println(jao.getNome());
    }
}
