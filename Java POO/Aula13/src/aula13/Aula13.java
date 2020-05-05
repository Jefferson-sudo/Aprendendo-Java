/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author jefferson
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lobo x = new Lobo();
        Cachorro c = new Cachorro();
        /*
        x.setNome("Lobo");
        System.out.println(x.getNome());
        x.emitirSom();*/
        
        c.setNome("Bob");
        System.out.println(c.getNome());
        c.emitirSom();
        c.reagir(11, 45);
        c.reagir(19, 00);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
        
    }
    
}
