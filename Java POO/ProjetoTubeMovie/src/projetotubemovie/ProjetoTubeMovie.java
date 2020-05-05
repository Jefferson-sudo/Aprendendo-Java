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
public class ProjetoTubeMovie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de Poo");
        v[1] = new Video("Aula 2 java Poo");
        v[2] = new Video("Video Aula");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jefferson", 19, "M", "login");
        g[1] = new Gafanhoto("Cleusa", 22, "F", "SenhoLogin");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[1].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());

    
    }

}
