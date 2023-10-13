/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

/**
 *
 * @author mattia.srednik
 */
public class Condominio {

    private String nome, indirizzo;
    private Appartamento appartamenti[];

    public Condominio(String nome, String indirizzo, Appartamento[] appartamenti) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.appartamenti = appartamenti;
    }

    public Condominio(Condominio cond) {
        this.nome = cond.nome;
        this.indirizzo = cond.indirizzo;
        this.appartamenti = cond.appartamenti;
    }

    public String proprietarioMaxMill() {
        int temp = 0;
        String proprietario = "";
        for (int i = 0; i < appartamenti.length; i++) {
            if (appartamenti[i].getMillesimi() > temp) {
                temp = appartamenti[i].getMillesimi();
                proprietario = appartamenti[i].getProprietario();
            }
        }

        return proprietario;
    }
    
    

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
