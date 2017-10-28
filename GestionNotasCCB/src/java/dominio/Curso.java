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
public class Curso extends CursoDTO {
    
    public void crear(CursoDTO curso){
        
    }
    public void ingresarEst(dominio.persona.Estudiante estudiante){
         this.getEstudiante().add(estudiante);
        
    }
    public void eliminarEst(dominio.persona.Estudiante estudiante) {
        this.getEstudiante().remove(estudiante);
       
        
    }
    public void asignarDocen (dominio.persona.Docente docente){
        this.setDocente(docente);
    }
    public void agregarMateria(Materia materia){
        this.getMaterias().add(materia);
    }
}
