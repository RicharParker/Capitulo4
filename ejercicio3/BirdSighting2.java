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
public class BirdSighting2 {
    private String birds;// especie de ave
    private int number; // numero de avistamientos
    private int dayYear; // dia del año

    public BirdSighting2(String birds, int number, int dayYear) {
        this.birds = birds;
        this.number = number;
        this.dayYear = dayYear;
    }

    public String getBirds() {
        return birds;
    }

    public int getNumber() {
        return number;
    }

    public int getDayYear() {
        return dayYear;
    }
    
   
}
