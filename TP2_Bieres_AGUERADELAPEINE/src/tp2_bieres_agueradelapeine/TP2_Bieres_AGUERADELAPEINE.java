/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_agueradelapeine;

/**
 *
 * De façon analogue, créez une seconde bière :  « Leffe », 6.6 degrés, de « Abbaye de Leffe » et affichez 
l’étiquette.
 * @author alexa
 */
public class TP2_Bieres_AGUERADELAPEINE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere();
        uneBiere.nom = "Cuvée des trolls";
        uneBiere.degreAlcool = (float) 7.0;
        uneBiere.lireEtiquette();
        BouteilleBiere deuxBiere= new BouteilleBiere();
        deuxBiere.nom=" Leffe";
        deuxBiere.degreAlcool=(float)6.6;
        deuxBiere.brasserie="Abbaye de Leffe";
        System.out.println(deuxBiere);
    }

}
