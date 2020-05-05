/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetospessoas;

/**
 *
 * @author jefferson
 */
public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;
    private int porcAumento;
    
    //Metados
    
    public void receberAumento(int percentual){
        int totSal = 0;
        porcAumento = percentual;
        totSal = (int) (salario * porcAumento /100);
        salario = salario + totSal;
    }
    
    public String getEspecialidade(){
        return especialidade;
    }
    
    public void setEspecialidade(String especia){
        this.especialidade = especia;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float sal){
        this.salario = sal;
    }
    
    public int getPorcAumento(){
        return porcAumento;
    }
    
    public void setPorcAumento(int percAumento){
        this.porcAumento = percAumento;
    }
    
}
