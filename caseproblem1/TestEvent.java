/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem1;

/**
 *
 * @author ARCHV
 */
public class TestEvent {
    public static void main(String[] args) {
        EventDemo evento = new EventDemo("Fiesta 1", 5);
        System.out.println(evento.getEvent());
        System.out.println(evento.getPrice());
    }
}
