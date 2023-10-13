/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author mattia.srednik
 */
public class Biblioteca {
    private Libro libri[];
    private int dimL, dimF;

    public Biblioteca(Libro[] libri) {//da sistemare
        this.libri = libri;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }  
}
