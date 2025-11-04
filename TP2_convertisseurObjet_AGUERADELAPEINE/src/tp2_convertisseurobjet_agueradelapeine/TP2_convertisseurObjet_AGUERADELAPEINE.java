/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_agueradelapeine;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class TP2_convertisseurObjet_AGUERADELAPEINE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur unconv= new Convertisseur();
       /* unconv.CelciusVersFarenheit(15);
        unconv.CelciusVersKelvin(45);
        unconv.FarenheitVersKelvin(78);
        System.out.println(unconv);
        */System.out.println("Bonjour, saisissez une valeur :");
        Scanner sc;
        sc = new Scanner(System.in);
        double valeur = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Celsius vers Fahrenheit");
        System.out.println("4) De Fahrenheit vers Celsius");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");

        System.out.println("Entrez votre choix (1 à 6) :");
        int choix = sc.nextInt();

        double resultat;

        switch (choix) {
            case 1 -> {
                resultat = valeur + 273.15;
                System.out.println(valeur + " degrés Celsius est égal à " + resultat + " degrés Kelvin");
            }

            case 2 -> {
                resultat = valeur - 273.15;
                System.out.println(valeur + " degrés Kelvin est égal à " + resultat + " degrés Celsius");
            }

            case 3 -> {
                resultat = (valeur * 9 / 5) + 32;
                System.out.println(valeur + " degrés Celsius est égal à " + resultat + " degrés Fahrenheit");
            }

            case 4 -> {
                resultat = (valeur - 32) * 5 / 9;
                System.out.println(valeur + " degrés Fahrenheit est égal à " + resultat + " degrés Celsius");
            }

            case 5 -> {
                resultat = (valeur - 273.15) * 9 / 5 + 32;
                System.out.println(valeur + " degrés Kelvin est égal à " + resultat + " degrés Fahrenheit");
            }

            case 6 -> {
                resultat = (valeur - 32) * 5 / 9 + 273.15;
                System.out.println(valeur + " degrés Fahrenheit est égal à " + resultat + " degrés Kelvin");
            }

            default ->
                System.out.println("Erreur : choix invalide !");
        }        
    }
    
}
