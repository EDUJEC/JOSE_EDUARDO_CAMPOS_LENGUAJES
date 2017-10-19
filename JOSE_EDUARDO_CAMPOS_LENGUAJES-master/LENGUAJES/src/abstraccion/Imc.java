/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-102
 */
public class Imc {
    Usuario U;
    String resultado;
    
    public String calcular(){
       float mivalor = U.getPeso() / (U.getAltura()*U.getAltura());
       resultado = "Tu imc es " + mivalor;
       return resultado;
    }
   
    
}
