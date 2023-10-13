/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;

public class Sala {
    private int capienzaTav;
    private int totTav;
    private int numSala;
    private Tavolo[] tavoli;
    
    public Sala(Sala s){
        this.tavoli = s.tavoli;
        this.totTav = s.tavoli.length;
        this.capienzaTav = s.totTav;
        this.numSala = s.numSala;
    }

    public Sala(Tavolo[] t, int numSala) {
        tavoli=new Tavolo[t.length];
        for(int i = 0; i < t.length; i++){
            tavoli[i] = new Tavolo(t[i]);
        }
        this.numSala=numSala;
        this.totTav = t.length;
        this.capienzaTav = this.totTav;
    }

    public int getCapienzaTav() {
        return capienzaTav;
    }

    public int getNumSala() {
        return numSala;
    }

    public int getTotTav() {
        return totTav;
    }
    
    private int cercaTav(int numTav){
        int indice = 0;
        while(indice < totTav && tavoli[indice].getNumTav() != numTav)
            indice++;
        return indice;
    }
    
    public boolean siediti(int numTav){
        return tavoli[cercaTav(numTav)].siediti();
    }
    
    public boolean alzati(int numTav){
        return tavoli[cercaTav(numTav)].alzati();
    }
     
    public int totPosti(){
        int ris = 0;
        for(int i = 0; i < totTav; i++)
            ris += tavoli[i].getCapienza();
        return ris;
    }
    
    public int totPersoneSedute(){
        int ris = 0;
        for(int i = 0; i < totTav; i++)
            ris += tavoli[i].getNumPers();
        return ris;
    }
    
    public boolean prenota(int persone){
        boolean ris = false;
        int indice = 0;
        while(indice < totTav && !tavoli[indice].prenota(persone))
            indice++;
        if(indice < totTav)
            ris = true;
        return ris;
    }
    
    public boolean disdici(int numTav){
        return tavoli[cercaTav(numTav)].disdici();
    }
    
    public boolean addTav(Tavolo t){
        boolean ris = false;
        if(totTav<capienzaTav){
            tavoli[totTav] = new Tavolo(t);
            totTav++;
            ris = true;
        }
        return ris;
    }
}
