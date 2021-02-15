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
public class TestSandwich {
    public static void main(String[] args) {
        Bread pan =  new Bread ("Baguette",23.4);
        SandwichFilling huevo = new SandwichFilling("Con huevo",34.4);
        Sandwich sandwich = new Sandwich (pan,huevo);
        
        System.out.println(pan.getBreadType());
        System.out.println(pan.getCalories());
        System.out.println(huevo.getFillingType());
        System.out.println(huevo.getCalories());
    }
}
