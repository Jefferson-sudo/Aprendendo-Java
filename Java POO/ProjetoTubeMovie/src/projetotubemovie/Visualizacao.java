/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotubemovie;

/**
 *
 * @author jefferson
 */
public class Visualizacao {

    private Gafanhoto espectador;
    private Video filme;

    @Override
    public String toString() {
        return "Visualização ->" + " espectador = " + espectador + ", filme = " + filme;
    }

    public Visualizacao(Gafanhoto espectador, Video firme) {
        this.espectador = espectador;
        this.filme = firme;
        this.espectador.setTotAssistido(this.espectador.getToAssitido() + 1);
        this.filme.setViwes(this.filme.getViwes() + 1);
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){
    int tot = 0;
    if(porc <= 20){
    
    }else if(porc <= 50) {
        tot = 5;
    }else if(porc <= 90){
        tot = 8;
    }else{
        tot = 10;
    }
    this.filme.setAvaliacao(tot);
   }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video firme) {
        this.filme = firme;
    }
}
