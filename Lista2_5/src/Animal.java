public class Animal {
    private String nome;
    private String raca;

    public Animal(String n, String r){
        this.nome = n;
        this.raca = r;
    }


    public Animal(){

    }

    public void caminhar(){
        System.out.println("O animal está andando");
    }
}
