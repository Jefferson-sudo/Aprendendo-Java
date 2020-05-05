/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbookup;

/**
 *
 * @author jefferson
 */
public class ProjectBookUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p [] = new Pessoa[2]; //Criacao do objeto pessoa como vetro de 2 valores
        Livro l [] = new Livro[5];   //Criacao do objeto livro como vetor de 5 valores
        
        p[0] = new Pessoa("Jefferson", 19, "M");
        
        l[0] = new Livro("Aprendendo Java", "Silva Dias", 300, p[0]);
        System.out.println(l[0].detalhes());
        
    }
    
}
