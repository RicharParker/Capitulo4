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
public class BirdSighting {
    
    private String birds;// especie de ave
    private int number; // numero de avistamientos
    private int dayYear; // dia del año
    
    public BirdSighting(){
        this.birds ="Codorniz";
        this.number = 3;
        this.dayYear =30;
    }
            
    public BirdSighting(String birds, int number, int dayYear) {
        this.birds = birds;
        this.number = number;
        this.dayYear = dayYear;
    }
      

       
    public String getBirds() {
        return birds;
    }

    public void setBirds(String birds) {
        this.birds = birds;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDayYear() {
        return dayYear;
    }

    public void setDayYear(int dayYear) {
        this.dayYear = dayYear;
    }

  
    
   
        
    }
    

