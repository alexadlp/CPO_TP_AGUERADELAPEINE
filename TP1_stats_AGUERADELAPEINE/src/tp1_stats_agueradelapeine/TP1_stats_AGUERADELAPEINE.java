/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_agueradelapeine;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class TP1_stats_AGUERADELAPEINE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        sc = new Scanner(System.in);
        int[] de = new int[6];
        Random generateurAleat = new Random();
        System.out.println("Combien de lancers voulez-vous effectuer ?");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int tirage = generateurAleat.nextInt(6);
            de[tirage]++;
        }
        

        System.out.println("\nRésultat des lancers :");
        for (int i = 0; i < de.length; i++) {
            double pourcentage;
            pourcentage = (de[i]*100)/m;
            System.out.println("Face " + (i + 1) + " : "+ pourcentage +" %");
        }

        sc.close();
    }
}
