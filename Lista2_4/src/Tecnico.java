public class Tecnico extends Assistente {
    private double bonus;

    public Tecnico(String name, String end, String tel, String mail, String mat, double bon) {
        super(name, end, tel, mail, mat);
        this.bonus = bon;
    }
}
