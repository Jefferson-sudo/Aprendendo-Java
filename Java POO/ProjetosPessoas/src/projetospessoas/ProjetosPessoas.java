/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetospessoas;

/**
 *
 * @author jefferson
 */
public class ProjetosPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Programa pricipal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Jeff");
        p2.setNome("Jefferson");
        p3.setNome("João");
        p4.setNome("Pedro");

        p3.setSexo("M");
        p1.setSexo("M");
        p4.setSexo("F");
        p3.setEspecialidade("Analise projeto e desenvolvimento de softwere");
        p2.setIdade(21);
        p2.setCurso("Analise e desenvolvimento de sistemas");
        p3.setSalario(2500.00f);
        p4.setSetor("Estoque");
        p3.receberAumento(25);
        

        System.out.println(p1.DetalhesPessoais());
        System.out.println(p2.DetalhesPessoais() + "Curso" + p2.getCurso());
        System.out.println(p3.DetalhesPessoais() + "Especialidade" + p3.getEspecialidade() + "Salario = " + p3.getSalario() );
        System.out.println(p4.DetalhesPessoais());
    }

}
