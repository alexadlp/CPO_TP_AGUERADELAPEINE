/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_agueradelapeine;

/**
 *
 * @author alexa
 */
public class BouteilleBiere {

    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;
    @Override 
public String toString() { 
String chaine_a_retourner; 
chaine_a_retourner = nom + " (" + degreAlcool + " degrés); Ouverte ? ";   
if (ouverte == true ) chaine_a_retourner += "oui" ; 
else chaine_a_retourner += "non" ; 
return chaine_a_retourner ;  
} 

    public boolean decapsuleur() {
        if (!ouverte) {
            ouverte = true;
            System.out.println("Bravo l'alcoolo tu as ouvert la" + nom);
        } else {
            System.out.println("Biere deja ouverte");
        }
        return false;
    }

    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool
                + " degres) \nBrasserie : " + brasserie);
    }
}
