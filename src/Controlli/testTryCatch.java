/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlli;

import java.util.Scanner;

/**
 *
 * @author mattia.srednik
 */
public class testTryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        // Parte di codice che viene eseguita sempre
        try {
            //divisione con valori dati dall' utente
            System.out.println("Inserisci il dividendo: ");
            int dividendo = in.nextInt();
            System.out.println("Inserisci il divisore: ");
            int divisore = in.nextInt();

            int divisione = dividendo / divisore;
            System.out.println("Risultato: " + divisione);
            // Parte di codice che viene eseguita solo se si solleva un eccezione di tipo ArithmeticException    
        } catch (ArithmeticException e) {
            // System.err.println("Scritta in rosso")
            System.err.println("Impossibile dividere per 0!");
        }
        /*try {
            //stampa il contenuto di un vettore a partire dalla prima cella
            int[] vett = {1, 2, 3, 4, 5};
            
            for (int i = 0; i < 10; i++){
                System.out.println(vett[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Oltre la lunghezza del vettore!");
        }*/
    }

}
