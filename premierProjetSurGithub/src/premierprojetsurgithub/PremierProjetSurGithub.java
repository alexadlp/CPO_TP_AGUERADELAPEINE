/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package premierprojetsurgithub;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class PremierProjetSurGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Saisair entier 1 ?");
        int entier1 = sc.nextInt();
        System.out.println("Saisair entier 2 ?");
        int entier2 = sc.nextInt();

        double resultat;

        System.out.println("voici l'addition");
        resultat = entier1 + entier2;
        System.out.println("resulat=" + resultat);

        System.out.println(" voici le produit");
        resultat = entier1 * entier2;
        System.out.println("Résultat = " + resultat);

        System.out.println("voici la difference");
        resultat = entier1 - entier2;
        System.out.println("resulat=" + resultat);

        System.out.println("voici la division");
        if (entier2 != 0) {
            resultat = entier1 / entier2;
            System.out.println("Résultat = " + resultat);
        
           
        }
    }
    }
