/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author ARCHV
 */
public class Test {
    public static void main(String[] args) {
        State jalisco = new State("Jalisco",9343456,"Guadalajara",1235350);
        System.out.println(jalisco.getNameState());
        System.out.println(jalisco.getPopulation());
        System.out.println(jalisco.getCapital());       
        System.out.println(jalisco.getMostPopolation());
    
    }
    
    
}
