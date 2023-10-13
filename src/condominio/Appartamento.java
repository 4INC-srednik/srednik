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
public class Appartamento {

    private int num, millesimi;
    private String proprietario;

    public Appartamento(int num, int millesimi, String proprietario) {
        this.num = num;
        this.millesimi = millesimi;
        this.proprietario = proprietario;
    }

    public Appartamento(Appartamento app) {
        this.num = app.num;
        this.millesimi = app.millesimi;
        this.proprietario = app.proprietario;
    }

    public int getNum() {
        return num;
    }

    public int getMillesimi() {
        return millesimi;
    }

    public String getProprietario() {
        return proprietario;
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
