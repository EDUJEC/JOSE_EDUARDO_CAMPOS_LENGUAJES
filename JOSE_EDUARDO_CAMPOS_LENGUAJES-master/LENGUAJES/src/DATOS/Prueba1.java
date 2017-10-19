/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

/**
 *
 * @author T-102
 */
public class Prueba1 {
    
    public static void main(String[] args) {
        
        //Probaremos los tipos de datos integrales
        byte b = 2; // del -128 al 127
        short s = 2;
        int i = 2;
        long l = 2;
        
        // Las siguientes lineas van a marcar error 
        // Errores de casting
        //b = s;  //  b < s    Error de promocion
        b = (byte) s;  //  b < s    Correccion de Error de promocion
        s = b;  //  s > b    Correcta promocion
        i = s;  //  i > s
        l = s;  //  l > s
        s = (short ) l;  //  s < l
        b = (byte) i;  //  b < i
        
        // Algo chistoso con los flotantes
        
        float f = 2.0f;      // un entero es un int si se le coloca un decimal es double 
                             // la f castea el dato correctamente
        double d = 2.0;
        
        
        /// Boolean
        boolean b1 = true;
        boolean b2 = false;
        
        // Tipo caracter
        
        char algo = 'h';
        char otro = ' ';
        
    }
}
