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
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    //metados
    public void pagarMensalidade(){
        System.out.println("Aguarde, efetuando pagamento....");
    }
    
     
    public String Detalhes() {
        return  "matricula = " + matricula + "\ncurso = " + curso;
    }
    //metados especiais
    
    public int getMatricula(){
        return matricula;   
    }
    
    public void setMatricula(int ma){
        this.matricula = ma;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
        
}
