/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author ARCHV
 */
public class BloodData {
    private String bloodType;
    private char rh;
    
    public BloodData(){
        bloodType="O";
        rh = '+';
    }
    public BloodData(String bloodType, char Rh) {
        this.bloodType = bloodType;
        this.rh = rh;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setRh(char Rh) {
        this.rh = Rh;
    }
    
    public String getBloodType() {
        return bloodType;
    }

    public char getRh() {
        return rh;
    }
    
}
