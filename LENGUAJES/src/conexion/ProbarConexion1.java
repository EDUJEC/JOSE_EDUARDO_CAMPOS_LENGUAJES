/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;

/**
 *
 * @author T-102
 */
public class ProbarConexion1 {
    //kotlin jetbrens compilador online kotlinlang.org
    public static void main (String[] args){
     
        Connection con=null;   
        
    try{
        
    con =    Conexion.conectarse("root", "");
                System.out.println("Te conectaste !!");
    //Aqui vienen queris de mysql
    
     System.out.println("Teconectaste muy bien !!!!!");

     //Caso especial del SELECT
     //Paso 1 generar una consulta(query)
     
     Statement st = con.createStatement();
     ResultSet rs = st.executeQuery("select * from tablita");
    
    }catch(ClassNotFoundException e){
        System.out.println("Nos se cargo bien el driver");
    }catch(SQLException e){
        System.out.println("Un error de SQL "+e.getMessage());
    }finally{
        
         try {
             if (con!=null)con.close();           
             System.out.println("Ya se cerro todo");
         } catch (SQLException ex) {
         }
    }
    }
}
