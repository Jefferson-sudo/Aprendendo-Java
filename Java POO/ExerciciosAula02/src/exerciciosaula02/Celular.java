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
public class Celular {
    String modelo;
    String cor;
    String marca;
    float peso;
    float tela;
    boolean ligado;
    
    void status(){
        System.out.println("Modela: "+ this.modelo);
        System.out.println("Cor:" + this.cor);
        System.out.println("Marca: "+ this.marca);
        System.out.println("Peso: "+ this.peso);
        System.out.println("T/ tela:"+ this.tela);
        System.out.println("O aparelho esta ligado? "+ this.ligado);
        
    }
    
  void ligar(){
        this.ligado = true;
    }
  
    void desligar(){
        this.ligado = false;
    }
    
    void atualizar(){
        if (this.ligado == false){
            System.out.println("O aparelho não pode  atualizar pois esta desligado. Por favor ligue o aparelho!");
        }else{
            System.out.println("A atualização esta sendo iniciada");
        }
    
    }
    
  
}
