//package Td1;

import java.util.Collections;
import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Combien de valeur voulez vous ajouter: ");
        int n= sc.nextInt();
        int Liste[] = new int[n];
        int i=0;
        while (n>0){
            System.out.println("saisir valeur positive: ");
            int x= sc.nextInt();
            while (x<0){
                System.out.println("saisir valeur correcte: ");
                x = sc.nextInt();
            }
            Liste[i]=x;
            i++;
            n--;
        }
        System.out.println(maxi);
    }
}