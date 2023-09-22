/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srednik;

/**
 *
 * @author mattia.srednik
 */
public class Azienda {
    private String nomeGruppo;
    private String sedeLegale;
    private Supermercato[] supermercati;
    
    public Azienda{
        private String nomeGruppo;
        private String sedeLegale;
        private Supermercati = copia(supermercati);
    }

    private Supermercato[] copia(Supermercato[] arrayDaCopiare){
        Supermercato[] temp = new Supermercato[arrayDaCopiare.lenght];
        for(int i = 0; i < arrayDaCopiare.lenght; i++){
            temp[i] = arrayDaCopiare[i];
        }
    return temp;
    }
    
    public void addProd(Prodotto[] pAdd, int indice){
        supermercati[indice].addProd(pAdd);
    }
    
}
