/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author jefferson
 */
public class Luta {
    //ATRIBUTUOS 
    
    private Lutador desafiado;
    private Lutador desafiante; //Atributos de tipos abstrato
    private int rounds;
    private boolean aprovada;
    //METADOS PULICOS
    
    public void marcarLuta(Lutador l1, Lutador l2){
       if (l1.getCategoria().equals(l2.getCategoria())
               && l1 != l2){
           this.aprovada = true;
           this.desafiado = l1;
           this.desafiante = l2;
       } else{
           this.aprovada = false;
           this.desafiado = null;
           this.desafiante = null;
       }
    
    }
    
    public void Lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO  ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2 
            System.out.println("==================================");
            switch(vencedor){
                case 0://Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1://Desafiado vence
                    System.out.println("Vítoria do "+this.desafiado);
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2://Desafiante vence
                    System.out.println("Vítoria do "+this.desafiante);
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("=================================");
        }else{
            System.out.println("A luta não pode acontecer! ");
        }
   
    }
 //METADOS ESPECIAIS

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
