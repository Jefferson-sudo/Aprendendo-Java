/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbookup;

/**
 *
 * @author jefferson
 */
public class Livro implements Publicacao {
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; //Definir tipo abstrato de atributo(Pessoa)

    public String detalhes() {
        return "Livro" + "titulo=" + titulo + ", autor="
                + autor + ", totPaginas=" + totPaginas
                + ", pagAtual=" + pagAtual + ", aberto=" + aberto
                + ", leitor=" + leitor.getNome();
    }

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) { //Construtor
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totalPaginas;
        this.leitor = leitor;
    }

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
    public void folear(int pagina) {//Recebe int pagina como parametro. Deve ser definido esse parametro na interface
        if(pagina > this.totPaginas){
            this.pagAtual = 0;
        }else{
            this.pagAtual = pagina;
        }
        this.pagAtual = pagina;
    }

    @Override
    public void avacarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

}
