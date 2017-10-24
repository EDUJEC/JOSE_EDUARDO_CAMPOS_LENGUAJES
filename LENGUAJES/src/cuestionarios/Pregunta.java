/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionarios;

import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class Pregunta {
    
    private String Titulo;
    private ArrayList <Opcion> Opciones;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public ArrayList <Opcion> getOpciones() {
        return Opciones;
    }

    public void setOpciones(ArrayList <Opcion> Opciones) {
        this.Opciones = Opciones;
    }
    
}
