/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author jefferson
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 18, "M");
        p[1] = new Pessoa("Amanda", 21, "F");

        l[0] = new Livro("Aprendendo Java", "Jefferson", 300, p[0]);
        l[1] = new Livro("Programação Orientada a Obejtos", "Carlos Duarte", 400,p[1]);
        l[2] = new Livro("Metodologia Científica", "Silva Dias", 250,p[0]);
        l[0].abrir();
        l[0].folear(200);
        System.out.println(l[0].detahes());
    }

}
