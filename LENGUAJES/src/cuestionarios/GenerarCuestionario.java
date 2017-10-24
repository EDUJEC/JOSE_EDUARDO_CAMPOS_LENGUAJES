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
public class GenerarCuestionario {
    
    ArrayList <Pregunta> Generar(){
        
    // Primero generamos el arreglo que contendra la pregunta
    ArrayList <Pregunta> Preguntas = new ArrayList <Pregunta>();
    //Primero generamos cada opcion de la primera pregunta
    
    Opcion Op11 = new Opcion ("Moscu",false);
    Opcion Op21 = new Opcion ("Kiev",false);
    Opcion Op31 = new Opcion ("Helsinki",true);
    Opcion Op41 = new Opcion ("Turin",false);
     
    // Generemos la pregunta
    
    ArrayList <Opcion> Opciones1 = new ArrayList<>();
    
    Opcion.add(Op11);
    Opcion.add(Op21);
    Opcion.add(Op31);
    Opcion.add(Op41);

    Pregunta p1 = new Pregunta ("Capital de Finlandia ", Opciones1);
    Preguntas.add (p1);
    
    }
    
}
