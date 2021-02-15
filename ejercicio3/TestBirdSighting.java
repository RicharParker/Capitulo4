/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author ARCHV
 */
public class TestBirdSighting {
    
    public static void main(String[] args) {
        BirdSighting aves = new BirdSighting();
        System.out.println("Especie de ave: "+aves.getBirds());
        System.out.println("numeros de especies vistas: "+aves.getNumber());
        System.out.println("Dia del año: "+aves.getDayYear());
        
        
        BirdSighting aves2 = new BirdSighting("Guacamaya", 5,24);
        System.out.println("Especie de ave: "+aves2.getBirds());
        System.out.println("numeros de especies vistas: "+aves2.getNumber());
        System.out.println("Dia del año: "+aves2.getDayYear());
        
    }
}
