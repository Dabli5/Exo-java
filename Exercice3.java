package Td1;
import java.time.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez saisir la date au format jj-mm-aaaa: ");
        String date= sc.nextLine();
        String[] split =date.split("-");
        if(split.length==3){
            int jour = Integer.parseInt(split[0]);
            int mois = Integer.parseInt(split[1]);
            int annee = Integer.parseInt(split[2]);
            if (mois == 2 && jour > 29) {
                System.out.println("Erreur nombre de mois!!!");
            } else if (mois <= 12 && mois > 0) {
                if (jour < 0 || jour > 31) {
                    System.out.println("Erreur nombre de jour");
                } else {
                    System.out.println("Date correcte");
                }
            }
        }else{
            System.out.println("Erreur de format");
        }
        
         
    }
}