/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author alexa
 * 1. Toute arme possède un nom et un niveau d’attaque (un entier <=100).  
2. On doit pouvoir initialiser ses 2 paramètres à la création de l’arme.  
3. On doit pouvoir connaître le niveau d’attaque.  
4. On doit pouvoir visualiser (dans la console, par exemple) le nom et le niveau (redéfinir la méthode 
toString).  
 On doit pouvoir avoir accès au nom de l’arme.  
 6 classe sera déclarée abstraite avec le mot clé abstract : ceci empeche la classe d’être 
instanciée, c’est-à-dire de créer des objets directement de cette classe. Cela n’a en effet pas de 
sens de créer des obets qui soient « seulement » de type Arme ; Ils sont forcément de type Epee 
ou Baton 
 */
public abstract class Arme {

    String nom;
    int niveau_attaque;

    public Arme(int niveau_attaque, String nom) {
        if (niveau_attaque < 0 || niveau_attaque > 100) {
            System.out.println("Erreur, la valeur de l'attaque doit etre comprise entre 0 et 100");
        }
        this.niveau_attaque = niveau_attaque;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauAttaque() {
        return niveau_attaque;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niveau d'attaque=" + niveau_attaque + '}';
    }

}
