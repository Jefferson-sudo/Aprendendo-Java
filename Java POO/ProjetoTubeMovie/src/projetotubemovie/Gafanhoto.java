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
public class Gafanhoto extends Pessoa {

    private String login;
    private int totAssistido;
    
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    public void viuMaisUm() {
        this.totAssistido++;
    }
    
    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login = login;
    }
    
    public int getToAssitido(){
        return totAssistido;
    }
    public void setTotAssistido(int tot){
        this.totAssistido = tot;
    }

    @Override
    protected void ganharExperience() {
        this.experience = 0b0;
    }
}

