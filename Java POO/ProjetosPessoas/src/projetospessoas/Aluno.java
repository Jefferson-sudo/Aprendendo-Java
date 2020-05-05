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
public class Aluno extends Pessoa { //Herança de metados e atributos da classe Pessoa

    private int matricula;
    private String curso;

    public void cancelMatri() {
        System.out.println("Matricula será cancelada! ");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matri) {
        this.matricula = matri;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curs) {
        this.curso = curs;
    }

  
}
