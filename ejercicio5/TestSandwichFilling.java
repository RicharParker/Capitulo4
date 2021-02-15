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
public class TestSandwichFilling {
    public static void main(String[] args) {
        SandwichFilling sandwich = new SandwichFilling("Con huevo",34.4);
        System.out.println(sandwich.getFillingType());
        System.out.println(sandwich.getCalories());
    }
 
}
