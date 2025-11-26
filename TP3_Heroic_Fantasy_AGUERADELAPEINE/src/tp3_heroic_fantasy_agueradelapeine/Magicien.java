/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_agueradelapeine;

import Armes.Arme;
import Armes.Baton;

/**
 *
 * @author alexa
 */
public class Magicien extends Personnage {
    private final boolean confirme;

    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
        nbMagicien++;
    }
   
    @Override
    protected boolean isArmedePredilection(Arme a){
        return a instanceof Baton;
    }

    @Override
    public String toString() {
        return super.toString() + ", confirme=" + confirme;
    }
   
    /**
     *
     * @throws Throwable
     */
    @Override
    public void finalize()throws Throwable{
        try{
            nbMagicien--;
        } finally{
            super.finalize();
        }
    }
   
    @Override
    protected int calculerDegats(){
        return 20;
    }

    public boolean isConfirme() {
        return confirme;
    }

    protected boolean isArmedePredilection(Object a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   

}