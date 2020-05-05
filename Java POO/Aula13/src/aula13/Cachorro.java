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
public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println("AU! AU! AU! AU!");
    }

    public void reagir(String frase) {
        if ("Toma comida".equals(frase) || "Olá".equals(frase) || "Oi meu amor".equals(frase)) {
            System.out.println("Abanar e Latir");
            this.emitirSom();
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar o rabo");
        } else if (hora >= 18) {
            System.out.println("Ignora");
        } else {
            System.out.println("Abanar e Latir");
            this.emitirSom();
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Abanar e Latir");
            this.emitirSom();
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                this.emitirSom();
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
