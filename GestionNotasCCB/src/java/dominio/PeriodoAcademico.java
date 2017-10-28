/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Usuario
 */
public class PeriodoAcademico extends PeriodoAcademicoDTO {

    public void abrir(String fecha) {

    }

    public void cerrar(String fecha) {

    }
    
    public void agregarCurso(Curso curso){
        this.getCursos().add(curso);
    }
}
