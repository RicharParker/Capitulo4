/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem2;

/**
 *
 * @author ARCHV
 */
public class Rental {
    public final static Integer minutesHour = 60;
    public final static Integer pricexHour = 40;
    
    private String contract;
    private Integer minutes;
    private Integer hours;
    private Integer extraMinutes;
    private Integer price;

    public Rental(String contract, Integer minutes) {
        this.contract = contract;
        this.minutes = minutes;
        this.hours= minutes/60;
        this.extraMinutes=minutes %60;
        this.price= (this.hours * 40) + (this.extraMinutes / 40) + (this.extraMinutes % 40);
    }

    
    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
        this.hours= minutes/60;
        this.extraMinutes=minutes %60;
        this.price= (this.hours * 40) + (this.extraMinutes / 40) + (this.extraMinutes % 40);
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getExtraMinutes() {
        return extraMinutes;
    }

    public void setExtraMinutes(Integer extraMinutes) {
        this.extraMinutes = extraMinutes;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    
}
