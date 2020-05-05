/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author jefferson
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // JOptionPane.showMessageDialog(null, "Olá, Mundo!","Boas Vindas",JOptionPane.INFORMATION_MESSAGE);

        int n;
        int s = 0;
        int npar = 0;
        int nimpar = 0;
        int pcem = 0;
        int m;
        int totvalor = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um numero:<br><em>(Valor 0 interrompe!</em></html>)"));
            s += n;
            if (n % 2 == 0) {
                npar += 1;
            } else {
                nimpar += 1;
            }
            
             if (n > 100) {
                pcem += 1;
            }
            
            totvalor += 1;

        } while (n != 0);
        m = s / totvalor;
        JOptionPane.showMessageDialog(null, "<html><hr>Resultado final</hr><br>-----------------" + "<br>Somátorio dos números. " + s + "<br>Total de valores. " + totvalor + "<br>Total de pares. " + npar + "<br>Total de impares. " + nimpar + "<br>Numeros acima de 100. " + pcem + "<br>Média dos valores " + m);

    }

}
