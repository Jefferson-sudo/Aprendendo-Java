/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula011;

/**
 *
 * @author jefferson
 */
public class Aula011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Visitante v1 = new Visitante();
        v1.setIdade(78);
        v1.setNome("Jurema Cudi Cheque");
        v1.setSexo("Female");
        System.out.println(v1.toString());*/

        Aluno aluno1 = new Aluno();
       
        aluno1.setNome("Jefferson mateus da silva dias");
        aluno1.setIdade(19);
        aluno1.setMatricula(22114115);
        aluno1.setSexo("M");
        aluno1.setCurso("Analise e desenvolvimento de sistemas");
        System.out.println(aluno1.toString() + "\n"+aluno1.Detalhes());
        aluno1.pagarMensalidade();

        
        Bolsista b1 = new Bolsista();
        
        b1.setNome("Icaro");
        b1.setMatricula(1375224);
        b1.setCurso("Engenharia do petroléo");
        b1.setBolsa(1415);
        b1.setSexo("M");
        System.out.println(b1.toString()+"\n"+b1.Detalhes());
        b1.pagarMensalidade();
        
    }

}
