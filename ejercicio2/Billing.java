/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author ARCHV
 */
public class Billing {
    
    public static double computeBill(int a){
        return ((a*.08 + a)) ;
    }
   
    public static double computeBill(int a, int b){
        return ((a*b) + (a*.08 + a)) ;
    }  
    
    public static double computeBill(int a, int b, int c){
        return ((a*b)*(c*.5)+ (a*.08 + a) ) ;
    }  
    public static void main(String[] args) {
      
        System.out.println(computeBill(3));
        System.out.println(computeBill(3,4));
        System.out.println(computeBill(3,4,3));
    }
}
