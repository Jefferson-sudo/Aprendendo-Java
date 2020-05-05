/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosaula02;

/**
 *
 * @author jefferson
 */
public class ExerciciosAula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Celular moto = new Celular();
        moto.cor = "preto";
        moto.marca = "Motorola";
        moto.tela = 5.5f;
        moto.modelo = "Moto E4";
        
        //chamando metados
        moto.desligar();
        moto.atualizar();
        moto.status();
    }
    
}
