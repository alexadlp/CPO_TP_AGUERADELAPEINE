/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_agueradelapeine;

import Armes.Arme;
import Armes.Epee;

/**
 *
 * @author alexa
22. Rajoutez deux classes Magicien et Guerrier héritant de Personnage 
23. Un guerrier peut être à cheval ou non. Un magicien peut être confirmé ou non. Ces 2 paramètres 
seront de type booléen.  
24. Ces deux propriétés précédents doivent être initialisés dans leur constructeur.  
25. Un setter est demandé pour ces 2 propriétés : c’est-à-dire une méthode qui modifie la valeur de 
ces propriétés avec celle passée en paramètres. 
 */
public class Guerrier extends Personnage {
    private boolean cheval;

    public Guerrier(String nom, int niveauVie, boolean cheval) {
        super(nom, niveauVie);
        this.cheval = cheval;
        nbGuerrier++;
    }
   
    protected boolean isArmedePredilection(Arme a){
        return a instanceof Epee;
    }

    @Override
    public String toString() {
        return super.toString() + ", cheval=" + cheval;
    }
 
    @Override
    public void finalize()throws Throwable{
        try{
            nbGuerrier--;
        } finally{
            super.finalize();
        }
    }
    @Override
    protected int calculerDegats(){
        return 30;
    }

    public boolean isCheval() {
        return cheval;
    }
   

}