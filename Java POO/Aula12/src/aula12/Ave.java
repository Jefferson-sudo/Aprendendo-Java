/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author jefferson
 */
public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voar");
    }

    @Override
    public void alimentar() {
    }

    @Override
    public void emitirSom() {
        System.out.println("Cantar");
    }
    
    public String getCorPena(){
        return corPena;
    }
    public void setCorPena(String CorPena){
        this.corPena = CorPena;
    }
}
