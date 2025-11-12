/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author alexa
 */
public class Epee extends Arme {

    int finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        if (finesse >= 0 && finesse <= 100)/*le "&&" trouvé grâce à chatgpt*/ {
            this.finesse = finesse;
        } else {
            this.finesse = 100;
        }
    }
}
