/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author ARCHV
 */
public class TestCertificateOfDeposit {
    public static void main(String[] args) {
        CertificateOfDeposit certificado = new CertificateOfDeposit();
        certificado.setLastName("figueroa");
        certificado.setNumber(23);
        certificado.setBalance(23.45);
        System.out.println(certificado.getLastName());
        System.out.println(certificado.getNumber());
        System.out.println(certificado.getBalance());
    }

}
