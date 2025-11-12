/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;
import Armes.Arme;

/**
 *
 * @author alexa
 */
public class Baton extends Arme {


    int Age;

    public Baton(String nom, int niveauAttaque, int Age) {
        super(nom, niveauAttaque);
        if (Age >= 0 && Age <= 100)/*le "&&" trouvé grâce à chatgpt*/ {
            this.Age = Age;
        } else {
            this.Age = 100;
        }
    }
}
