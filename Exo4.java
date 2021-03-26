
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mr Demba Ndiaye
 * Exercice 4
  Saisir une date puis determiner la date suivante puis la date precedente 
    1- pas de classe de java 
    2- Faire avec les classes Java 

 */
public class Exo4 {
    public static void main(String[] args){
        Scanner k= new Scanner(System.in);
        System.out.println("Veuillez entrer un jour ");
        String jour=k.nextline();
        int i =integer.parseInt(jour);
        while(i<0 | i>31){
            System.out.println("Veuillez entrer un jour ");
        }
        System.out.println("Veuillez entrer un mois");
        String mois=k.nextLine();
        int j=integer.parseInt(mois);
        while(j<0 | j>12){
            System.out.println("Veuillez entrer un jour ");
        }
        System.out.println("Veuillez entrer une annee");
        String annee=k.nextLine();
        int l=integer.parseInt(annee);
        while(l<0){
            System.out.println("Veuillez entrer une annee ");
        }
        
                
}
