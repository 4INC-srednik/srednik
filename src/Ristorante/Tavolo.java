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

    public Tavolo(int numero, int capienza, int personeSedute, Boolean isPrenotato) {
        this.numero = numero;
        this.capienza = capienza;
        this.personeSedute = personeSedute;
        this.isPrenotato = isPrenotato;
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
