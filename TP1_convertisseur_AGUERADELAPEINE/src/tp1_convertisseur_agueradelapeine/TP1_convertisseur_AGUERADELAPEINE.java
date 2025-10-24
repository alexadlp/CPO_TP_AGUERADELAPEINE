/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_agueradelapeine;

import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class TP1_convertisseur_AGUERADELAPEINE {

    /**
     * @param args the command line arguments
     */
    public static double CelciusVersKelvin(double tCelcius) {
        double tKelvin = tCelcius + 273.15;
        return tKelvin;

    }

    public static double CelciusVersFarenheit(double tCelcius) {
        double tFarenheit = tCelcius * (9 / 5) + 32;
        return tFarenheit;
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        double tCelcius = tFarenheit * (5 / 9) - 32;
        return tCelcius;

    }

    public static double KelvinVersFarenheit(double tKelvin) {
        double tFarenheit = (tKelvin - 273.15) * (9 / 5) + 32;
        return tFarenheit;
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        double tKelvin = (tFarenheit - 32) * (5 / 9) + 273.15;
        return tKelvin;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("saisir une valeur");
        Double reel = sc.nextDouble();

        Double Kres;
        System.out.println("Voici la temp");
        Kres = reel + 273.15;
        System.out.println("temps" + Kres);
         */

        System.out.println("Bonjour, saisissez une valeur :");
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

