/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author jefferson
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criando objeto Caneta c1
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        //Chamando metados
        c1.tampar();
        c1.rabiscar();
        c1.status();
        
        //Criação do objeto C2
        Caneta c2 = new Caneta();
        c2.modelo = "Compactor";
        c2.cor = "vermelha";
        
        //chamando metados
        c2.destampar();
        c2.rabiscar();
        c2.status();
        
    }
    
}
