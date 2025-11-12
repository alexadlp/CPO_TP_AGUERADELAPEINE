/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_agueradelapeine;

import Armes.Baton;
import Armes.Arme;
import Armes.Epee;
import java.util.Vector;

/**
 *
 * @author alexa
 */
public class TP3_Heroic_Fantasy_AGUERADELAPEINE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector<Arme> mesArmes = new Vector<Arme>();

        // TODO code application logic here
        Epee Epee1 = new Epee("Excalibur", 7, 5);
        Epee Epee2 = new Epee("Durandal", 4, 7);
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);
        mesArmes.add(Epee1);
        mesArmes.add(Epee2);
        mesArmes.add(baton1);
        mesArmes.add(baton2);
        System.out.println("Liste des armes :");
        for (int i = 0; i < mesArmes.size(); i++) {
            System.out.println(mesArmes.elementAt(i));
        }
    }
}
