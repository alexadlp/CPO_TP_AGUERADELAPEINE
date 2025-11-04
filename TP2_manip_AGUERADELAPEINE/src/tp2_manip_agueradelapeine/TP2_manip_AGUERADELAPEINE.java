/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_agueradelapeine;

/**
 *
 * @author alexa
 */
public class TP2_manip_AGUERADELAPEINE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        Tartiflette assietteinv= assiette1;
        assiette1=assiette2;
        assiette2=assietteinv;
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        Moussaka[] tabMoussaka = new Moussaka[10];

        // Pour chaque case du tableau, on crée une nouvelle Moussaka
        for (int i = 0; i < tabMoussaka.length; i++) {
            tabMoussaka[i] = new Moussaka(100 + i * 10); // par exemple, calories différentes
        }

        // Vérification : affichage des calories de chaque Moussaka
        for (int i = 0; i < tabMoussaka.length; i++) {
            System.out.println("Moussaka n°" + i + " : " + tabMoussaka[i].nbCalories + " calories");
        }
    }
}
