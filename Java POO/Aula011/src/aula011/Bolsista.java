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
public class Bolsista extends Aluno {

    private int bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando a bolse de " + getNome() + " aguarde ...");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + " é bolsista! Pagamento facilitado");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

}
