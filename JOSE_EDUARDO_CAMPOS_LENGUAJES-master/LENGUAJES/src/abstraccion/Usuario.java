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
public class Usuario {
     private float Peso;
     private float Altura;

//constructor por defecto 
     
    public Usuario(float Peso, float Altura) {
        this.Peso = Peso;
        this.Altura = Altura;
    }
        
 //constructor 2 otorgandole valor a la variable

    public Usuario(float Peso){
        
        Peso = 87;
        Altura = 1.73f;
        
       Altura = 1.73f;
       Peso = 89;
    }

    
     //constructor 3 otorgandole valor a la variable

    public Usuario(){
        
        Peso = 73;
        Altura = 1.73f;
 
    }

    
    public float getPeso() {
        return Peso;
    }

    public void setPeso(float peso) {
        this.Peso = Peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }


    

}
