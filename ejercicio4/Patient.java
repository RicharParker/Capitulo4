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
public class Patient {
    private int id;
    private int age;
    private BloodData patientBlood;
    
    public Patient(){
        this.id = 01;
        this.age = 23 ;
        this.patientBlood = new BloodData("O",'+');
        }

    public Patient(int id, int age, String a, char c) {
        this.id = id;
        this.age = age;
        this.patientBlood = patientBlood;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BloodData getPatientBlood() {
        return patientBlood;
    }

    public void setPatientBlood(BloodData patientBlood) {
        this.patientBlood = patientBlood;
    }
    
    
    }

