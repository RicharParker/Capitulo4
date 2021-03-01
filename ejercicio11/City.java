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
public class City {
    private String capital;
    private Integer capPopulation;

    public City(String capital, Integer population) {
        this.capital = capital;
        this.capPopulation = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Integer getPopulation() {
        return capPopulation;
    }

    public void setPopulation(Integer population) {
        this.capPopulation = population;
    }
    
}
