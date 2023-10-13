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
public class Libro {
    private String codice, casaEditrice, autore, annoPubb;

    public Libro(String codice, String casaEditrice, String autore, String annoPubb) {
        this.codice = codice;
        this.casaEditrice = casaEditrice;
        this.autore = autore;
        this.annoPubb = annoPubb;
    }

    public String getAnnoPubb() {
        return annoPubb;
    }

    public String getAutore() {
        return autore;
    }

    public String getCasaEditrice() {
        return casaEditrice;
    }

    public String getCodice() {
        return codice;
    }

    public void setAnnoPubb(String annoPubb) {
        this.annoPubb = annoPubb;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setCasaEditrice(String casaEditrice) {
        this.casaEditrice = casaEditrice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
