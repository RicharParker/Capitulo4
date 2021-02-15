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
public class TestBread {
    public static void main(String[] args) {
       Bread prueba1 = new Bread("Baguette", 54.6); 
        System.out.println(prueba1.getBreadType());
        System.out.println(prueba1.getCalories());
        System.out.println(prueba1.getMOTTO());
       
    }
    
}
