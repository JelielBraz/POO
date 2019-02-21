/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Quadrado {
    private int tamanho_lado;
    
    public Quadrado(int tam){
        this.tamanho_lado = tam;
    }
    
    public void mudarTamLado(int tam){
        this.tamanho_lado = tam;
    }
    
    public int getTamLado(){
        return this.tamanho_lado;
    }
    
    public double getArea(){

        return this.tamanho_lado * this.tamanho_lado;
    }


    
}
