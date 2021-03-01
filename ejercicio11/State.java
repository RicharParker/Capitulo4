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
public class State {
    private String nameState;
    private Integer population;
    private City capital;
    private City mostPopolation;

    public State( String cap, Integer capPopulation, String mostPopulation, Integer numberPopulation) {
        this.nameState = nameState;
        this.population = population;
        mostPopolation = new City(cap,capPopulation);
        capital = new City(mostPopulation,numberPopulation);
    }
    
    
    public String getNameState() {
        return nameState;
    }

    public void setNameState(String nameState) {
        this.nameState = nameState;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public City getMostPopolation() {
        return mostPopolation;
    }

    public void setMostPopolation(City mostPopolation) {
        this.mostPopolation = mostPopolation;
    }
    
    
    
}
