/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotubemovie;

/**
 *
 * @author jefferson
 */
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experience;
    
    //Metado construtor
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experience = 0;
    }
    
    //Metados
    protected abstract void ganharExperience();
    
    
    //Gettars e Settars
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Pessoa " + "nome : " + nome + ", idade : " + idade + ", sexo : " + sexo + ", experience : " + experience;
    }
    
    
}
