/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author T-102
 */
public class ProbarConexion {
    
    public class ProbarConexio {
        
     try{
    con=    Conexion.conectarse("root","");
                System.out.println("Te conectaste !!");
    //Aqui vienen queris de mysql
    }catch(ClassNotFoundException e){
    }catch(SQLException e){
    }finally{
    }
    }
}
