/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author jefferson
 */
public class ControleRemoto implements Controlador { //classe ControleRemoto -> implementa  os metados obstratos Controlador
    //ATRIBUTOS

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //METADOS ESPECIAIS
    public ControleRemoto() {//Metado construtor
        this.volume = 50;
        this.ligado = true;
        this.tocando = true;
    }

    private  int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    // METADOS OBSTRATOS PARA ENCAPSULAMENTO

    @Override
    public void ligar() {
        if(!(this.getLigado())){
            this.setLigado(true);
        }else{
            System.out.println("Ação não permitida. O aparelho já esta ligado!");
        }
    }

    @Override
    public void desligar() {
        if(this.getLigado()){
            this.setLigado(false);
        }else{
            System.out.println("O aparelho ja se encontra desligado!");
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------MENU----------");
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("||");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu ...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Não é possivel aumentar o volume com o aparelho desligado");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Não é possivel diminuir o volume com o aparelho desligado");
        }
    }

    @Override
    public void ligarMundo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }

    }

    @Override
    public void desligarMundo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && this.getTocando() == false) {
            this.setTocando(true);
        }else{
            System.out.println("Não consegui reproduzir ");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }else{
            System.out.println("Não consegui reproduzir. Certifique-se se o aparelho esta ligado");
        }
    }

}
