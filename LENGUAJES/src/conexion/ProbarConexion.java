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
public class ProbarConexion {
    //kotlin jetbrens compilador online kotlinlang.org
    public static void main (String[] args){
 
        Connection con=null;   
        
    try{
        
    con =    Conexion.conectarse("root", "");
                System.out.println("Te conectaste !!");
    //Aqui vienen queris de mysql
    
     System.out.println("Teconectaste muy bien !!!!!");
    
     //Condicion que se llama con vamos a genrerar una centencia la cual 
     //es una clase
     //Statement st = con.createStatement();
     //Generamos la tabla
      //  st.execute("create table tablita(id integer primary key, nombre varchar(40))");
      //Caso 1 INSERT
      PreparedStatement st=con.prepareStatement("insert into tablita values(?,?)");
      st.setInt(1,1);
      st.setString(2,"Jose E C");
      st.execute();
      st.close();
      System.out.println("Registro insertado");
     //Tambien se cierran las centencias al igual que las condiciones
     st.close();
       // System.out.println("Tabla generada con exito");
        
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
