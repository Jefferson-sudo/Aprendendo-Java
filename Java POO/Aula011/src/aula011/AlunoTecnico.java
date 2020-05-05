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
public class AlunoTecnico extends Aluno {

    private int matriculatecnica;

    public void Praticar() {
        System.out.println("O aluno " + getNome() + " esta praticando as tecnicas aprendidas no curso para aperfeiçoalas");
    }

    public int getMatriculaTecnica() {
        return matriculatecnica;
    }

    public void setMatriculaTecnica(int matricula) {
        this.matriculatecnica = matricula;
    }
}
