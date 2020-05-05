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
       //Adicionandos valoar aos atributos
       c1.modelo = "Bic cristall";
       c1.cor = "Azul";
       //c1.ponta = 0.5f;
       c1.carga = 80;
       //c1.tampada = false; O atributo é privado!
       c1.tampar();
       c1.status();
       c1.rabiscar();
        
     
        
    }
    
}
