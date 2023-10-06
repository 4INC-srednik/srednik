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
public class Prova {
    public static void main(String[] args) {
        Tavolo[] t = new Tavolo[2];
        t[0] = new Tavolo(12, 4, 3, true);
        t[1] = new Tavolo(9, 2, 2, false);
        
        Ristorante r1 = new Ristorante(t, 15);
        
        Tavolo t3 = new Tavolo(5, 6, 5, true);
        
        r1.addTavolo(t3);
        
        System.out.println(t[2].getCapienza());
    }
}
