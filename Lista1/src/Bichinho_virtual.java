public class Bichinho_virtual {
    private String nome;
    private int fome;
    private int doenca;
    private int idade;


    public Bichinho_virtual(String n, int f, int d, int i){
        this.nome = n;
        this.fome = f;
        this.doenca = d;
        this.idade = i;
    }

    public void alterarNome(String novo_nome){
        this.nome = novo_nome;
    }

    public void alterarFome(int nova_fome){
        this.fome = nova_fome;
    }

    public void alterarDoenca(int nova_doenca){
        this.doenca = nova_doenca;
    }
    public void alterarIdade(){
        this.idade = this.idade + 1;
    }

    public String getNome(){
        return this.nome;
    }

    public int getFome(){
        return this.fome;
    }

    public int getDoenca(){
        return this.doenca;
    }

    public int getIdade(){
        return this.idade;
    }

    public double humor(){
        double humor;
        humor = (this.fome + this.doenca)/2;
        return humor;
    }
}
