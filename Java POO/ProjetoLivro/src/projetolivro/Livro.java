/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author jefferson
 */
public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; //tipo abstrato
    //Metados

    public String detahes() {
        return "Livro{" + "titulo=" + titulo + "\n, autor=" + autor
                + "\n, totPaginas=" + totPaginas + "\n, pagAtual="
                + pagAtual + "\n, aberto=" + aberto + "\n, leitor="
                + leitor.getNome() + '}';
    }

    //Metados especias
    //Construtor 
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    //Gettar e Settar
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Metados abstratos da interface Publicacao
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folear(int p) {
        if(p > this.totPaginas){
        this.pagAtual = 0;
    }else{
            this.pagAtual = p;
        }
        this.pagAtual = p;
    }

    @Override
    public void avacarPag() {
        this.pagAtual += 1;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

}
