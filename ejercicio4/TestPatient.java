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
public class TestPatient {
    public static void main(String[] args) {
        Patient test1 = new Patient();
        System.out.println("Identifiacion del paciente: "+test1.getId());        
        System.out.println("Edad del paciente: "+test1.getAge());
        System.out.println("Datos de sanngre: "+test1.getPatientBlood());
        
        Patient test2 = new Patient(01,23,"A",'+');
         System.out.println("Identifiacion del paciente: "+test2.getId());        
        System.out.println("Edad del paciente: "+test2.getAge());
        System.out.println("Datos de sanngre: "+test2.getPatientBlood());
   
    }
}
