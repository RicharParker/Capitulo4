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
public class TestBloodData {
    public static void main(String[] args) {
        BloodData test1 = new BloodData();
        System.out.println("Tipo de sangre: "+test1.getBloodType());
        System.out.println("Factor rh: "+ test1.getRh());
        
        BloodData test2 = new BloodData("AB",'+');
        System.out.println("Tipo de sangre: "+ test2.getBloodType());
        System.out.println("Factor rh: "+test2.getRh());
    }
}
