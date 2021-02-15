/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author ARCHV
 */
public class Sandwich {
    private Bread panes;
    private SandwichFilling tipoPan;

    public Sandwich(Bread panes, SandwichFilling tipoPan) {
        this.panes = panes;
        this.tipoPan = tipoPan;
    }

    public Bread getPanes() {
        return panes;
    }

    public SandwichFilling getTipoPan() {
        return tipoPan;
    }
    
    
    
}
