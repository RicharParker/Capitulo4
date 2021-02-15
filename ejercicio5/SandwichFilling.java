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
public class SandwichFilling {
    private String fillingType;
    private Double calories;

    public SandwichFilling(String fillingType, Double calories) {
        this.fillingType = fillingType;
        this.calories = calories;
    }

    public String getFillingType() {
        return fillingType;
    }

    public Double getCalories() {
        return calories;
    }
    
}
