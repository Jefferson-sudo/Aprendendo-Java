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
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    //Metados
    public void fazerAniver(){
        this.setIdade(1);
    }
    
    //Metados especiais
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int id){
        this.idade = id;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String PintoOuPrequito){
        this.sexo = PintoOuPrequito;
    }

   
    public String DetalhesPessoais() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

 
    
    
}
