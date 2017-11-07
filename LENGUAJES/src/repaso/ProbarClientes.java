/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author T-102
 */
public class ProbarClientes {
    public static void main(String[] args) {
        
        GeneradorClientes objeto = new GeneradorClientes();
        
        for(Cliente c:objeto.generarClientes()){
            
            System.out.println("Nombre: "+c.getNombre()+" Edad: "+c.getEdad());
            System.out.println("Direccion: ");
            System.out.println("Calle:"+ c.getDireccion().getCalle());
            System.out.println("Colonia:"+ c.getDireccion().getColonia());
            System.out.println("CP:"+ c.getDireccion().getCp());
            System.out.println("Municipio:"+ c.getDireccion().getMunicipio());
            
        }
        
    }
    
}
