/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minecraft;

import java.util.HashMap;

/**
 *
 * @author td796033
 */
public class Recette {
    
    private Item[] items = new Item[9]; // Tableau de 9 cases (Comme sur Minecraft)
    
    private Resultat resultat;
    
    private HashMap<Item,Integer> nbItems = new HashMap();
    
    public Recette(Item[] items, Item resultat, int nombre) {
        this.items = items;
        this.resultat = new Resultat(resultat,nombre);
        this.resultat.getItem().setRecette(this);
        this.calculNbItems();
    }
    
    public Item[] getItems() {
        return this.items;
    }
    
    public void calculNbItems() {
        for (Item i : items) {
            if (nbItems.get(i)!=null) {
                this.nbItems.put(i, nbItems.get(i)+1);
            }
            else {
                this.nbItems.put(i, 1);
            }           
        }              
    }
    
    public HashMap getNbItems() {
         return this.nbItems;
    }
}
