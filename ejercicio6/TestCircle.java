/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author ARCHV
 */
public class TestCircle {
    public static void main(String[] args) {
            Circle circulo1 = new Circle();
            circulo1.setRadius(23.4);
            System.out.println(circulo1.diametro());
            circulo1.setRadius(1);
            System.out.println(circulo1.area());
            
    }

    
}
