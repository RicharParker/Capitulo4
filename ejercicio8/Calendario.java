/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;
import java.util.Calendar;
import java.util.GregorianCalendar; 
/**
 *
 * @author ARCHV
 */
public class Calendario { 
    public static void main(String[] args) 
    {
        Calendar cal = Calendar.getInstance(); 
  
        GregorianCalendar gcal = new GregorianCalendar(); 
      
        System.out.println("Calendar date: "+ cal.getTime()); 

        System.out.print("Gregorian date: "+ gcal.getTime()); 
    } 
} 