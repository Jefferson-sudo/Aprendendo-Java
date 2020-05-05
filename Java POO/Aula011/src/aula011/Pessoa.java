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
public abstract class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    //Metados
    @Override
    public String toString() {
        return "--------Detalhes---------" + "\nnome = " + nome + "\nidade = " + idade + " anos " + "\nsexo = " + sexo;
    }

    public void fazerAnive() {
        this.idade++;
    }

    //metados especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String se) {
        this.sexo = se;
    }
}
