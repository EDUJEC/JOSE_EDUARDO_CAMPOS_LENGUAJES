/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class GeneradorClientes {
    
    public ArrayList<Cliente> generarClientes(){
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        Direccion d1 = new Direccion("Rio panuco","La presa",55400,"Ecatepec");
        Direccion d2 = new Direccion("Rio colorado","San cristobal",55450,"Metepec");
        Direccion d3 = new Direccion("Rio americas","La esperansa",55409,"Victoria");
        
        Cliente cl11= new Cliente("Jose Eduardo",22,"Jose@gmail.com",d1);
        Cliente cl21= new Cliente("Jesus Atonal",20,"Jesus@gmail.com",d2);
        Cliente cl31= new Cliente("Uriel David",22,"Uriel@gmail.com",d3);
        
        clientes.add (cl11);
        clientes.add (cl21);
        clientes.add (cl31);
        
        return clientes;
    }
    
}
