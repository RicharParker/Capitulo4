/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

/**
 *
 * @author ARCHV
 */
public class Die {
   private Integer numero;
   
   
   public void lanzar(){
       this.numero = ((int)(Math.random() * 100) % 6+1); 
   }

    public Die() {
        this.lanzar();
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
   
}
