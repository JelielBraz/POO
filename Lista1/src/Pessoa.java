/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    
    public Pessoa (String n, int i, float p, float a){
        this.nome = n;
        this.idade = i;
        this.peso = p;
        this.altura = a;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double getPeso(){
        return this.peso;
    }

    public double getAltura(){
        return this.altura;
    }

    public void Envelhecer(){
        this.idade = this.idade + 1;
        
        if (this.idade <= 21){
            crescer(0.005);
        }
    }
    
    public void engordar(double kg){

        this.peso = this.peso + kg;
    }
    
    public void emagrecer(double kg){

        this.peso = this.peso - kg;
    }
    
    public void crescer(double tam){

        this.altura = this.altura + tam;
    }      
}
