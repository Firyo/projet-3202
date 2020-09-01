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
public class Resultat {
    private Item item;
    private int nb;
    
    public Resultat(Item item, int nb) {
        this.item = item;
        this.nb = nb;
    }
    
    public Item getItem() {
        return this.item;
    }
    
    public int getNb() {
        return this.nb;
    }
}
