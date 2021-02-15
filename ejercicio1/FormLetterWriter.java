/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author ARCHV
 */
public class FormLetterWriter {

    
    public static void lastName (String s){
        
        System.out.println("Dear "+s);
        System.out.println("Thank you for your recent order!");
        
        
    } 
      public static void lastName(String a, String b){
        System.out.println("Dear  " + a + "   " + b );
        System.out.println("Thank you for your recent order!");
    }

        public static void main(String[] args) {
            
            lastName("Angel");
            lastName("Angel", "Ricardo");
            
         
    }  
}
