/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mr Demba Ndiaye
 */
import java.util.Scanner; 
public class Exo1 {
     public static void main(String[] args) {
        Scanner clavier= new Scanner(System.in);
        System.out.println("Veuillez entrer une année ");
        int annee= clavier.nextInt();
        while(annee<0){
            System.out.println("Veuillez entrer une année");
            annee= clavier.nextInt();
        }
        
        if (annee%4==0 && annee%4!=0){
            System.out.println("l'année "+annee+ "est bisextile");
        }else{
            System.out.println("l'année "+annee+  " n'est pas bisextile");
        }

    }
}
   