/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

import gamezone1.Die;

/**
 *
 * @author ARCHV
 */
public class FiveDice {
    private Die [] dados;

    public FiveDice(){
        this.dados =  new Die[5];
        for (int i = 0; i < 5; i++) {
            this.dados[i]= new Die();
        }       
    }    
    
    public void imprimir(){
        for (int i = 0; i < 5; i++) {
            System.out.println(this.dados[i].getNumero());
        }
    }
    
    public void lanzar(){
        for (int i = 0; i < 5; i++) {
            this.dados[i].lanzar();
        }
        
    }
    public void evaluar(){
       Integer contador = 0;
       Integer minimo = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (this.dados[j].getNumero()==1) {
                    contador ++;
                }
            }
            if (contador>=minimo) {
                minimo=contador;
            }contador =0;
        }

    }
    
}

