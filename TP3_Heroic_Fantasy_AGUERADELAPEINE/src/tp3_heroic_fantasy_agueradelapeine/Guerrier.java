/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_agueradelapeine;

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
public class Guerrier  extends Personnage{
    boolean cheval;

    public Guerrier(boolean cheval, String nom, int niveaudevie) {
        super(nom, niveaudevie);
        this.cheval = cheval;
    }
    

   
    
    
}
