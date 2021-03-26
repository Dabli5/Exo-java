/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mr Demba Ndiaye
 * Exercice 2 

  Saisir une année et un mois 
  puis determiner le nombre de jour de ce mois
  dans l'année

    1- pas de classe de java 
    2- Faire avec les classes Java 

 */
import java.util.Scanner;
import java.time.Year;
import java.time.Month;
public class Exo2 {
    public static void main(String[] args) {
        Scanner de= new Scanner(System.in);
            System.out.println("Veuillez entrer un mois ");
            String mois=de.nextLine();
            int i= Integer.parseInt(mois);
            while(i<0 | i>12){
                System.out.println("Veuillez entrer un mois ");
                break;
            }
            System.out.println("Veuillez entrer l'annee ");
            String annee = de.nextLine(); 
            int j= Integer.parseInt(annee);
            while (j<0){
                System.out.println("Veuillez entrer l'annee "); 
                break;
            }
            System.out.println(Month.of(i).length(Year.isLeap(j)));
    }    
}
