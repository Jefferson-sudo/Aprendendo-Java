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
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave v1 = new Ave();
        
       Canguru canguru = new Canguru();
       Cachorro cao = new Cachorro();
       Cobra cobra = new Cobra();
       Tartaruga tataruga = new Tartaruga();
       GoldFish goldFish = new GoldFish();
       Arara  arara = new Arara ();
       
       canguru.locomover();
       cao.locomover();
       cao.emitirSom();
       canguru.emitirSom();
       cobra.emitirSom();
    
    }

}
