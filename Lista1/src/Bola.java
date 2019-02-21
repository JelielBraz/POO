/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Bola {
    private String cor;
    private int circunferencia;
    private String material;
        
    public Bola (String c, int circ, String mat){
        this.cor = c;
        this.circunferencia = circ;
        this.material = mat;
    }
    
    public void trocarCor(String nova_cor){
        this.cor = nova_cor;
    }
    
    public String mostrarCor(){
        return this.cor;
    }
}


