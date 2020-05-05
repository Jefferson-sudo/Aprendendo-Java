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
public class Canguru extends Mamifero {
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    
    public void usarBolda(){
        System.out.println("Usando a bolsa");
    }
}
