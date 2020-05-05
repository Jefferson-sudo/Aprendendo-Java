/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author jefferson
 */
public class ProjetoYouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Curso POO");
        v[1] = new Video("Sniper American");
        v[2] = new Video("Onde esta segunda? ");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 19, "M","JJJjjjj");
        g[1] = new Gafanhoto("Creuza", 21,"F", "Crreuxa");
        
       Visualizacao [] vis = new Visualizacao[5];
       vis[0] = new Visualizacao(g[0], v[2]);
       vis[0].avaliar();
       System.out.println(vis[0].toString());
       
       vis[1] = new Visualizacao(g[0], v[1]);
       vis[0].avaliar(87.0f);
       System.out.println(vis[0].toString());

    }
    
}
