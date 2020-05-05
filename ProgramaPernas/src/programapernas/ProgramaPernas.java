/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Jefferson Mateus
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("\nIsso é um(a) ");
        switch (perna){
            case 1:
                tipo = "Saci\n";
                break;
            case 2: 
                tipo = "Bípede\n";
                break;
            case 3:
                tipo = "trípe\n";
                break;
            case 4:
                tipo = "Quadrupede\n";
                break;
            case 6:
                tipo = "Aranha\n";
                break;
            default:
                tipo = "ET né. Quantas pernas essa porra tem meu amigo. Crlh, toma cu porra!\n";
        }
        System.out.println(tipo);
    }
    
}
