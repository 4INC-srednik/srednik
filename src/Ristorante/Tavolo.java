/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ristorante;

/**
 *
 * @author mattia.srednik
 */
public class Tavolo {
    private int numero, capienza, personeSedute;
    private Boolean isPrenotato;

    public Tavolo(int numero, int capienza) {
        this.numero = numero;
        this.capienza = capienza;
       
    }
    public Tavolo(Tavolo t) {
        this.numero = t.numero;
        this.capienza = t.capienza;
      
    }

    @Override
    public String toString() {
        return "Tavolo{" + "numero=" + numero + ", capienza=" + capienza + ", personeSedute=" + personeSedute + ", isPrenotato=" + isPrenotato + '}';
    }

    public int getCapienza() {
        return capienza;
    }

    public int getNumero() {
        return numero;
    }

    public int getPersoneSedute() {
        return personeSedute;
    }

    public Boolean getIsPrenotato() {
        return isPrenotato;
    }
    
    
}
