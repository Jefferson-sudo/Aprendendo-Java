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
public class Video implements AcoesVideo {

    private String titulo;
    private int avaliacao;
    private int viwes;
    private int curtidas;
    private boolean reproduzindo;

    //Metado construtor
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.reproduzindo = false;
        this.curtidas = 0;
        this.viwes = 0;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.avaliacao + avaliacao) / this.viwes;
        
        this.avaliacao =  nova;
    }

    public int getViwes() {
        return viwes;
    }

    public void setViwes(int viwes) {
        this.viwes = viwes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return "Titulo : " + titulo + "\nAvaliacao : " + avaliacao + "\nViwes : " + viwes + "\nCurtidas : " + curtidas + "\nReproduzindo : " + reproduzindo;
    }

}
