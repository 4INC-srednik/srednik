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
public class ProdottoTest {

    public static void main(String[] args) {

        Prodotto p = new Prodotto(10, 4, 30, 10, "pane","0123414555655");

        System.out.println(p.stampa());
        System.out.println(p.prezzoIvato());
        System.out.println(p.pesoLordo());
        System.out.println(p.codice());

    }

}

