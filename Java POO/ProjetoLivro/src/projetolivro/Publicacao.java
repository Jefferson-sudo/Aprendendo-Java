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
public interface Publicacao {
    public void abrir();
    public void fechar();
    public void folear(int pagina);
    public void avacarPag();
    public void voltarPag();
    
}
