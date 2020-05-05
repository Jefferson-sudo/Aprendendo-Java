/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05a;

/**
 *
 * @author jefferson
 */
public class Aula05a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          ContaBanco p1 = new  ContaBanco();
          p1.setNumConta(111);
          p1.setDono("jubileu");
          p1.abrirConta("cc");
          p1.depositar(100);
          
          
          ContaBanco p2 = new ContaBanco();
          p2.setNumConta(2222);
          p2.setDono("Cleusa");
          
          p2.abrirConta("cp");
          p2.estadoAtual();
          p2.depositar(500);
          p2.sacar(100 );
          p1.estadoAtual();
         
    }
    
}
