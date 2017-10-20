/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-102
 */
public class GeneradorUsuario {
 
    public static void main(String[] args) {
        
        //Vamos a generar 5 Usuarios

        Usuario u1 = new Usuario();
        u1.setEdad(23);
        u1.setEmail("otro@gmail.com");
        u1.setNombre("Ana");
        
        Usuario u2 = new Usuario();
        u2.setEdad(16);
        u2.setEmail("otro1@gmail.com");
        u2.setNombre("Eduardo");
        
        Usuario u3 = new Usuario();
        u3.setEdad(25);
        u3.setEmail("otro3@gmail.com");
        u3.setNombre("Jose");
        
        Usuario u4 = new Usuario();
        u4.setEdad(15);
        u4.setEmail("otro4@gmail.com");
        u4.setNombre("Eduardo");
        
        Usuario u5 = new Usuario();
        u5.setEdad(20);
        u5.setEmail("otro5@gmail.com");
        u5.setNombre("Contreras");
    
        //Generar un arreglo mutable
        
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
        
        //Vamos a interrarlo para ver los nombres
        
        for(Usuario u : usuarios){
            
            System.out.println("Nombre:"+u.getNombre());
       
        }
        
    }
    
}
