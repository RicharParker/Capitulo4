/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;
import java.util.Random;
/**
 *
 * @author ARCHV
 */
public class Matematicas {
    public double cuadrado() {
        int numero = 37;
        return Math.sqrt(numero);
    }
    
    public double coseno(){
        int sin = 300;
        return Math.sin(sin);
    }
    public double seno(){
        int cos = 300;
        return Math.cos(cos);
    }
    
    public double valuefloor(){
       double floor = 22;
       return Math.round(floor);
    }
    
     public double valueceiling(){
      double ceiling = 8;
      return Math.round(ceiling);
     }
     
     public double max (){
      char a ='D';
      Integer b = 71;
      int c = Math.max(a, b);
      return c;
     }
     
     public double aleatorio(){
        double a = Math.random()*20;
        return a;
     }
}
