public class Administrativo extends Assistente {
    private String turno;

    public Administrativo(String name, String end, String tel, String mail, String mat, String tur) {
        super(name, end, tel, mail, mat);
        this.turno = tur;
    }
}
