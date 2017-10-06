/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referenciados;

/**
 *
 * @author T-102
 */
import abstraccion.Usuario;


public class prueba2 {
    
    public static void main(String[] args) {
     
        //REFERENCIADOS
        
        /* Todos los referenciados pertenecen a una clase
         Senecesita uno o mas primitivos para definirlos */
        
        String nombre = "Jose Eduardo";
        String otro = new  String("wero");
        Usuario u = new Usuario();
        
        u.setAltura(1.78f);
        u.setPeso(71);
        
        
        
    }
}
