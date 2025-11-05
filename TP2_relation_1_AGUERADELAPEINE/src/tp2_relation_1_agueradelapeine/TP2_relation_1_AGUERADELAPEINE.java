/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_agueradelapeine;

/**
 *
 * @author alexa
 */
public class TP2_relation_1_AGUERADELAPEINE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Veyron", "Bugatti", 127);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

      
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        
        System.out.println("Liste des voitures disponibles :");
        System.out.println(uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);

        
        System.out.println("\n--- Attribution des voitures ---");
        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(uneAutreClio);

        reno.ajouter_voiture(une2008);
        reno.ajouter_voiture(uneMicra);

    
        System.out.println("\n--- Résumé des propriétaires ---");
        System.out.println(bob);
        System.out.println(reno);

        
        System.out.println("\n--- Détails des voitures de Bob ---");
        for (int i = 0; i < bob.nbVoitures; i++) {
            System.out.println(bob.liste_voitures[i]);
        }

        System.out.println("\n--- Détails des voitures de Reno ---");
        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println(reno.liste_voitures[i]);
        }
    }    
}
