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
public class Ristorante {
    private Tavolo tavoli[];
    private int capienzaTavoli;

    public Ristorante(Tavolo[] tavoli, int capienzaTavoli) {
        Tavolo[] copiaTavoli = new Tavolo[tavoli.length];
        for (int i = 0; i<tavoli.length; i++){
            copiaTavoli[i]=tavoli[i];
        }
        this.tavoli = copiaTavoli;
        this.capienzaTavoli = capienzaTavoli;
    }
    
    
    
    public void addTavolo(Tavolo nuovo){
        Tavolo[] copia = new Tavolo[tavoli.length+1];
        for (int i = 0; i<copia.length; i++){
            if (i<tavoli.length){
                copia[i]=tavoli[i];
            }else{
                copia[i] = nuovo;
            }
        }
        tavoli=copia;
    }
    
    
}
