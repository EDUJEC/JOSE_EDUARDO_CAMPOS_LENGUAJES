/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionarios;

/**
 *
 * @author T-102
 */
public class Opcion {
    
        private String Titulo;
        private boolean correcta;

    public Opcion(String Titulo, boolean correcta) {
        this.Titulo = Titulo;
        this.correcta = correcta;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Opcion(String Titulo, Boolean correcta) {
        this.Titulo = Titulo;
        this.correcta = correcta;
    }

    public Boolean getCorrecta() {
        return correcta;
    }

    public void setCorrecta(Boolean correcta) {
        this.correcta = correcta;
    }
        

    
}
