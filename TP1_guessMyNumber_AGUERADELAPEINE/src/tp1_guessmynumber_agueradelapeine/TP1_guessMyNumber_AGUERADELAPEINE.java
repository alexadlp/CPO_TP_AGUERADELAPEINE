/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_agueradelapeine;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class TP1_guessMyNumber_AGUERADELAPEINE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Création d'un générateur de nombres aléatoires
        Random generateurAleat = new Random();
        Scanner sc;
        sc = new Scanner(System.in);
        int nombre1 = generateurAleat.nextInt(101);
        System.out.println("saisir un nombre entier entre 0 et 100 inclus");
        int nombreuti = sc.nextInt();
        int compt = 0;

        if (nombre1 == nombreuti) {
            System.out.println("vous avez gagné");
        } else {
            while (nombre1 != nombreuti) {
                nombreuti = sc.nextInt();
                compt = compt + 1;
                if (nombre1 < nombreuti) {
                    System.out.println("trop grand");
                

                } else if (nombre1 > nombreuti) {
                    System.out.println("trop petit");

                } else {
                    System.out.println("égal");
                      System.out.println("trop grand");
                    System.out.println("Nombres d'essaies:" + compt);
                }

            }

        }
    }
}
