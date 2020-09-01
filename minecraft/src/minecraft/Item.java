/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minecraft;

/**
 *
 * @author td796033
 */
public class Item {
    private String nom;
    
    private Recette recette;
    
    public Item(String nom) {
        this.nom = nom;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public void setRecette(Recette recette) {
        this.recette = recette;
    }
    
    public Item[] getRecette() {
        return this.recette.getItems();
    }
}
