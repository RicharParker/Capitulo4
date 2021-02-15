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
public class Bread {
    private String breadType;
    private Double calories;
    public final static String MOTTO ="The staff of life";

 

    public Bread(String breadType, Double calories) {
        this.breadType = breadType;
        this.calories = calories;
    } 

    public String getBreadType() {
        return breadType;
    }

    public Double getCalories() {
        return calories;
    }
   
    public String getMOTTO() {
        return MOTTO;
    }
    


}
