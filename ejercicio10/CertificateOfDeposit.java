/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;
import java.util.GregorianCalendar;
/**
 *
 * @author ARCHV
 */
public class CertificateOfDeposit {
    private GregorianCalendar dateIssue;
    private GregorianCalendar dateMaturity;
    private Integer number;
    private String lastName;
    private double balance;

    public GregorianCalendar getDateIssue() {
        return dateIssue;
    }

    public void setDateIssue(GregorianCalendar dateIssue) {
        this.dateIssue = dateIssue;
    }

    public GregorianCalendar getDateMaturity() {
        return dateMaturity;
    }

    public void setDateMaturity(GregorianCalendar dateMaturity) {
        this.dateMaturity = dateMaturity;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
 
}
