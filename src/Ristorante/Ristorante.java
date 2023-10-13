/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;
public class Ristorante {
    private int totSale;
    private int saleOccupate;
    private Sala[] sale;

    public Ristorante(Sala[] sale) {
        this.sale = new Sala [sale.length];
        for(int i = 0; i<sale.length; i++)
            this.sale[i] = new Sala (sale[i]);
        this.totSale = this.sale.length;
        this.saleOccupate = this.totSale;
    }
    
    private int cercaSala(int numSala){
        int indice = 0;
        while(indice < totSale&& sale[indice].getNumSala() != numSala)
            indice++;
        return indice;
    }
    
    public boolean siediti(int numTav, int numSala){
        return sale[cercaSala(numSala)].siediti(numTav);
    }
    
    public boolean alzati(int numTav, int numSala){
        return sale[cercaSala(numSala)].alzati(numTav);
    }
     
    public int totPosti(int numSala){
        return sale[cercaSala(numSala)].totPosti();
    }
    
    public int totPersoneSedute(int numSala){
        return sale[cercaSala(numSala)].totPersoneSedute();
    }
    
    public boolean prenota(int persone, int numSala){
        return sale[cercaSala(numSala)].prenota(persone);
    }
    
    public boolean disdici(int numTav, int numSala){
        return sale[cercaSala(numSala)].disdici(numTav);
    }
    
    public boolean addTav(Tavolo t,int numSala){
        return sale[cercaSala(numSala)].addTav(t);
    }    
}

