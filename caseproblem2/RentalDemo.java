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
public class RentalDemo {
    public static void main(String[] args) {
        Rental silla = new Rental(" silla", 60);
        System.out.println(silla.getContract());
        System.out.println(silla.getPrice());
    }
}
